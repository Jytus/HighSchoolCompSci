/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter3;
import java.util.Scanner;
/**
 *
 * @author kbatterink
 */
public class TempConverter3 {
    static double inputTemp;
    //this is a global variable, it can be used by any method in this class
    
    public static void main(String[] args) {
        String choice;
        //choice is a local variable, it can only be used inside this method
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("F2C - Fahrenheit to Celsius conversion");
        System.out.println("C2F - Celsius to Fahrenheit conversion");
        System.out.println("Enter your choice.");
        
        choice = input.next();
        System.out.println("Please input the tempertature.");
        inputTemp = input.nextDouble();
        
        if(choice.equalsIgnoreCase("f2c")){
            f2c();
            //run fahrenheit to celsius code
        }else if(choice.equalsIgnoreCase("c2f")){
            c2f();
            //run celsius to fahrenheit code
        }else{
            System.out.println("Invalid choice.");
        }
        //when the code runs into a method, it pauses the method it is in,
        // and runs the method until it is done.
        System.out.println("Thank you!");
    }
    
    public static void f2c(){
        //type (void) and name (f2c) of the method
        double cTemp;
        //local variable (only exists in this method)
        cTemp = (5.0/9.0)*(inputTemp-32.0);
        //since cTemp is a double, and we want to do calculations with
        //decimals, we should make our numbers decimal
        System.out.println("The celsius temperature is "+cTemp);
    }
    
    public static void c2f(){
        double fTemp;
        
        fTemp = (9.0/5.0)*inputTemp+32.0;
        
        System.out.println("The Fahrenheit temperature is "+fTemp);
    }
}
