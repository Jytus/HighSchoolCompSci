package exercisenine;
import java.util.Scanner;
public class ExerciseNine {
    //I thought that making seperate methods for each turn was unecessary 
    public static void main(String[] args) {
        int stonePile = (int)((29-16+1)*Math.random()+16);//creates a random number between 15-30 for the size of the ston pile
        while(true){//runs until break
            System.out.print("There are "+stonePile+" stones. How many would you like? ");//displays current number of stones and prompts user to choose the amount of stones to take
            Scanner input = new Scanner(System.in).useDelimiter("\n");
            int stones = input.nextInt();//sets input to variable stones
            int computerStones = drawStones();//uses the drawStones method to pick a number 
            
            if(isValidEntry(stones, stonePile) == false){//if the user's input is not valid, the computer wins and loop breaks
                System.out.println("The computer beats the player!");
                break;
            }
            stonePile -= stones;//removes user's stones requested from the stone pile
            System.out.println("There are "+stonePile+" stones. The computer takes " +computerStones+ " stones.");//displays the result of the computer's turn
            if(isValidEntry(computerStones,stonePile) == false){//if the computers stones requested is not valid, the computer wins and loop breaks
                System.out.println("The player beats the computer!");
                break;
            }
            stonePile -= computerStones;//removes the amount of stones requested by the computer from the pile
        }  
    }
    public static boolean isValidEntry(int stonesRequested, int amountOfStones){//takes the inputs of the stones requested and stones in the pile ad checks if request is valid
        if((stonesRequested < 0)||(stonesRequested > 3)){//prints error and returns false if the number is not 1, 2 or 3
            System.out.print("You must take 1, 2, or 3 stones! ");
            return(false);
        }
        else if(stonesRequested >= amountOfStones){//returns false if more or an equal amount is requested fro the stone pile
            return(false);
        }
        else{//returns true if the input is valid
            return(true);
        }
    }
    public static int drawStones(){//returns random integer between 1-3
        return (int)((3-1+1)*Math.random()+1);  
    }
}
