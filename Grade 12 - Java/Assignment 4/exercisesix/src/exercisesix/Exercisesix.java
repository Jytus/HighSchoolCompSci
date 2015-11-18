
package exercisesix;
import java.util.Scanner;

public class Exercisesix {
    public static void main(String[] args) {
        int wins = 0;
        int losses = 0;
        
        //runs until game is ended
        while (true){
            //starts the game
            game Game = new game();
            //winner is determined outside of the game class for the purpose of keeping score
            int winner = Game.winner(Game.getPlayerPoints(), Game.getCompScore());
            //increments wins and losses variable for each win and loss
            switch(winner){
                case 1:
                    wins++;
                case 0:
                    losses++;
            }
            //prints the score and offers option to play again
            System.out.print("The score is "+wins+"/"+losses+"\nPress Enter to Play Again");
            Scanner in = new Scanner(System.in);
            in.nextLine();
            System.out.print("\n");

        }  
    }    
}
