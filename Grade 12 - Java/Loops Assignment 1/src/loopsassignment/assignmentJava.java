package loopsassignment;
import java.util.Scanner;//imports required libraries
import java.lang.Math;
public class assignmentJava {
    public static void main(String[] args) {
        int randomNumber = (int)((20-1+1)*Math.random()+1); //generates rando number between 1-20
        Scanner input = new Scanner(System.in).useDelimiter("\n"); //defines input
        int guess = 0;//initializes guess variable
        while(guess !=randomNumber){//loops until the guess the random number
            System.out.println("Enter a number between 1 and 20:");
            guess = input.nextInt();//allows for input
            if(guess>randomNumber){ // Prints too high if the number is lower than the guess
                System.out.println("Too High");
            }
            if(guess<randomNumber){// Prints too low if the number is higher than the guess
                System.out.println("Too Low");
            }
        }
        System.out.println("You win!");
    }
}
