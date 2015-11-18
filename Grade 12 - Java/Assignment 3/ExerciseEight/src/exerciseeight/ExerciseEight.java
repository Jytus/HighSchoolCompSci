package exerciseeight;
import java.util.Scanner;

public class ExerciseEight {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    System.out.println("High Low Game\n\nNumbers 1 though 6 are low.\nNumbers 7 though 13 are high.\nYou have 1000 points.\n");//displays game instructions and points
    int points = 1000;
    int tries = 0;
        while(points > 0){//while the player has more than 0 points,
            System.out.print("Enter points to risk: ");//prompts user for input
            int randomNumber = (int)((13-1+1)*Math.random()+1); //generates random number between 1-13
            int pointsRisk = input.nextInt();//stores input into variable
            System.out.print("Enter 1 to predict HIGH, Enter 2 to predict LOW: ");//displays options for high or low
            int highOrLow = input.nextInt();//stores input into variable

            System.out.println("\nNumber is " + randomNumber);//diplays the secret number
            if(((randomNumber > 6) && (highOrLow == 1)) || ((randomNumber < 7) && (highOrLow == 0))){//if the user correctly guesses wheather th number is high or low,
                System.out.println("\nYou win!");
                points += pointsRisk;//adds the points risked to the amount of points if user wins
            }
            else{//if incorrect,
                System.out.println("\nYou lose.");
                points -= pointsRisk;//removes the points risked from the amount of points if user loses
            }
            System.out.println("You now have " + points + " points."); //displays current points
            tries+=1;//adds to the amount of tries
        }
        
        System.out.println("GAME OVER after "+tries+" tries."); //prints game over message and the amount of tries after user runs out of points
    }
}
