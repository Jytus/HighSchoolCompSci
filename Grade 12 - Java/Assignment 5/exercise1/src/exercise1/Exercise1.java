package exercise1;
// @author jordandearsley
import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {
        //initializes ArrayLists
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        //initializes randomNumber for later use
        int randomNumber;
        //loops for each row
        for (int rows = 0; rows<25;rows++){
            //assigns a random number between 0 and 99 (inclusively)
            randomNumber = (int)(Math.random() * (100 - 0) + 0);
            //tests if number is even or odd and assigns it to the corresponding ArrayList
            if (randomNumber % 2 == 0){
                evenNumbers.add(randomNumber); //assigns even number to even ArrayList
            } else {
                oddNumbers.add(randomNumber); // assigns odd number to odd ArrayList
            }
        }
        //prints odd heading
        System.out.println("ODD:");        
        //prints every value in the odd array with spaces
        for (int i : oddNumbers) {
            System.out.print(i+" ");
        }
        //prints even heading
        System.out.println("\nEVEN:");
        //prints every value in the even array with spaces
        for (int i : evenNumbers) {
             System.out.print(i+" ");
        }
    }

}
    

