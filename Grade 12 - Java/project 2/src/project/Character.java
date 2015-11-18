package project;

//@author jordandearsley

public class Character {
    
    //initializes variables
    private final String name;
    private double healthStat;
    private double attackSkill;
    private double defenceSkill;
    private int level;
    private int experience;
    
    //initializes max and min variables
    public final int MAX_HEALTH = 10;
    public final int MIN_HEALTH = 0;
    public int MAX_EXP = 100;

    //constructor for new Character object
    public Character(String mName){
        name = mName;
        healthStat = MAX_HEALTH;
        attackSkill = 1;
        defenceSkill = 1.5;
        level = 1;
        experience = 0;
    }
    
    //returns the name of the Character
    public String getName(){
        return name;
    }
    
    //returns the health of the Character
    public double getHealth(){
        return healthStat;
    }
    
    //returns the attack skill of the Character
    public double getAttackSkill(){
        return attackSkill;
    }
    
    //returns the defence skill of the Character
    public double getDefenceSkill(){
        return defenceSkill;
    }
    
    //returns the level of the Character
    public int getLevel(){
        return level;
    }
    
    //returns the exp of the Character
    public int getExp(){
        return experience;
    }
    
    //adds exp and announces enemy defeat and exp collected
    public void exp(int exp,String enemyName){
        experience +=exp;
        System.out.println("\n"+enemyName+" defeated!\n"+exp+" exp collected.\n");
    }
    
    //handles the user's choice to attack on Character
    public void attack(double enemyHealth){
        //block runs if the enemy doesn't die after attack
        if (enemyHealth > attackSkill){
            //subtracts amount from health depending on defenceSkill
            healthStat -=3/defenceSkill;
            //rounds health stat to 2 decimal places
            healthStat = Math.round(healthStat * 100.0) / 100.0;
        }
        //checks if the character is dead and ends the game if so
        if (healthStat<=0){
            gameOver();
        } 
    }
    
    //handles the users choice to defend on Character
    public void defend(){
        //heals user with a max of 10 health
        if (healthStat<8.5){
        healthStat+=defenceSkill;
        } else {
            healthStat = 10;
        }
    }
    
    //levels the character up
    public void levelUp(){
        //levels up if exp is high enough
        if (experience >= MAX_EXP){
            level += 1;
            attackSkill+=0.5;
            defenceSkill+=0.5;
            MAX_EXP += 25;           
            //adds 2 to health in consideration with the max health
            if (MAX_HEALTH-healthStat < 2){
                healthStat = MAX_HEALTH;
            } else{
                healthStat += 2;
            }
            //resets experience count to zero
            experience = 0;
        }
        //displays the new level to user
        System.out.println("\nLevel Up!\n"+name+" is now level "+level);
    }
    
    //displays the character's stats to the user
    public void getStats(){
        System.out.println("\n"+getName());
        System.out.println("Level: "+getLevel());
        System.out.println("Exp: "+getExp()+"/100");
        System.out.println("Health: "+getHealth()+"/10.0");  
        System.out.println("Attack Skill: "+getAttackSkill());
        System.out.println("Defence/Heal Skill: "+getDefenceSkill()+"\n");  
    }
    
    //prints current level and ends game
    public void gameOver(){
        System.out.println("\nYou Died at level: "+level+"!");
        System.exit(0);
    }
}
