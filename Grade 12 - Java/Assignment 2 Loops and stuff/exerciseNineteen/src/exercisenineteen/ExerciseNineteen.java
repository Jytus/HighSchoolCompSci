
package exercisenineteen;

import java.util.Scanner;


public class ExerciseNineteen {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        String newSentence = sentence.replaceFirst(word+" ", "");
        System.out.println(newSentence);
    }
    
}
