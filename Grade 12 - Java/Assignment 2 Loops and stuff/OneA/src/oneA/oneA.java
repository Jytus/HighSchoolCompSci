package oneA;

import java.util.Scanner;

/**
 *
 * @author jordandearsley
 */
public class oneA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = input.nextInt();//enable input
        int divisibleBy = 0;
        for(int counter = 2; counter<number;counter++){//divides the inputted numbner by every number except for one and itself
        if(number%counter == 0){//if it is divisible by any of those numbers, it adds one to divisibleBy
            divisibleBy += 1;
            }
        }
        
        if((divisibleBy == 0) && (number>1)){//if it is not divisible by any of those numbers and the number is greater than one (one is not prime) it is prime, if it is, it prints prime, if not, it prints not prime
            System.out.println("Prime");    
        }
        else{
            System.out.println("Not Prime");
        } 
    } 
}
