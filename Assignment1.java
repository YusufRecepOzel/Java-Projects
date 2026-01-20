import java.util.Scanner;

public class Assignment1 {
    public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
      boolean valid = true;
    System.out.println("---- Welcome to Monster Creation Tool ----");
    System.out.print("Hi User. Write a name to your beast: ");
    String beast = scanner.nextLine();
    int HP = 50; //Health Points
    int AP = 10; // Attack Power
    int DP = 5; // Defense Power
    System.out.print("Write your elemental choice. This choice affects your beast Attack, Health and Defense \n" 
        + "1: Fire (Burning Fury - Attack)\n"
        + "2: Water (Health of the Deeps - Health)\n"
        + "3: Earth (Unshakeable Resistence - Defense)\n"
        + "What is your choice (1-3):");
    String element = scanner.nextLine();
    if("1".equals(element)){
        element = "Fire";
        AP += 5;
    }
    else if("2".equals(element)){
        element = "Water";
        HP += 20;
    }
    else if("3".equals(element)){
        element = "Earth";
        DP += 10;
    }
    else{
        System.out.println("ERROR: Invalid element choice. Exiting the tool");
        valid = false;
        if("aaaa"){
            
        }
    }
    System.out.print("Some monsters might be unique breeds. Write your potential choice.\n"
        + "1: Normal (Standard growth)\n"
        + "2: Rare (Bonus to All Stats)\n"
        + "What is your choice (1-2):");
    String potential = scanner.nextLine();
    if("1".equals(potential)){
        element = "Normal";
    }
    else if("2".equals(potential)){
        element = "Rare";
        AP += 10;
        HP += 10;
        DP += 10;
    }
    else{
        System.out.println("ERROR: Invalid element choice. Exiting the tool.");
    }
    System.out.println("The spirit(you) awaits to shape its destiny.");
    System.out.println("Write a number (1-10) to seal its fate.");
    int destiny = scanner.nextInt();
    if(destiny >= 1 && destiny <= 10){
        System.out.println("The monsters fate is sealed by YOU.");
    if("1".equals(element)){
        element = "Fire";
        AP += destiny;
    }
    else if("2".equals(element)){
        element = "Water";
        HP += destiny;
    }
    else if("3".equals(element)){
        element = "Earth";
        DP += destiny;
    }
    }
    else{
        System.out.println("Invalid Destiny. Exitting the tool.");
        System.out.println("Or you are afraid to give a number to your monster.");
        System.out.println("Do not be afraid. EVERYONE MUST CHOOSE A FATE EVENTUALLY");
    }
    System.out.println("Perfect choices! Your monster " + beast + " is being created...");
    System.out.println("--- MONSTER PROFILE CARD ---\n"
        + "Name: " + beast + "\n"
        + "Element: " + element + "\n"
        + "Potential: " + potential + "\n"
        + "\n"
        + "Health Points (HP): " + HP + "\n"
        + "Attack Power (AP): " + AP + "\n"
        + "Defense Power (DP): " + DP + "\n"
        + "----------------------------------");
    scanner.close();
    }    
}
