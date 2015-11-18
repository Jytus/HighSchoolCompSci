
package exerciseone;
import java.util.Scanner;
public class Exerciseone {


    public static void main(String[] args) {
        int balance = 0;
        //shows options
        System.out.print("1. Show total in bank.\n2. Add a penny.\n3. Add a nickel.\n4. Add a dime.\n5. Add a quarter.\n6. Take money out of bank.\nEnter 0 to quit\n");
        //runs until option 0 is chosen
        while(true){
            System.out.print("Enter your choice: ");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            //activates different methods for each choice
            switch (choice){ 
                case 1:
                    bankAccount.bankAmount();
                    break;
                case 2:
                    balance = bankAccount.penny();
                    break;
                case 3:
                    balance = bankAccount.nickel();
                    break;
                case 4:
                    balance = bankAccount.dime();
                    break;
                case 5:
                    balance = bankAccount.quarter();
                    break;
                case 6:
                    balance = bankAccount.withdraw();
                    break;
                default:
                    break;
            }
            if (choice == 0){
                break;
            }
        }
    }
 
}
