package project;

//@author jordandearsley

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        //creates a new character and uses characterName method to ask the user for the characters name
        Character character = new Character(characterName());
        //prints the new character's stats
        character.getStats();
        //loops until character.gameOver() method is called
        while (true){
            
            int choice = 1;
            //asks user weather to view stats or continue
            //doesn't continue until user specifies to
            while(choice == 1){                
                choice = intInput("Type 1 to view stats or 2 to continue: ");
                character.getStats();
            }
            //creates an Enemy type object and prints it's stats
            Enemy enemy = new Enemy(character.getLevel());
            System.out.println("An enemy is approaching!\n");
            enemy.printStats();
            
            //loops until enemy is defeated
            while(enemy.getHealth()>0){
                //if the user chooses to attack, it runs the attack methods
                if (attackChoice()){
                    enemy.attack(character.getAttackSkill());
                    character.attack(enemy.getHealth());
                //if not, it runs the defend methods
                } else{
                    character.defend();                   
                    enemy.defend();
                }
                //prints stats after every player move
                battleStats(character,enemy);           
            }
            //runs enemyDefeated method after the enemy is defeated           
            enemyDefeated(character, enemy.getName());
        }            
    }

    //handles assigning character name from input
    public static String characterName(){
        String name = stringInput("Enter a character name: ");
        return name;     
    } 

    //simplifies user prompting for integer input 
    public static int intInput(String prompt){
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();   
        return input;
    }
    
    //simplifies user prompting for string input 
    public static String stringInput(String prompt){
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();   
        return input;
    }  
    
    //prints the current character and enemy stats
    public static void battleStats(Character character,Enemy enemy){
        System.out.println(character.getName()+"'s Health: "+character.getHealth()+"/"+character.MAX_HEALTH);
        System.out.println(enemy.getName()+"'s Health: "+enemy.getHealth()+"/"+enemy.MAX_HEALTH);
    }
    
    //adds exp and checks if character has enough exp to level up. Also sends enemy name to exp method for printing
    public static void enemyDefeated(Character character, String enemyName){
        character.exp(25,enemyName);
        if (character.getExp()>=100){
            character.levelUp();
        }
    }
    
    //handles the attack choice
    public static boolean attackChoice(){
        int choice = intInput("\nType 1 to attack or 2 to defend and heal: ");
        return choice == 1;    
    }
}