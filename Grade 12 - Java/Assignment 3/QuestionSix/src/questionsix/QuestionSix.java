
package questionsix;

import java.lang.Math;

//i didn't use the methods the question asked for, this way seemed simpler
public class QuestionSix {
    
    public static void main(String[] args) {
        for(int a = 1;a < 100;a++){//runs the pythagoream method for every possible combination of integers a and b under 100 
            for(int b = 1;b < 100;b++){
                    pythagoream(a,b);   
            }
        }     
    }
    public static void pythagoream(int a,int b){
        double c = Math.sqrt(a*a + b*b);//sets variable c to the square root of a squared plus b squared
        if((c == (int)c) && ((a*a + b*b) == (c*c))){//if c is an integer and a squared plus b squared is equal to c squared, it prints the three in a sentence
            System.out.println(a + " " + b + " " + (int)c);
        }
    }
    
}
