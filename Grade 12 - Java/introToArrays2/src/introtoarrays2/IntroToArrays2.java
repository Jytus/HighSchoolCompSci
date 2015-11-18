package introtoarrays2;
/**
 *
 * @author kbatterink
 */
public class IntroToArrays2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nameList[] = new String[15];
        //variabletype nameofvariable[] = new variabletype[size];
        //this array has 15 positions to store strings
        // the positions are [0] to [14]
        nameList[0]="Michael";
        nameList[1]="Ryan";
        nameList[2]="Clement";
        nameList[3]="Daniel";
        nameList[4]="Gavin";
        for(int i = 0; i<=14;i++){
            System.out.println(nameList[i]);
        }
    }
}
