package exercisesix;
import java.lang.Math;
import java.util.Scanner;

public class game { 
    //Variables used in class
    private int firstCard;
    private int secondCard;
    private int compCardOne;
    private int compCardTwo;
    private int playerPoints;
    private int compScore;
    //Main Game
    public game(){
        playerPoints = dealToPlayer(); //deals two cards to player
        compCardOne = dealToComp(); //deals the first card to computer
        playerPoints = stayOrHit(playerPoints); //lets player choose to stay or hit
        compScore = compHit(dealToComp2());//deals second card to computer and computer chooses wheather to stay or hit
    }
     
    
    //Methods
    
    //deals random value between 1 and 13 representing different card values
    public int deal(){
        return (int)(Math.random() * (13-1)+1);
    } 
    
    
    //deals two cards to the player and reveals the card types and hand value
    public int dealToPlayer(){
        firstCard = deal();
        secondCard = deal();

        System.out.println("You have a " + cardName(firstCard) + " and a "+ cardName(secondCard));
        int value = cardCount(firstCard,secondCard);
        System.out.println("Your hand has a total value of: " + value);
        return value;
    }
    
    //deals the first card to the computer and reveals it to the player
    public int dealToComp(){
        compCardOne = deal();       
        System.out.println("The computer's first card is: "+cardName(compCardOne));
        return compCardOne;
    }
    
    //after player chooses wheather to hit or stay, this deals the second card to the computer and reveals the card and total hand value to the player
    public int dealToComp2(){
        compCardTwo = deal();
        int compScore = compCardCount(compCardOne, compCardTwo);
        System.out.println("\nThe computer's second card is a "+ cardName(compCardTwo)+ " and its hand has a value of "+ compScore+" points.");
        return compScore;
    }
    
    //gives the player the option of either staying or hitting using a prompt. It recieves the point value of the player, reveals the card, and adds it to the player's hand value.
    public int stayOrHit(int value){
        System.out.print("Type 1 to stay or 2 to hit: ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice == 2){
            value = hit(value);
        }
        System.out.println("and your final card value is: "+value);
        return value;
    }
    
    //If either of the players cards is an ace, it gives the option of setting the point value of the card to 1 or 11 and retruns the final player's hand value.
    public int cardCount(int cardOne, int cardTwo){
        Scanner in = new Scanner(System.in);
        if(cardOne == 1 && cardTwo < 11){
            System.out.print("Would you like to give your first card a value of 1 or 11? ");
            cardOne = in.nextInt();
            
        }
        if(cardTwo == 1 && cardOne < 11){
            System.out.println("Would you like to give your second card a value of 1 or 11?");
            cardTwo = in.nextInt();
        }
        return cardOne+cardTwo;
    }
    
    //in the case that the player's third card is an ace, it gives the option of setting it to either 1 or 11.
    public int cardCount(int card){
        Scanner in = new Scanner(System.in);
        if(card == 1){
            System.out.println("Would you like to give your third card a value of 1 or 11?");
            card = in.nextInt();
        }
        return card;
    }
    
    //used for the computer to determine weather to make an ace's value 1 or 11 and returns the total hand value.
    public int compCardCount(int cardOne, int cardTwo){
        if(cardOne == 1&&cardTwo <= 6){
            cardOne = 11;
        }
        if(cardTwo == 1&&cardOne <= 6){
            cardTwo = 11;
        }
        if((cardOne == 1)&&(cardTwo == 1)){
            cardTwo = 11;
        }
        return cardOne+cardTwo;
    }
    
    //Assignes names to each card value
    public String cardName(int card){
        if ((card >= 2) && (card <= 10)){
            return Integer.toString(card);
        } else {
            switch (card){
                case 1:
                    return "Ace";
                case 11:
                    return "Jack";
                case 12:
                    return "Queen";
                case 13:
                    return "King";
            }
        }
        return "";
    }
    
    //deals a third card to the player and returns the final hand value
    public int hit(int value){
        int thirdCard = cardCount(deal());
        System.out.print("You got a " + cardName(thirdCard)+" ");
        return thirdCard+value;
    }
    
    //if the computer chooses to hit, it deals a card and takes into account weather to choose 1 or 11 as the value of the ace. Then, it returns the total hand value including the third card.
    public int compHit(int value){
        int thirdCard = deal();
        System.out.print("The computer chooses to hit and gets a "+ cardName(thirdCard));
        if((thirdCard == 1) && (value + 11<=21)){
            thirdCard = 11;
        }
        System.out.print(" (" +(value+thirdCard)+" points)");

        return value+thirdCard;
    }
   
    //Determines the winner based on points
    public int winner(int user, int comp){
        if(((user>comp)&&(user<22))||(comp>21)&&(user<22)){
            System.out.println("\n\nYou Win!");
            return 1;      
        } else if ((user<comp)&&(comp<22)||(comp<21)&&(user>22)){
            System.out.println("\n\nYou Lose!");
            return 0;
        } else {
            System.out.println("\n\nIt's a Tie!");
            return -1;
        }
    }
    
    //returns the playerPoints variable for access from other classes
    public int getPlayerPoints(){
        return playerPoints;
    }
    
    //returns the compScore variable for access from other classes
    public int getCompScore(){
        return compScore;
    }
}
