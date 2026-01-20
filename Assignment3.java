
public class Assignment3 {
    public static void main(String [] args){
      boolean valid = true;
    System.out.println("--- Welcome to Digital Monster Creation Arena ---");
    System.out.println("");
    System.out.print("Let's create your first monster. Give it a cool name: ");
    String beast = "Pyre";
    int HP = 50; //Health Points
    int AP = 10; // Attack Power
    int DP = 5; // Defense Power
    System.out.println("");
    System.out.print("Now, choose your monster's element. This choice will determine its core strength.\n" 
        + "[1] Fire (Attack-oriented)\n"
        + "[2] Water (Health-oriented)\n"
        + "[3] Earth (Defense-oriented)\n"
        + "Your choice (1-3): ");
    int element = 1;
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
    int potential = 2;
    
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
    int destiny = 10;
          
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
    System.out.println("");
    System.out.println("--- Now, let's train your new monster! ---");
    System.out.println("");
    System.out.print("How many days would you like to train your monster? ");
    int day = 10;
    System.out.println(" ");
    while (daycounter <= day) {
        System.out.println("-- Training Week " + week + " --");
        System.out.print("Select your training focus for this week:\n"
            + "[1] Focus on Health (Bonus HP on level-up)\n"
            + "[2] Focus on Attack (Bonus AP on level-up)\n"
            + "[3] Focus on Defense (Bonus DP on level-up)\n"
            + "Your choice: ");
        int trainingFocus = 3;
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
    System.out.println("--- Training Results ---");
    System.out.println("+------------------+------------------+");
    System.out.println("|   Initial Stats  |    Final Stats   |");
    System.out.println("+------------------+------------------+");
    System.out.printf("| %-16s | %-16s |\n", "HP: " + initialHP, "HP: " + HP);
    System.out.printf("| %-16s | %-16s |\n", "AP: " + initialAP, "AP: " + AP);
    System.out.printf("| %-16s | %-16s |\n", "DP: " + initialDP, "DP: " + DP);
    System.out.printf("| %-16s | %-16s |\n", "Level: " + initiallevel, "Level: " + level);
    System.out.println("+------------------+------------------+");
    System.out.println("\n--- The Guardian's Trial Begins! ---");
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
        System.out.println(" ");
        System.out.println("Two skilled adventurers, Swiftclaw and Ironhide, are impressed by Pyre’s strength and decide to join the team!");
        System.out.println(" ");
        System.out.println("--- TEAM ROSTER INITIALIZED ---");
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
        return;
    }    
    }
    HP = 85; 
    AP = 45; 
    DP = 25;
    String [] teamMemberNames= new String[3];
    int [] teamMemberCurrentHP = new int[3];
    int [] teamMemberMaxHP = new int[3];
    int [] teamMemberAP = new int[3];
    int [] teamMemberDP = new int[3];
    boolean[] teamMemberAlive = new boolean[3];
    initializeTeam(beast,HP,AP,DP,teamMemberNames,teamMemberCurrentHP,teamMemberMaxHP,teamMemberAP,teamMemberDP,teamMemberAlive);
    int [] totalTeamStats = calculateTotalTeamStats(teamMemberCurrentHP , teamMemberAP , teamMemberDP , teamMemberAlive);
    displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);
    System.out.println("--- Exploring Region Index: 0, Scenario Index: 0 ---");
    triggerEvent(0, 0, 1, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
    System.out.println("--- Exploring Region Index: 1, Scenario Index: 1 ---");
    triggerEvent(1, 1, 2, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
    System.out.println("--- Exploring Region Index: 2, Scenario Index: 0 ---");
    triggerEvent(2, 0, 1, teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive);
    boolean alive = checkTeamStatus(teamMemberAlive);
    boolean [] regionsExploredStatus = {true, true, true};
    boolean region = allRegionsExplored(regionsExploredStatus);
    if(region == true && alive == true){
        System.out.println("VICTORY! All regions explored successfully!");
}
    }
    public static void initializeTeam(String monsterName, int monsterHP, int monsterAP, int monsterDP, String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive){
    teamMemberNames[0] = monsterName;
    teamMemberNames[1] = "Swiftclaw";
    teamMemberNames[2] = "Ironhide";
    teamMemberCurrentHP[0] = monsterHP;
    teamMemberCurrentHP[1] = 80;
    teamMemberCurrentHP[2] = 120;
    teamMemberMaxHP[0] = monsterHP;
    teamMemberMaxHP[1] = 80;
    teamMemberMaxHP[2] = 120;
    teamMemberAP[0] = monsterAP;
    teamMemberAP[1] = 40;
    teamMemberAP[2] = 20;
    teamMemberDP[0] = monsterDP;
    teamMemberDP[1] = 10;
    teamMemberDP[2] = 30;
    teamMemberAlive[0] = true;
    teamMemberAlive[1] = true;
    teamMemberAlive[2] = true;      
    }
    public static int[] calculateTotalTeamStats(int[] teamMemberCurrentHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive){
        int totalHP = 0;
        int totalAP = 0;
        int totalDP = 0;
        if(teamMemberAlive[0] == true){
            totalHP = teamMemberCurrentHP[0];
            totalAP = teamMemberAP[0];
            totalDP = teamMemberDP[0];
        }
        if(teamMemberAlive[1] == true){
            totalHP = totalHP + teamMemberCurrentHP[1];
            totalAP = totalAP + teamMemberAP[1];
            totalDP = totalDP + teamMemberDP[1];
        }
        if(teamMemberAlive[2] == true){
            totalHP = totalHP + teamMemberCurrentHP[2];
            totalAP = totalAP + teamMemberAP[2];
            totalDP = totalDP + teamMemberDP[2];
        }
        int[] total ={totalHP , totalAP , totalDP};
        return total;
    }
    public static void displayTeamStats(String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive, int[] totalTeamStats){
        System.out.println("+----------------+-----------+------+------+-------------+");
        System.out.printf("| %-14s | %-9s | %-4s | %-4s | %-11s |%n", "Member", "HP", "AP", "DP", "Status");
        System.out.println("+----------------+-----------+------+------+-------------+");

        for (int i = 0; i < teamMemberNames.length; i++) {
            String condition;
            if (teamMemberAlive[i] == true) {
                condition = "Alive";
            } 
            else
                condition = "Unconscious";
            String hpStr = teamMemberCurrentHP[i] + "/" + teamMemberMaxHP[i];
            System.out.printf("| %-14s | %-9s | %-4d | %-4d | %-11s |%n", 
                teamMemberNames[i], hpStr, teamMemberAP[i], teamMemberDP[i], condition);
        }

        System.out.println("+----------------+-----------+------+------+-------------+");
        System.out.printf("|TOTAL STATS     | HP: %-5d | AP: %-7d | DP: %-8d|", totalTeamStats[0], totalTeamStats[1], totalTeamStats[2]);
        System.out.println("\n+----------------+-----------+------+------+-------------+");
    }
    public static boolean allRegionsExplored(boolean[] regionsExploredStatus){
        for(int i = 0 ; i<3 ; i++){
            if(regionsExploredStatus[i] == false){
                return false;
            }            
        }
        return true;  
    }
    public static void triggerEvent(int regionIndex, int scenarioIndex, int simulatedChoice, String[] teamMemberNames, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, int[] teamMemberAP, int[] teamMemberDP, boolean[] teamMemberAlive){
        int damage = 0;
        
        if(scenarioIndex<0 || scenarioIndex>1){
            scenarioIndex = 0;
        }
        if(simulatedChoice<1 || simulatedChoice>2){
            simulatedChoice = 1;
        }
        if(regionIndex == 0 && scenarioIndex == 0){
            if(simulatedChoice == 1){
                System.out.println("Event: Your team is ambushed by wild monsters.");
                int[] stats = calculateTotalTeamStats(teamMemberCurrentHP, teamMemberAP, teamMemberDP, teamMemberAlive);            
                int totalDP = stats[2];
                damage = 40 - totalDP;
                if(damage < 5){
                   damage = 5; 
                }                    
                applyDamageToTeam(damage, teamMemberCurrentHP, teamMemberDP, teamMemberAlive);
                int targetIMAX = 0;
                int max = Integer.MAX_VALUE;
                for(int i = 0 ; i < teamMemberAlive.length ; i++){
                    if(teamMemberAlive[i] == true){
                        if(teamMemberAP[i] < max){ // KÜÇÜKTÜR işareti ve AP dizisi
                            max = teamMemberAP[i];
                            targetIMAX = i;
                        }
                    }
                }
                teamMemberAP[targetIMAX] += 5;
                System.out.println("Outcome: The team fights back bravely! They take " + damage + " damage in the skirmish. " + teamMemberNames[targetIMAX] + "'s resolve is hardened, increasing its AP by 5.");
                int [] totalTeamStats = calculateTotalTeamStats(teamMemberCurrentHP , teamMemberAP , teamMemberDP , teamMemberAlive);
                displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);
            }
            if(simulatedChoice == 2){
                damage = 15;
                applyDamageToTeam(damage, teamMemberCurrentHP , teamMemberDP, teamMemberAlive);
            }
        }
        if(regionIndex == 0 && scenarioIndex == 1){
            if(simulatedChoice == 1){
                healTeam(20 , teamMemberCurrentHP, teamMemberMaxHP, teamMemberAlive);
                int targetIMIN = 0;
                int min = Integer.MIN_VALUE;
                for(int i = 0 ; i < teamMemberAlive.length ; i++){
                    if(teamMemberAlive[i] == true){
                        if(min < teamMemberDP[i]){
                        min = teamMemberDP[i];
                        targetIMIN = i;
                        }
                    }
                }
                min += 5;
                teamMemberDP[targetIMIN] = min;
            }
            else{
                
            }
        }
        if(regionIndex == 1 && scenarioIndex == 0){
            if(simulatedChoice == 1){
            applyDamageToTeam(30 , teamMemberCurrentHP, teamMemberDP, teamMemberAlive);    
            }
            if(simulatedChoice == 2){
                int target = 0;
                int max = Integer.MAX_VALUE;
                for(int i = 0 ; i< teamMemberAlive.length ; i++){
                    if(teamMemberAlive[i] == true){
                        if(max > teamMemberCurrentHP[i]){
                            max = teamMemberCurrentHP[i];
                            target = i;
                        }
                    }
                }
                max -= 10;
                teamMemberCurrentHP[target] = max;
                if(teamMemberCurrentHP[target] < 0){
                    teamMemberAlive[target] = false;
                }
            }
        }
        if(regionIndex == 1 && scenarioIndex == 1){
            if(simulatedChoice == 1){
                for(int i = 0 ; i < 3 ; i++){
                    if(teamMemberAlive[i]){
                        teamMemberAP[i] += 5;
                    }
                }
            }
            if(simulatedChoice == 2){
                System.out.println("You discover a glowing crystal vein in the cave wall.");                
                for(int i = 0 ; i < 3 ; i++){
                    if(teamMemberAlive[i] == true){
                        teamMemberCurrentHP[i] += 10;
                        teamMemberMaxHP[i] += 10;
                    }
                }
                System.out.println("The team harvests the crystals, feeling a surge of vitality.Their maximum and current HP increase!");
                int [] totalTeamStats = calculateTotalTeamStats(teamMemberCurrentHP , teamMemberAP , teamMemberDP , teamMemberAlive);
                displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);
            }
        }
        if(regionIndex== 2 && scenarioIndex == 0){
            if(simulatedChoice == 1){
                System.out.println("You find an ancient mechanism on a pressure plate.");
                        applyDamageToTeam(20,teamMemberCurrentHP,teamMemberDP,teamMemberAlive);
                System.out.println("It’s a trap! The mechanism releases a burst of negative energy, damaging the team.");
                int [] totalTeamStats = calculateTotalTeamStats(teamMemberCurrentHP , teamMemberAP , teamMemberDP , teamMemberAlive);
                displayTeamStats(teamMemberNames, teamMemberCurrentHP, teamMemberMaxHP, teamMemberAP, teamMemberDP, teamMemberAlive, totalTeamStats);
            }
            else{
                
            }
        }
        if(regionIndex== 2 && scenarioIndex == 1){
            int reduced = 0;
            if(simulatedChoice == 1){
                for(int i = 0 ; i < 3 ; i++){
                    if(teamMemberAlive[i]){
                        reduced = teamMemberCurrentHP[i] / 4;
                        teamMemberCurrentHP[i] -= reduced;
                        teamMemberAP[i] += 5;
                        teamMemberDP[i] += 5;
                    }                   
                }
                
            }
        }
    }
    public static void applyDamageToTeam(int damage, int[] teamMemberCurrentHP, int[] teamMemberDP, boolean[] teamMemberAlive){                
        int equalDamage = 0;
        int damageCount = 0;
        for(int i = 0 ; i < 3 ; i++){
            if(teamMemberAlive[i] == true){
                damageCount++;            
            }                                  
        }
        if(damageCount == 0)
            return;
        equalDamage = damage / damageCount; 
        for(int i = 0 ; i < 3 ; i++){
            if(teamMemberAlive[i] == true){
            teamMemberCurrentHP[i] -= equalDamage;
            if(teamMemberCurrentHP[i] <= 0){
                teamMemberCurrentHP[i] = 0;
                teamMemberAlive[i] = false;
            }            
            }
            else{
                teamMemberAlive[i] = false;
            }
        }
    }
    public static void healTeam(int healAmount, int[] teamMemberCurrentHP, int[] teamMemberMaxHP, boolean[] teamMemberAlive){
        int healCount = 0;
        int equalHeal = 0;
        for(int i = 0 ; i < teamMemberAlive.length ; i++){
            if(teamMemberMaxHP[i] != teamMemberCurrentHP[i]){
                healCount++;
            }
        }
        if(healCount == 0){
            return;
        }
        equalHeal = healAmount / healCount;
        for(int i = 0; i < 3 ; i++){
            if(teamMemberMaxHP[i] != teamMemberCurrentHP[i]){
                teamMemberCurrentHP[i] += equalHeal;
                if(teamMemberCurrentHP[i] > teamMemberMaxHP[i]){
                    teamMemberCurrentHP[i] = teamMemberMaxHP[i];
                }
                if(teamMemberAlive[i] == false){
                    teamMemberAlive[i] = true;
                }
            }
        }
    }

    public static boolean checkTeamStatus(boolean[] teamMemberAlive){
        for(int i = 0 ; i < teamMemberAlive.length ; i++){
            if(teamMemberAlive[i] == true){
                return true;
            }
        }
        return false;
    }
} 