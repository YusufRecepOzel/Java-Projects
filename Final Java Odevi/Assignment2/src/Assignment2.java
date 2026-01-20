import java.util.Scanner;

public class Assignment2 {
    public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
      boolean valid = true;
    System.out.println("--- Welcome to Digital Monster Creation Arena ---");
    System.out.println("");
    System.out.print("Let's create your first monster. Give it a cool name: ");
    String beast = scanner.nextLine();
    int HP = 50; //Health Points
    int AP = 10; // Attack Power
    int DP = 5; // Defense Power
    System.out.println("");
    System.out.print("Now, choose your monster's element. This choice will determine its core strength.\n" 
        + "[1] Fire (Attack-oriented)\n"
        + "[2] Water (Health-oriented)\n"
        + "[3] Earth (Defense-oriented)\n"
        + "Your choice (1-3): ");
    int element = scanner.nextInt();
    String elementname = "";
    if(element == 1){
        elementname = "Fire";
        AP += 5;
    }
    else if(element == 2){
        elementname = "Water";
        HP += 20;
    }
    else if(element == 3){
        elementname = "Earth";
        DP += 10;
    }
    else{
        System.out.println("ERROR: Invalid element choice. Exiting program.");
        valid = false;
    }
    String potentialname = "";
      if (valid) {
    System.out.println("");
    System.out.print("Every monster has a potential. Choose its potential:\n"
        + "[1] Normal (Standard stats)\n"
        + "[2] Rare (Bonus to all stats)\n"
        + "Your choice (1-2): ");
    int potential = scanner.nextInt();
    
    if(potential == 1){
         potentialname = "Normal";
    }
    else if(potential == 2){
         potentialname = "Rare";
        AP += 10;
        HP += 10;
        DP += 10;
    }
    else{
    System.out.println("ERROR: Invalid potential choice. Exiting program.");
              valid = false;
        }
    }
    if (valid) {
    System.out.println("");
    System.out.print("Finally, enter a number between 1 and 10 to influence its destiny: "); 
    int destiny = scanner.nextInt();
          
    if(destiny >= 1 && destiny <= 10){
    if(elementname.equals("Fire")){
        AP += destiny;
    }
    else if(elementname.equals("Water")){
        HP += destiny;
    }
    else if(elementname.equals("Earth")){
        DP += destiny;
        }
    }
    else{
    System.out.println("ERROR: Destiny Number must be between 1 and 10. Exiting program.");
        valid = false;
        }
    }
    if (valid) {
    System.out.println("");
    System.out.println("Excellent choices! Your monster " + beast + " is being created...");
    System.out.println("");
    System.out.println("--- MONSTER PROFILE CARD ---\n"
        + "Name: " + beast + "\n"
        + "Element: " + elementname + "\n"
        + "Potential: " + potentialname + "\n"
        + "\n"
        + "Health Points (HP): " + HP + "\n"
        + "Attack Power (AP): " + AP + "\n"
        + "Defense Power (DP): " + DP + "\n"
        + "----------------------------------");
      }
    int initialHP = HP;
    int initialAP = AP;
    int initialDP = DP;
    int level = 1;
    int initiallevel = level;
    int xpToNextLevel = level * 100;
    int currentXP = 0;
    int week = 1;
    int daycounter = 1;
    System.out.println("--- Now, let's train your new monster! ---");
    System.out.println("");
    System.out.print("How many days would you like to train your monster? ");
    int day = scanner.nextInt();
    System.out.println(" ");
    while (daycounter <= day) {
        System.out.println("-- Training Week " + week + " --");
        System.out.print("Select your training focus for this week:\n"
            + "[1] Focus on Health (Bonus HP on level-up)\n"
            + "[2] Focus on Attack (Bonus AP on level-up)\n"
            + "[3] Focus on Defense (Bonus DP on level-up)\n"
            + "Your choice: ");
        int trainingFocus = scanner.nextInt();
        int lastweekday = week * 7;
        while (daycounter <= lastweekday && daycounter <= day) {
            currentXP += 30;
            System.out.println("Day " + daycounter + "... (XP +30) Total XP: " + currentXP + "/" + xpToNextLevel);
            while (currentXP >= xpToNextLevel) {
                level++;
                System.out.println("*** LEVEL UP! Your monster is now Level " + level + "! ***");
                HP = HP + 10;
                AP = AP + 5;
                DP = DP + 5;
                if(trainingFocus == 1){
                    HP = HP + 5;
                }
                else if(trainingFocus == 2){
                    AP = AP + 5;
                }
                else if(trainingFocus == 3){
                    DP = DP + 5;
                }
                currentXP = currentXP - xpToNextLevel;
                xpToNextLevel = level * 100;
            }
            daycounter++;
        }
        week++;
    }
    System.out.println(" ");
    System.out.println("--- Training Results ---\n+------------------+------------------+\n|   Initial Stats  |    Final Stats   |\n+------------------+------------------+\n| HP: " + initialHP + "           | HP: " + HP + "           |\n| AP: " + initialAP + "           | AP: " + AP + "           |\n| DP: " + initialDP + "           | DP: " + DP + "           |\n| Level: " + initiallevel + "         | Level: " + level + "         |\n+------------------+------------------+\n\n--- The Guardian's Trial Begins! ---");
    int currentMaxHP = HP;
    int GuardianHP = 150;
    int GuardianAP = 35;
    int GuardianDP = 15;
    while(true){
    int damageDealt = AP - GuardianDP;
    if(damageDealt<5){
        damageDealt = 5;
    }
    GuardianHP = GuardianHP - damageDealt;
        System.out.println("> Your monster attacks and deals " + damageDealt + " damage!");
        System.out.println("(Guardian HP: " + Math.max(0, GuardianHP) + "/150)");
    if(GuardianHP<=0){
        System.out.println(" ");
        System.out.println("VICTORY! The Guardian deems your monster worthy. The path to new adventures is now open!");
        break;
    }
    int damageTaken = GuardianAP - DP;
    if(damageTaken<5){
        damageTaken = 5;
    }
    HP = HP - damageTaken;
        System.out.println("> The Stone Guardian attacks and deals " + damageTaken + " damage!");        
        System.out.println("(Your HP: " + Math.max(0, HP) + "/" + currentMaxHP + ")");
    if(HP<=0){
        System.out.println(" ");
        System.out.println("DEFEAT! Your monster has fallen. Return to training to prepare for the trial once more.");
        break;
    }
    }
    scanner.close();
}
}
