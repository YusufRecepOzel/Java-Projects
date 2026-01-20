import java.util.Scanner;

public class Assignment2Enes {

    static Scanner sc = new Scanner(System.in);


    static String name;
    static int element, potential, destiny;
    static int hp, dp, ap;
    static int level=1;
    static int currentXP=0;
    static int xpToNextLevel = level*100;
    static int trainingFocus;


    public static void main(String[] args) {
        createMonster();
        trainMonster();
        guardianTrial();

        sc.close();
    }

    public static void createMonster() {

        System.out.println("--------------Welcome to the Monster Creating Area--------------");
        System.out.print("Give a name to your companion: ");
        name = sc.nextLine();

        System.out.printf(
                "Now you have to choose an element for your companion, it will determine your companion's core strength%n" +
                        "[1] Fire (Attack Oriented)%n" +
                        "[2] Water (Health Oriented)%n" +
                        "[3] Earth (Defense Oriented)%n");
        System.out.print("Your choice (1-3): ");
        element = sc.nextInt();

        if (element >= 1 && element <= 3) {
            System.out.printf(
                    "Each monster carries a unique destiny. Decide the potential that will shape its path%n" +
                            "[1] Normal (Standard Stats)%n" +
                            "[2] Rare (Bonus all stats)%n");
            System.out.print("Your choice (1-2): ");
            potential = sc.nextInt();

            if (potential == 1 || potential == 2) {
                System.out.print("Finally, choose a number from 1 to 10 (destiny): ");
                destiny = sc.nextInt();

                if (destiny >= 1 && destiny <= 10) {

                    hp=50;
                    ap=10;
                    dp=5;

                    if (element == 1) {
                        ap += 5;
                    } else if (element == 2) {
                        hp += 20;
                    } else {
                        dp += 10;
                    }

                    if (potential == 2) {
                        ap += 10;
                        hp += 10;
                        dp += 10;
                    }

                    if (element == 1) {
                        ap += destiny;
                    } else if (element == 2) {
                        hp += destiny;
                    } else {
                        dp += destiny;
                    }

                    System.out.printf("Your companion %s being created...%n", name);

                    System.out.println("\n--- MONSTER PROFILE CARD ---");
                    System.out.println("Name: " + name);
                    System.out.println("Element: " + element);
                    System.out.println("Potential: " + potential);
                    System.out.println("\nHealth Points (HP): " + hp);
                    System.out.println("Attack Power (AP): " + ap);
                    System.out.println("Defense Power (DP): " + dp);
                    System.out.println("---------------------------");

                } else {
                    System.out.println("ERROR: invalid destiny number.");
                }
            } else {
                System.out.println("ERROR: invalid potential choice.");
            }
        } else {
            System.out.println("ERROR: invalid element choice.");
        }
    }

    public static void  trainMonster(){
        System.out.println("Enter total training days: ");
        int totaldays=sc.nextInt();
        if (totaldays<=0){
            System.out.println("ERROR: days must be positive");
        }
        int day =1;
        while(day<=totaldays){
            if( (day - 1) % 7 == 0) {
                System.out.printf("Enter a training focus %n1-HP %n2-AP %n3-DP %nSelect one: ");
                trainingFocus = sc.nextInt();
                if (trainingFocus < 1 || trainingFocus > 3) {
                    System.out.println("ERROR: training focus must be between 1 and 3");
                }
            }
                currentXP+=30;

                while (currentXP >= xpToNextLevel) {
                    currentXP -= xpToNextLevel;
                    level += 1;
                    xpToNextLevel = level * 100;

                    hp += 10;
                    ap += 5;
                    dp += 5;
                }

                if (trainingFocus == 1) {
                    hp += 5;
                } else if (trainingFocus == 2) {
                    ap += 5;
                } else if (trainingFocus == 3) {
                    dp += 5;
                }
                System.out.println("Day " + day + "... (XP +30) Total XP: " + currentXP + "/" + xpToNextLevel);
                day++;
            }
        System.out.println("Training completed.");
        System.out.println("Final Level = " + level + " | HP=" + hp + " AP=" + ap + " DP=" + dp);

    }

    public static void guardianTrial(){
        int GuardianHP =150;
        int GuardianAP=35;
        int GuardianDP=15;
        int hp2 = hp;

        System.out.println("Starting Guardian’s Trial...");

        while (GuardianHP>0 && hp>0){
            int damageDealt = ap-GuardianDP;
            if(damageDealt<=5){
                damageDealt=5;
            }
            GuardianHP-=damageDealt;
            System.out.printf("Your monster attacks and deals %d damage! Guardian: %d/150 %n",damageDealt,GuardianHP);

            if(GuardianHP<=0){
                break;
            }

            damageDealt = GuardianAP-dp;
            if(damageDealt<=5){
                damageDealt=5;
            }
            hp-=damageDealt;
            System.out.printf("The Guardian attacks and deals %d damage! (Your HP: %d/%d) %n",damageDealt,GuardianHP, hp2);
        }
        if(GuardianHP<=0){
            System.out.println("VICTORY! The Guardian deems your monster worthy. \n" +
                    "The path to new adventures is now open!\n");
        }
        else if(hp<=0){
            System.out.println("DEFEAT! Your monster has fallen. \n" +
                    "Return to training to prepare for the trial once more.\n");
        }
    }
}