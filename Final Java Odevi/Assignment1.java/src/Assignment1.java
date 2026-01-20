import java.util.Scanner;

public class Assignment1 {
    public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
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
        return;
    }
    System.out.println("");
    System.out.print("Every monster has a potential. Choose its potential:\n"
        + "[1] Normal (Standard stats)\n"
        + "[2] Rare (Bonus to all stats)\n"
        + "Your choice (1-2): ");
    int potential = scanner.nextInt();
    String potentialname = "";
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
        return;
    }
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
        return;
    }
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
    scanner.close();
    }    
}
