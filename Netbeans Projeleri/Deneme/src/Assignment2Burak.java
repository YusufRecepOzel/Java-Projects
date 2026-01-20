
import java.util.Scanner;

public class Assignment2Burak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1: Character Creation
        System.out.print("Enter monster name: ");
        String monsterName = input.nextLine();

        System.out.print("Choose element (1: Fire, 2: Water, 3: Earth): ");
        int elementChoice = input.nextInt();
        if (elementChoice < 1 || elementChoice > 3) {
            System.out.println("Invalid element choice. Program terminated.");
            return;
        }

        System.out.print("Choose potential (1: Normal, 2: Rare): ");
        int potentialChoice = input.nextInt();
        if (potentialChoice < 1 || potentialChoice > 2) {
            System.out.println("Invalid potential choice. Program terminated.");
            return;
        }

        System.out.print("Enter destiny number (1-10): ");
        int destinyNumber = input.nextInt();
        if (destinyNumber < 1 || destinyNumber > 10) {
            System.out.println("Invalid destiny number. Program terminated.");
            return;
        }

        // Base stats
        int hp = 50, ap = 10, dp = 5;

        // Elemental bonus
        if (elementChoice == 1) ap += 5;
        else if (elementChoice == 2) hp += 20;
        else if (elementChoice == 3) dp += 10;

        // Potential boost
        if (potentialChoice == 2) {
            hp += 10;
            ap += 10;
            dp += 10;
        }

        // Destiny number effect
        if (elementChoice == 1) ap += destinyNumber;
        else if (elementChoice == 2) hp += destinyNumber;
        else if (elementChoice == 3) dp += destinyNumber;

        // Print monster profile
        System.out.println("\nMonster Profile:");
        System.out.println("Name: " + monsterName);
        System.out.println("HP: " + hp + ", AP: " + ap + ", DP: " + dp);

        // Part 2.1: Advanced Training
        int level = 1;
        int currentXP = 0;
        int xpToNextLevel = level * 100;

        System.out.print("\nEnter number of training days: ");
        int trainingDays = input.nextInt();
        int trainingFocus = 1;

        for (int day = 1; day <= trainingDays; day++) {
            if ((day - 1) % 7 == 0) {
                System.out.print("Choose training focus for this week (1: HP, 2: AP, 3: DP): ");
                trainingFocus = input.nextInt();
                if (trainingFocus < 1 || trainingFocus > 3) {
                    System.out.println("Invalid training focus. Program terminated.");
                    return;
                }
            }

            currentXP += 30;
            System.out.println("Day " + day + "... (XP +30) Total XP: " + currentXP + "/" + xpToNextLevel);

            while (currentXP >= xpToNextLevel) {
                level++;
                System.out.println("*** LEVEL UP! Your monster is now Level " + level + "! ***");
                hp += 10;
                ap += 5;
                dp += 5;

                if (trainingFocus == 1) hp += 5;
                else if (trainingFocus == 2) ap += 5;
                else if (trainingFocus == 3) dp += 5;

                currentXP -= xpToNextLevel;
                xpToNextLevel = level * 100;
            }
        }

        // Part 2.2: Guardian's Trial
        int guardianHP = 150;
        int guardianAP = 35;
        int guardianDP = 15;

        System.out.println("\nThe Guardian’s Trial Begins!");

        while (hp > 0 && guardianHP > 0) {
            // Monster attacks
            int damageDealt = ap - guardianDP;
            if (damageDealt < 5) damageDealt = 5;
            guardianHP -= damageDealt;
            if (guardianHP < 0) guardianHP = 0;
            System.out.println("> Your monster attacks and deals " + damageDealt + " damage! (Guardian HP: " + guardianHP + "/150)");

            if (guardianHP <= 0) break;

            // Guardian attacks
            int damageTaken = guardianAP - dp;
            if (damageTaken < 5) damageTaken = 5;
            hp -= damageTaken;
            if (hp < 0) hp = 0;
            System.out.println("> The Stone Guardian attacks and deals " + damageTaken + " damage! (Your HP: " + hp + ")");
        }

        // Outcome
        if (hp > 0) {
            System.out.println("\nVICTORY! The Guardian deems your monster worthy. The path to new adventures is now open!");
        } else {
            System.out.println("\nDEFEAT! Your monster has fallen. Return to training to prepare for the trial once more.");
        }

        input.close();
    }
}
