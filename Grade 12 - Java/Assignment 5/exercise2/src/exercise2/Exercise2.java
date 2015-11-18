package exercise2;
// @author jordandearsley
import java.util.ArrayList;

public class Exercise2 {

    public static void main(String[] args) {
        //initializes arrays 
        int[] index = new int[101];
        int[] generatedNums = new int[101];
        //assigns index numbers to every position in index array
        for(int i = 0;i<index.length;i++){
            index[i] = i;
        }
        //adds the index and the value of its every character together and puts value in the generatedNums ArrayList
        for(int i: index){                       
            int number = index[i];
            //creates an array to store every character of the integer
            ArrayList<Integer> values = new ArrayList<>();           
            //finds  the value of each character and seperately adds it to the array ArrayList
            do{               
               values.add(number % 10);
               //moves onto next unit
               number /= 10;
            } while  (number > 0);
            //used as an empty zeros just in case integer is only one or two values long to avoid an ArrayOutOfBoundsException
            values.add(0);
            values.add(0);
            //adds the values together with the original index value and assigns it to the generatedNums list            
            generatedNums[i] = index[i]+values.get(0)+values.get(1)+values.get(2);                   
        }
        //header
        System.out.println("Index      Generated Number");
        //prints out each row
        for(int i=0;i<101;i++){
            System.out.print(i);           
            //used to determine the amount of spaces between index and generated number
            if (i/100>=1){
                System.out.print("        ");
            }else if (i/10>=1){
                System.out.print("         ");
            }else{
                System.out.print("          ");
            }
            System.out.println(generatedNums[i]);
        }
    }
    
}
