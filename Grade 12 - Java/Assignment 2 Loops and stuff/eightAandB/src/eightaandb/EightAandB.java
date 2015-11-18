package eightaandb;
import java.util.Scanner;//imports required libraries
import java.lang.Math;
public class EightAandB {
    public static void main(String[] args) {
        int randomNumber = (int)((20-1+1)*Math.random()+1); //generates rando number between 1-20
        Scanner input = new Scanner(System.in); //defines input
        int guess = 0;//initializes guess variable
        while(true){//loops until break
            System.out.println("Enter a number between 1 and 20:");
            guess = input.nextInt();//allows for input
            if(guess == randomNumber){
                break;//exits loop when the guess is correct
            }
            System.out.println("Try again.");//prints try again if break does not occur
        }
        System.out.println("You win!");//prints you win after the break occurs when guess is correct
    }
}
