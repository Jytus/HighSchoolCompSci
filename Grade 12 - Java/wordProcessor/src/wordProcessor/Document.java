package wordProcessor;

//imports necessary libraries
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Document {
    //initializes variables for later use
    private static String fileName;
    private static FileWriter fw;
    
    public Document(String name) throws FileNotFoundException, 
            UnsupportedEncodingException, IOException{
        //sets the filename to the String name inputted
        fileName = name;
    }
    //prints the file to console line for line
    public static void print() throws FileNotFoundException, IOException{
        //creates new BufferedReader for the given file
        BufferedReader br = new BufferedReader(new FileReader("files/"+
                fileName+".txt"));
        //initializes default line content to null
        String line = null;
        //prints until the last line
        while ((line = br.readLine()) != null) {           
            System.out.println(line);
        }
    }
    //writes to file
    public void write(String string) throws IOException{
        //initializes FileWriter for the given file
        fw = new FileWriter("files/"+fileName+".txt");
        //writes the string to the file
        fw.write(string);
        //closes the FileWriter
        fw.close();
    }
    //converts file contents to String
    static String readFile() throws IOException {
            //stores file content as bytes into content[]
            byte[] content = Files.readAllBytes(Paths.get("files/"+
                    fileName+".txt"));
            //returns the byte list as a String
            return new String(content);        
    }
}
