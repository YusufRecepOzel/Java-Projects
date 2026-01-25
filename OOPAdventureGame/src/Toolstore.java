import java.util.Scanner;

public class Toolstore extends NormalLoc{
    
    public Toolstore(Player player){
        super(player , "ToolStore");
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
        if (choice >= 1 && choice <= 3) {
            buy(choice); // Satın alma sayfasına git
        } 
        else if (choice == 4) {
                System.out.println("Exitting...");
                break;
            } 
        else {
                System.out.println("Please write a valid number (1, 2, 3, or 4).");
            }
        }
        
    }
    public void buy(int choice){
        Scanner scanner = new Scanner(System.in);
        while(true){
            if(choice == 1){
                System.out.println("What would like to buy You can carry only 1 weapon please choice carefully.");
                System.out.println("1: Pistol , 2: Sword , 3: Rifle , 0: Back");
                int choice1 = scanner.nextInt();
                scanner.nextLine();
                if(choice1 == 0)
                    return;
                
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
                        }
                        else{
                            System.out.println("Your money is not enough to buy Pistol.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
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
                           player.invent.setWeaponDamage(3);
                        }
                        else{
                            System.out.println("Your money is not enough to buy Sword.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
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
                           player.invent.setWeaponDamage(7);
                        }
                        else{
                            System.out.println("Your money is not enough to buy Rifle.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                    }
                }
                if(choice1 < 1 || choice1 > 3){
                    System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                }
                choice = 0;
            }
            if(choice == 2){
                System.out.println("What would like to buy. You can carry only 1 armor please choice carefully.");
                System.out.println("1: Light Armor , 2: Medium Armor , 3: Heavy Armor");
                int choice1 = scanner.nextInt();
                scanner.nextLine();
                if(choice1 == 0){
                    choice = 0;
                    continue;
                }
                if(choice1 == 1){
                    System.out.println("Armor Name: Light");
                    System.out.println("Price: 15");
                    System.out.println("Tool Defense: 1");            
                    System.out.println("Do you want to buy this armor. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 15 >= 0){
                           player.setMoney(player.getMoney() - 15);
                           System.out.println("Light Armor was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setArmorType("Light Armor");
                           player.invent.setArmorDefense(1);
                        }
                        else{
                            System.out.println("Your money is not enough to buy Light Armor.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                    }
                }
                if(choice1 == 2){
                    System.out.println("Armor Name: Medium");
                    System.out.println("Price: 25");
                    System.out.println("Tool Defense: 3");
                    System.out.println("Do you want to buy this armor. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 25 >= 0){
                           player.setMoney(player.getMoney() - 25);
                           System.out.println("Armor was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setArmorType("Medium Armor");
                           player.invent.setArmorDefense(3);
                        }
                        else{
                            System.out.println("Your money is not enough to buy Medium Armor.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                    }
                }
                if(choice1 == 3){
                    System.out.println("Armor Name: Heavy");
                    System.out.println("Price: 40");
                    System.out.println("Tool Defense: 5");
                    System.out.println("Do you want to buy this armor. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 40 >= 0){
                           player.setMoney(player.getMoney() - 40);
                           System.out.println("Armor was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setArmorType("Heavy Armor");
                           player.invent.setArmorDefense(5);
                        }
                        else{
                            System.out.println("Your money is not enough to buy Heavy Armor.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                    }
                }
                if(choice1 < 1 || choice1 > 3){
                    System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                }
                choice = 0;
            }
            if(choice == 3){
                System.out.println("What would like to buy.");
                System.out.println("1: Food , 2: Water , 3: Firewood");
                int choice1 = scanner.nextInt();
                scanner.nextLine();
                if(choice1 == 1){
                    System.out.println("Ware Name: Food");
                    System.out.println("Price: 10");      
                    System.out.println("Do you want to buy this ware. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 10 >= 0){
                           player.setMoney(player.getMoney() - 10);
                           System.out.println("Food was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setFood(true);
                        }
                        else{
                            System.out.println("Your money is not enough to buy food");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                    }
                }
                if(choice1 == 2){
                    System.out.println("Ware Name: Water");
                    System.out.println("Price: 10");
                    System.out.println("Do you want to buy this ware. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 10 >= 0){
                           player.setMoney(player.getMoney() - 10);
                           System.out.println("Water was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setWater(true);
                        }
                        else{
                            System.out.println("Your money is not enough to buy Water.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                    }
                }
                if(choice1 == 3){
                    System.out.println("Ware Name: Firewood");
                    System.out.println("Price: 20");
                    System.out.println("Do you want to buy this ware. Only true or false.");
                    String choice2 = scanner.nextLine();
                    if(choice2.equalsIgnoreCase("true")){
                        if(player.getMoney() - 20 >= 0){
                           player.setMoney(player.getMoney() - 20);
                           System.out.println("Firewood was purcheased.");
                           System.out.println("returning to the menu.");
                           player.invent.setFirewood(true);
                        }
                        else{
                            System.out.println("Your money is not enough to buy Firewood.");
                            System.out.println("returning to the menu.");
                        }
                    }
                    else if(!choice2.equalsIgnoreCase("true") && !choice2.equalsIgnoreCase("false")){
                        System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                    }
                    else{
                        System.out.println("returning to the menu.");
                    }
                }
                if(choice1 < 1 || choice1 > 3){
                    System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                }
                choice = 0;
            }
            if(choice == 4){
                System.out.println("Exitting the store...");
                return;
            }
            if(choice < 0 || choice > 4){
                    System.out.println("This is not a valid option Please try again.");
                        System.out.println("Returning to the store.");
                        continue;
                }
            else {
                System.out.println("1: Weapons, 2: Armors, 3: Items, 4: Exit");
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            }
        }
    @Override
    public boolean getLocation(String location){
        System.out.println(location + " is a safe zone.");
        return true;
    }
}