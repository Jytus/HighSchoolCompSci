
package exerciseone;
import java.util.Scanner;

public class bankAccount {
    private static int balance;

    public bankAccount(){
        balance = 0;
    }
    
    
    

    
    //prints bank balance in dollars/100
    public static void bankAmount(){
        System.out.println("$"+(double)balance/100);
    }
    //adds one to the bank balance
    public static int penny(){
        balance += 1;
        return balance;
    }
    //adds five to the bank balance
    public static int nickel(){
        balance += 5;
        return balance;
    }
    //adds ten to the bank balance
    public static int dime(){
        balance += 10;
        return balance;
    }
    //adds twenty five to the bank balance
    public static int quarter(){
        balance += 25;
        return balance;
    }
    //withdraws an amount from the bank balance and returns the new balance
    public static int withdraw(){
        Scanner in = new Scanner(System.in);
        System.out.print("Withdraw:");
        double amount = in.nextDouble();
        balance -= amount*100;
        return balance;
    } 
}

