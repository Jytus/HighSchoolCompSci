package wordProcessor;
//imports freeTTS text-to-speech API
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

//imports other required libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Processor {
    //initializes arrayList of Document objects
    private static final ArrayList<Document> files = new ArrayList<>();
    //initializes arrayList of corresponding file names
    private static final ArrayList<String> fileNames = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException, 
            UnsupportedEncodingException, IOException {
        //scans for files that were previously created and adds them to ArrayLists
        scan();
        System.out.println("Welcome to the word processor!\n"
                + "Type 'help' for commands.\n");       
        //runs until quit command   
        command();     
    }
    
    
    public static void command() throws FileNotFoundException, 
            UnsupportedEncodingException, IOException, NullPointerException{
        //runs until quit command
        while(true){
            //prompts user for command and gets user input
            Scanner in = new Scanner(System.in);  
            System.out.print("./command: ");
            String input = in.nextLine();
            
            //initializes command variable as input just in case command does
            //not include filename
            String command = input;
            //initializes the file variable as null by default just in case 
            //command does not include filename
            String file = null;
            
            //tries to split the input into the command and file variables
            try{
                command = input.substring(0,input.lastIndexOf(" "));
                file = input.substring(input.lastIndexOf(" ")+1);
            }catch(StringIndexOutOfBoundsException e){}
            
            //handles user command choice
            switch (command) {
                //prints program commands to user
                case "help":
                    System.out.println("\nnew - makes new file");
                    System.out.println("delete - deletes file");
                    System.out.println("list - lists all files");
                    System.out.println("view - displays file");
                    System.out.println("write - writes/overwrites to file");
                    System.out.println("spellcheck - spellchecks file");
                    System.out.println("say - speaks file");
                    System.out.println("quit - quits program");
                    System.out.println("\nFormat(excluding 'help', 'list' ,and 'quit'):\n|command| |filename|\n");
                    break;
                //creates new file
                case "new":
                    {
                        //searches for file position in ArrayLists
                        int filePos = filePos(file);
                        //if the file is not found,
                        if (filePos==-1){
                            //make a new document associated with a new
                            //.txt file and add it to both arrays
                            Document writer = new Document(file);
                            FileWriter fw = new FileWriter("files/"+file+".txt");
                            fileNames.add(file);
                            files.add(writer);
                            System.out.println(file+" created.");
                        //if file is found,
                        }else{
                            System.out.println("File already exists!");
                        }       
                        break;
                    }
                //deletes given file
                case "delete":
                {
                    //searches for file position in ArrayList
                    int filePos = filePos(file);
                    //if the file is found,
                    if (filePos!=-1){
                        //overwrites the file as a blank(necessary to assign file to variable)
                        File newFile = new File("files/"+file+".txt");
                        //deletes the file
                        newFile.delete();
                        System.out.println("File deleted.");
                        //removes the file from the ArrayLists
                        fileNames.remove(filePos);
                        files.remove(filePos);
                    //if it is not found,
                    }else{
                        System.out.println("File not found.");
                    }       
                    break;
                }
                //displays the file contents
                case "view":
                {
                    //searches for file position in ArrayList
                    int filePos = filePos(file);
                    //if the file exists,
                    if(filePos!=-1){
                        //prints the file associated with the filePos
                        Document.print();
                    //if file does not exist,
                    }else{
                        System.out.println("File not found.");
                    }       
                    break;
                }
                //lists all existing files
                case "list":
                    //prints every string in fileNames ArrayList
                    for (String fileName : fileNames) {
                        System.out.println(fileName);
                }   break;
                //writes user input to file
                case "write":
                {
                    //gets file position in ArrayLists
                    int filePos = filePos(file);
                    //if file exists,
                    if (filePos!=-1){
                        System.out.println("Text: ");
                        String text = in.nextLine();
                        //writes user input variable text to given file
                        (files.get(filePos)).write(text);
                        System.out.println("Text written to "+file);
                    //if file does not exist,
                    }else{                        
                        System.out.println("File not found.");
                }       break;
                    }
                //spellchecks given file
                case "spellcheck":
                {
                    //gets file position in ArrayLists
                    int filePos = filePos(file);
                    //if file exists,
                    if (filePos!=-1){
                        //converts file to String
                        String words = Document.readFile();
                        //runs spellcheck method
                        spellCheck(words);
                    //if file is not found,
                    }else{                       
                        System.out.println("File not found.");
                    }       
                    break;
                }
                //converts file from text to speech
                case "say":
                {
                    //gets file position in ArrayLists
                    int filePos = filePos(file);
                    //if file exists,
                    if (filePos!=-1){
                        //converts file to String
                        String words = Document.readFile();
                        //runs speak method to convert text to speech
                        speak(words);
                    //if file doesn't exist,
                    }else{
                        System.out.println("File not found.");
                    }       
                    break;
                }
                //quits application
                case "quit":
                    //quits
                    System.exit(0);
                //if command doesn't match any given commands,
                default:
                    System.out.println("Command not recognized");
                    break;
            }               
        }
    }
    
    //finds the position of the file in fileNames ArrayList
    //returns -1 if the file is not found
    public static int filePos(String fileName){
        int filePos = -1;
        for(int i=0;i<fileNames.size();i++){
            //checks if the fileName equals the given String value in array
            if(fileNames.get(i).equals(fileName)){
                filePos = i;
                break;
            }
        }
        return filePos;
    }
    
    //spellchecks the given String
    //prints incorrect words 
    public static void spellCheck(String sentence) throws IOException{
        //stores the english language wordlist into dictFile
        byte[] dictFile = Files.readAllBytes(Paths.get("dictionary.txt"));
        //converts dictFile to string
        String dict = new String(dictFile);
        //converts string dict to list
        String[] wordList = dict.split("\n");              
        //converts inputted sentence String into list
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "")
                .toLowerCase().split("\\s+");
        //initiales defualt values
        boolean wordCorrect = false;
        int amountIncorrect = 0;
        //runs for every word in words[]
        for(String i:words){            
            //runs for every word in wordList[]
            for(String j:wordList){
                //if word matches the given word in wordList[] 
                if(i.equals(j)){
                    //breaks if word matches
                    wordCorrect = true;
                    break;
                }else{
                    wordCorrect = false;
                }
            }
            //if the word does not match any words in the wordList,
            if (!wordCorrect){
                System.out.println("Word '"+i+"' incorrect.");
                amountIncorrect++;
            }
        }
        //prints if all the words are correct
        if(amountIncorrect==0){
            System.out.println("Spellcheck Complete, no incorrect words.");
        }
    }
    //scans files/ directtory for .txt files and adds them to ArrayLists on startup
    public static void scan() throws IOException{
        //for each file in the /files/ path,
        Files.walk(Paths.get("files/")).forEach((Path filePath) -> {
            //if the file is a regular file with the extension .txt,
            if ((filePath.toString()).contains(".txt")&&Files
                    .isRegularFile(filePath)) {
                //gets a string from the file name without .txt
                String file =filePath.toString().substring(6, 
                        filePath.toString()
                        .lastIndexOf("."));
                //adds the filename to fileNames array
                fileNames.add(file);
                //initializes newFile as Document type object
                Document newFile = null;
                //tries to set newFile as a new Document and catches exceptions
                try {
                    newFile = new Document(file);
                } catch (UnsupportedEncodingException ex) {
                    Logger.getLogger(Processor.class.getName())
                            .log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Processor.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
                //adds new Document object to files ArrayList
                files.add(newFile);
            }
        });
    }
    //converts text to speech using the FreeTTS API
    public static void speak(String words) throws FileNotFoundException{
        //creates a temporary dummy PrintStream to store unresolved problems
        //with FreeTTS printing error logs to the console
        File file = new File("file.txt");       
        PrintStream ps = new PrintStream(file);
        PrintStream oldOut=System.out;          
        System.setOut(ps);
        //creates new Voice       
        Voice v = VoiceManager.getInstance().getVoice("kevin16"); 
        //allocates memory for the voice (this prints an error to the console by default)
        v.allocate();
        //sets the System.out to the original PrintStream
        System.setOut(oldOut);
        //speaks text to user
        v.speak(words);
    }
}
