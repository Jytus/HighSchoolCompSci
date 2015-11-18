/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesix;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author jordandearsley
 */
public class ExerciseSix {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");//Prompts user for input
        String number = input.nextLine();//stores the number into the string, number
        int lengthOne = number.length();//sets the length og the number to variable lengthOne
        int sum = 0;//initializes the sum variable
        for(int counter = 0; counter<lengthOne;counter++){//loops through each digit and converts each into a integer then adds the value to the sum variable
            int digit = number.charAt(counter) - 48;
            sum += digit;
        }
        System.out.println("The sum of the digits is: "+ sum);//prints the result into a sentence

    
    
    }
    
}
