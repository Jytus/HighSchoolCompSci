package questiontwo;
import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");//prompts user for input
        Scanner input = new Scanner(System.in);
        double number = input.nextInt();//stores input into number variable as a double
       
        System.out.print("\nConvert:\n1. Inches to Centimeters    5. Centimeters to Inches\n2. Feet to Centimeters      6. Centimeters to Feet\n3. Yards to Meters          7. Meters to Yards\n4. Miles to Kilometers      8. Kilometers to Miles\n\nEnter you choice: ");//displays options and prompts use for input
        int choice = input.nextInt();//stores choice into choice variable
        System.out.println("");//new line after input
        
        //runs the appropriate method for the choice provided
        if(choice == 1){
            inchesToCentimeters(number);
        }
        if(choice == 2){
            feetToCentimeters(number);
        }
        if(choice == 3){
            yardsToMeters(number);
        }
        if(choice == 4){
            milesToKilometers(number);
        }
        if(choice == 5){
            centimetersToInches(number);
        }
        if(choice == 6){
            centimetersToFeet(number);
        }
        if(choice == 7){
            metersToYards(number);
        }
        if(choice == 8){
            kilometersToMiles(number);
        }
    }
    
    //method accepts the input length and converts it to another unit correponding with the method name and prints result.
    public static void inchesToCentimeters(double length){
        System.out.println(length + " inches equals " + length*2.54 + " centimeters.");
    }
    public static void feetToCentimeters(double length){
        System.out.println(length + " feet equals " + length*30 + " centimeters.");
    }
    public static void yardsToMeters(double length){
        System.out.println(length + " yards equals " + length*0.91 + " meters.");
    }
    public static void milesToKilometers(double length){
        System.out.println(length + " miles equals " + length*1.6 + " kilometers.");
    }
    public static void centimetersToInches(double length){
        System.out.println(length + " centimeters equals " + length/2.54 + " inches.");
    }
    public static void centimetersToFeet(double length){        
        System.out.println(length + " centimeters equals " + length/30 + " feet.");
    }
    public static void metersToYards(double length){
        System.out.println(length + " meters equals " + length/0.91 + " yards.");
    }
    public static void kilometersToMiles(double length){
        System.out.println(length + " kilometers equals " + length/1.6 + " miles.");
    }
}
