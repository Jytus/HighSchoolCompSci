package oneb;

import java.util.Scanner;

public class OneB {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//enable input
        System.out.println("Enter the first number:");
        int numberOne = input.nextInt();//stores first number into variable
        System.out.println("Enter the second number:");
        int numberTwo = input.nextInt();//stores second number into variable
        System.out.println("");
        System.out.println("Prime Numbers:");
        for(int times = numberOne+1; times<numberTwo;times++){//loops through every number between the two numbers
            int divisibleBy = 0;
            for(int counter = 2; counter<times;counter++){//divides inbetween number by every number less than the inbetween number except for one and itself
                if(times%counter == 0){//if it is divisible by any of those numbers, it adds one to divisibleBy
                    divisibleBy += 1;
                }     
            }
           if((divisibleBy == 0)&&(times>1)){//if it is prime and the number is greater than one (one is not prime), it prints the number
                System.out.println(times);
           }
        }
   
    } 
}
