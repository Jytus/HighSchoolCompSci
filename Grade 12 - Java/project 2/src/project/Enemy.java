package project;

//@author jordandearsley

public class Enemy {
    
    //initializes variables
    public static String name;
    public double MAX_HEALTH;
    private static double health;
    private static int level;

    //constructor for a new Enemy object
    public Enemy(int characterLevel){
        name = name();
        level = characterLevel;
        //enemy health increases with character level
        MAX_HEALTH = 3+characterLevel*2;
        health = MAX_HEALTH;
    }  
    
    //picks a random name from a list of pokemon for the enemy name
    public final String name(){
        String names[] = {"Pikachu","Blastoise","Pidgey","Charmander","Bulbasaur"};
        int randomNumber = ((int)(Math.random() * names.length) + 0);
        return names[randomNumber];
    }
    
    //returns the enemy's name
    public String getName(){
        return name;
    }
    
    //returns the enemy's health
    public double getHealth(){
        return health;
    }

    //handles attack on enemy
    public void attack(double characterAttack){
        //subtracts character attack skill from health with a minimum of zero
        if (health-characterAttack>0){
            health -= characterAttack;
        } else {
            health = 0;
        }
        System.out.println("\n"+name+" was attacked!\n");
    }
    
    //handles defence on enemy
    public void defend(){
        //heals enemy an amount based on level without exceeding max health
        if(MAX_HEALTH-health > 0.25*level){
            health +=0.25*level;
        }else{
            health = MAX_HEALTH;
        }
        System.out.println("\n"+name+"'s attack defended!\n");
    }
    
    //prints the enemy's stats
    public void printStats(){
        System.out.println(name);
        System.out.println("Level: "+level);
        System.out.println("Health: "+health+"/"+MAX_HEALTH);        
    }
}
