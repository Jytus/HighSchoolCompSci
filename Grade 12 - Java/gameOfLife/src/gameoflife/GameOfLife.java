package gameoflife;
/**
 * @author jordandearsley
 */
import java.util.Scanner;

public class GameOfLife {

    public static void main(String[] args) {
        //creates a blank game with all cells dead
        String[][] game = blankGame();
        //prompts user to either manually or randomly enter coordinates
        System.out.print("Type 1 to begin entering coordinates or type 2\nto randomize coordinates: ");
        //creates scanner for input
        Scanner in = new Scanner(System.in);
        //stores input
        int choice = in.nextInt();
        //randomizes the game
        if (choice == 2){
            game = randomize(game);
        }
        //initializes x and y
        int x;
        int y;
        //prompts user to input x and y coordinates each loop
        while(choice == 1){
            System.out.print("x: ");
            x = in.nextInt();
            System.out.print("y: ");
            y = in.nextInt();
            //sets the indicated cell to be alive starting from the origin 0,0
            game[20-y][x-1] = "O";
            //prompts to either continue entering coordinates or to begin
            System.out.print("Type 1 to continue entering coordinates or \ntype 2 to start: ");
            //stores to choice to determine whether to run the loop again
            choice = in.nextInt();
        }
        //runs until all cells are dead
        while (anyAlive(game)){
            //adds a 1 second delay between every interval
            try {
                Thread.sleep(1000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {}
            //prints the game to user
            printGame(game);
            //generates the next day
            game = generate(game);             
        }
        //tells user when all cells are dead
        System.out.print("All cells are dead!");
    }
    
    //prints the inputted two dimensional string array
    public static void printGame(String[][] game){
        System.out.println();
        for(int i = 0;i<20;i++){
            for(int j = 0; j<20;j++){
                System.out.print(game[i][j]);
            }
            System.out.println();
        }
    }
    
    //determines whether any cells in the inputted array are alive
    public static boolean anyAlive(String[][] game){
        for(int i = 0;i<20;i++){
            for(int j = 0; j<20;j++){
               if(game[i][j]=="O"){
                   return true;
               }
            }
        }
        return false;
    }
    
    //randomizes by a 50/50 chance whether every cell will be alive or dead
    public static String[][] randomize(String[][] game){
        boolean aliveOrDead;
        for(int i = 0;i<20;i++){
            for(int j = 0; j<20;j++){
                aliveOrDead = Math.random() < 0.5;
                if (aliveOrDead == true){
                    game[i][j] = "O";
                } 
            }
        }
        return game;
    }
    
    //creates a two dimensional String array with all blank cells
    public static String[][] blankGame(){
        String[][] blankGame = new String[20][20];
        for(int i = 0;i<20;i++){
            for(int j = 0; j<20;j++){
                blankGame[i][j] = " ";
            }
        }
        return blankGame;
    }       
    
    //previous day is inputted and the next day is outputted
    public static String[][] generate(String[][] previousDay){
        //creates an empty array to represent the next day
        String [][] nextDay = new String[20][20];
  
        //runs for every position in the 20x20 array
        for(int i = 0;i<20;i++){
            for(int j = 0; j<20;j++){
                int neighbours = 0;
                //uses try-catch statements in case of an ArrayIndexOutOfBounds error
                //checks all 8 positions surrounding the cell on the grid and counts how many have alive cells
                try{
                    if(previousDay[i][j-1].compareTo("O")==0){
                        neighbours++;
                    }
                } catch(Exception e){}
                try{
                    if(previousDay[i][j+1].compareTo("O")==0){
                        neighbours++;
                    }
                } catch(Exception e){}
                try{
                    if(previousDay[i+1][j].compareTo("O")==0){
                        neighbours++;
                    } 
                } catch(Exception e){}
                try{
                    if(previousDay[i-1][j].compareTo("O")==0){
                        neighbours++;
                    }
                } catch(Exception e){}
                try{
                    if(previousDay[i+1][j+1].compareTo("O")==0){
                        neighbours++;
                    }
                } catch(Exception e){}
                try{
                    if(previousDay[i-1][j-1].compareTo("O")==0){
                        neighbours++;
                    } 
                } catch(Exception e){}                           
                try{
                    if(previousDay[i-1][j+1].compareTo("O")==0){
                        neighbours++;
                    } 
                } catch(Exception e){}
                try{
                    if(previousDay[i+1][j-1].compareTo("O")==0){
                        neighbours++;
                    }   
                } catch(Exception e){}               
                //determines whether a cell is alive or dead based on its amount of neighbours
                if(previousDay[i][j] == "O"){                    
                    if (neighbours==2||neighbours==3){
                        nextDay[i][j] = "O";
                    } else{
                        nextDay[i][j] = " ";
                    }
                } else if(previousDay[i][j] == " "){
                    if(neighbours==3){
                        nextDay[i][j] = "O";
                    }else{
                        nextDay[i][j] = " ";
                    }
                }  
                
            }
        }
        //returns the generated day
        return nextDay;
     }
    
}
