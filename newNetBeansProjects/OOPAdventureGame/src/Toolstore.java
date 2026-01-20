import java.util.Scanner;

public class Toolstore extends NormalLoc{
    public int toolDamage;
    public int toolDefense;
    public Toolstore(Player player , String name , int toolDamage, int toolDefense){
        super(player , name);
        this.toolDamage = toolDamage;
        this.toolDefense = toolDefense;
    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){       
        System.out.println("Welcome. What would you like to buy");    
        System.out.println("Option 1: Weapons(Pistol, Sword, Rifle)");
        System.out.println("Option 2: Armors (Light, Medium, Heavy)");
        System.out.println("Option 3: Items (Food, Water, Firewood).");
        System.out.println("Option 4: Exit");
        int choice = scanner.nextInt();
        if(choice > 4){
            System.out.println("Please write a valid number There are 1 , 2 , 3 , 4");
            continue;
        }
        else if(choice == 4){
            System.out.println("Exitting...");
            break;
        }
        buy(choice);    
        }
        
    }
    public void buy(int choice){
        Scanner scanner = new Scanner(System.in);
        while(true){
            if(choice == 1){
                System.out.println("What would like to buy You can carry only 1 weapon please choice carefully.");
                System.out.println("1: Pistol , 2: Sword , 3: Rifle");
                int choice1 = scanner.nextInt();
                scanner.nextLine();
                if(choice1 == 1){
                    System.out.println("Weapon Name: Pistol");
                    System.out.println("Price: 25");
                    System.out.println("Tool Damage: 2");
                    System.out.println("A compact tool for precision shots; perfect for stopping slow-moving, brain-dead husks from a distance.");
                    System.out.println("Do you want to buy this weapon. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 25 >= 0){
                           player.setMoney(player.getMoney() - 25);
                           System.out.println("Pistol was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setWeaponName("Pistol");
                           player.invent.setWeaponDamage(2);
                           menu();
                        }
                        else{
                            System.out.println("Your money is not enough to buy Pistol.");
                            System.out.println("returning to the menu.");
                            menu();
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                        menu();
                    }
                }
                if(choice1 == 2){
                    System.out.println("Weapon Name: Sword");
                    System.out.println("Price: 35");
                    System.out.println("Tool Damage: 3");
                    System.out.println("Forged in silver and steel. An elegant blade for those who hunt the bloodthirsty aristocrats of the night");
                    System.out.println("Do you want to buy this weapon. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 35 >= 0){
                           player.setMoney(player.getMoney() - 35);
                           System.out.println("Sword was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setWeaponName("Sword");
                           menu();
                        }
                        else{
                            System.out.println("Your money is not enough to buy Sword.");
                            System.out.println("returning to the menu.");
                            menu();
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                        menu();
                    }
                }
                if(choice1 == 3){
                    System.out.println("Weapon Name: Rifle");
                    System.out.println("Price: 45");
                    System.out.println("Tool Damage: 7");
                    System.out.println("Extreme stopping power. The only thing capable of piercing the thick, winter fur of a mountain-sized beast");
                    System.out.println("Do you want to buy this weapon. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 45 >= 0){
                           player.setMoney(player.getMoney() - 45);
                           System.out.println("Rifle was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setWeaponName("Rifle");
                           menu();
                        }
                        else{
                            System.out.println("Your money is not enough to buy Rifle.");
                            System.out.println("returning to the menu.");
                            menu();
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                        menu();
                    }
                }
                if(choice1 < 1 || choice1 > 3){
                    System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                }
            }
            if(choice == 2){
                System.out.println("What would like to buy. You can carry only 1 armor please choice carefully.");
                System.out.println("1: Light Armor , 2: Medium Armor , 3: Heavy Armor");
                int choice1 = scanner.nextInt();
                scanner.nextLine();
                if(choice1 == 1){
                    System.out.println("Armor Name: Light");
                    System.out.println("Price: 15");
                    System.out.println("Tool Damage: 1");
                    System.out.println("A compact tool for precision shots; perfect for stopping slow-moving, brain-dead husks from a distance.");
                    System.out.println("Do you want to buy this weapon. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 25 >= 0){
                           player.setMoney(player.getMoney() - 25);
                           System.out.println("Pistol was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setWeaponName("Pistol");
                           menu();
                        }
                        else{
                            System.out.println("Your money is not enough to buy Pistol.");
                            System.out.println("returning to the menu.");
                            menu();
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                        menu();
                    }
                }
                if(choice1 == 2){
                    System.out.println("Weapon Name: Sword");
                    System.out.println("Price: 35");
                    System.out.println("Tool Damage: 3");
                    System.out.println("Forged in silver and steel. An elegant blade for those who hunt the bloodthirsty aristocrats of the night");
                    System.out.println("Do you want to buy this weapon. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 35 >= 0){
                           player.setMoney(player.getMoney() - 35);
                           System.out.println("Sword was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setWeaponName("Sword");
                           menu();
                        }
                        else{
                            System.out.println("Your money is not enough to buy Sword.");
                            System.out.println("returning to the menu.");
                            menu();
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                        menu();
                    }
                }
                if(choice1 == 3){
                    System.out.println("Weapon Name: Rifle");
                    System.out.println("Price: 45");
                    System.out.println("Tool Damage: 7");
                    System.out.println("Extreme stopping power. The only thing capable of piercing the thick, winter fur of a mountain-sized beast");
                    System.out.println("Do you want to buy this weapon. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 45 >= 0){
                           player.setMoney(player.getMoney() - 45);
                           System.out.println("Rifle was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setWeaponName("Rifle");
                           menu();
                        }
                        else{
                            System.out.println("Your money is not enough to buy Rifle.");
                            System.out.println("returning to the menu.");
                            menu();
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                        menu();
                    }
                }
                if(choice1 < 1 || choice1 > 3){
                    System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                }
            }
        }
    }
    public boolean getLocation(){
        System.out.println("It is a safe zone.");
        return true;
    }
}
