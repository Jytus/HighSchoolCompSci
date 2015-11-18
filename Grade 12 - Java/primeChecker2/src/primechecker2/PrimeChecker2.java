package primechecker2;
import java.util.Scanner;
import java.lang.Math;

public class PrimeChecker2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter a number to check: ");
        int inputNum = input.nextInt();
        /*
         * when we call isPrime we must send an integer value to be checked
         * The method isPrime will return a boolean value which we can use
         * as part of our condition
         */
        if(isPrime(inputNum)){
            System.out.println(inputNum +" is Prime!");
        }else{
            System.out.println(inputNum +" is not prime. It is divisible"
                    + " by " + divisor(inputNum));
        }
    }
    
    public static boolean isPrime(int primeCheck){
        /*
         * this method needs an integer input and returns a boolean.
         * the inputed integer is stored locally as primeCheck in
         * this method.
         * once a return statement is sent, the method is exited.
         */
        if(primeCheck==1){
            return false;
        }else if(primeCheck == 2){
            return true;
        }else if (primeCheck%2==0){
            return false;
        }
        
        for (int i = 3;i<=Math.sqrt(primeCheck);i+=2){
            if(primeCheck%i==0){
                return false;
            }
        }
        return true;
        
    }
    
    public static int divisor(int composite){
        // this methods returns an integer
        if (composite%2==0){
            return 2;
        }
        
        for (int i = 3;i<=Math.sqrt(composite);i+=2){
            if(composite%i==0){
                return i;
            }
        }
        return composite;
    }
}
