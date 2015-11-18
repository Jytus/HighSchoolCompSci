
package exerciseseventeen;
import java.util.Scanner;


public class ExerciseSeventeen {

    public static void main(String[] args) {
        
        String password = "pass-word";//sets the password
        Scanner input = new Scanner(System.in);
        
        int incorrectGuesses = 0;//initializes the incorrectGuesses variable
        while(true){//runs until break
            System.out.println("Enter the password: ");//Prompts user for input
            String guess = input.nextLine();//stores input into guess
            if(guess.equals(password)){//does the following if the guess is equal to the secret password
                System.out.println("Welcome!");//prints welcome if the guess is correct and breaks
                break;
            }else{
                incorrectGuesses += 1; //used to count attemps
                System.out.println("The password you entered was incorrect.");//Prompts user for input
                if(incorrectGuesses==3){//prints access denied if the amount of attemps is 3 ans breaks
                    System.out.println("Access denied.");//Prompts user for input
                    break;
                }
            }
        }
    }
    
}
