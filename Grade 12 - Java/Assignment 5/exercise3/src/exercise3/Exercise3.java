package exercise3;
// @author jordandearsley

public class Exercise3 {

    public static void main(String[] args) {
        //prints header
        System.out.println("Number   Occurrences");
        //initializes arrays
        int[] index = new int[10];
        int[] occurrences = new int[10];
        //assigns the index values to their corresponding positions in the index array
        //it isn't necessary but it keeps things organized and simple to change
        for(int i = 0;i<10;i++){
            index[i] = i;
        }
        //initializes randomNumber variable for later use
        int randomNumber;
        //finds 500 random numbers and adds one to the corresponding value of each in the occurrences array
        for(int i = 0;i<500;i++){
            randomNumber = (int)(Math.random() * (10 - 0) + 0);
            occurrences[randomNumber] +=1;
        }
        //prints each row
        for(int i = 0; i<10;i++){
            System.out.println(index[i]+"        "+occurrences[i]);
        }
    } 
    
}
