
package exerciseeighteen;

import java.util.Scanner;


public class ExerciseEighteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");//Prompts user for input
        String firstName = input.nextLine();//stores first name into variable
        System.out.println("Enter your middle initial: ");//Prompts user for input
        String middleInitial = input.nextLine();//stores middle name into variable
        System.out.println("Enter your last name: ");//Prompts user for input
        String lastName = input.nextLine();//stores last name into variable
        
        String firstLetter = firstName.substring(0, 1).toLowerCase();//stores the first letter of first name in lowercase into firstLetter variable
        String middleLetter = middleInitial.toLowerCase();//stores middle initial in middleLetter variable inn lower case
        String lastLetter = lastName.substring(0,1).toUpperCase();//stores first letter of Lastname in lastLetter variable in upper case
        
        System.out.println("");//adds a space line
        System.out.println("Your monogram is: "+firstLetter+lastLetter+middleLetter);//Prints the monogram

        
    }
    
}
