import java.util.Scanner;
public class Player {
    public Inventory invent = new Inventory(" " , 0 , " " , 0 , false , false , false );
    private int ID;
    private int damage;
    private int sumDamage = damage + invent.getWeaponDamage();
    private int defaultHealth;
    private int health;
    private int money;
    private String samurai;
    private String archer;
    private String knight;
    
    public int getSumDamage() {
        return sumDamage;
    }
    public void setSumDamage(int sumDamage) {
        this.sumDamage = sumDamage;
    }
    public int getMoney(){
        return this.money;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getDefaultHealth(){
        return this.defaultHealth;
    }
    public void selectCha(){    
            Scanner scanner = new Scanner(System.in);            
            while(true){
            System.out.println("Write 1 2 3 to choice a character");
            this.ID = scanner.nextInt();
            scanner.nextLine();
                if(this.ID == 1){
                    this.samurai = "Samurai";
                    System.out.println("Character: " + this.samurai);
                    this.damage = 5;
                    this.health = 21;
                    this.defaultHealth = 21;
                    this.money = 15;
                    System.out.println("Damage: " + this.damage);
                    System.out.println("Health: " + this.health);
                    System.out.println("Money: " + this.money);
                    System.out.println("Is this your final decision for your character. Please say yes or no");
                    String decision = scanner.nextLine();
                    if("yes".equalsIgnoreCase(decision)){
                        break;
                    }
                    else if(!"yes".equalsIgnoreCase(decision) || !"no".equalsIgnoreCase(decision)){
                        System.out.println("Invalid Decision please try again");
                        continue;
                    }
                    else{
                        continue;
                    }
                }
                if(this.ID == 2){
                    this.archer = "Archer";
                    System.out.println("Character: " + this.archer);
                    this.damage = 7;
                    this.health = 18;
                    this.defaultHealth = 18;    
                    this.money = 20;
                    System.out.println("Damage: " + this.damage);
                    System.out.println("Health: " + this.health);
                    System.out.println("Money: " + this.money);
                    System.out.println("Is this your final decision for your character. Please say yes or no");
                    String decision = scanner.nextLine();
                    if("yes".equalsIgnoreCase(decision)){
                        break;
                    }
                    else if(!"yes".equalsIgnoreCase(decision) || !"no".equalsIgnoreCase(decision)){
                        System.out.println("Invalid Decision please try again");
                        continue;
                    }
                    else{
                        continue;
                    }
                }
                if(this.ID == 3){
                    this.knight = "Knight";
                    System.out.println("Character: " + this.knight);
                    this.damage = 8;
                    this.health = 24;
                    this.defaultHealth = 24;
                    this.money = 5;
                    System.out.println("Damage: " + this.damage);
                    System.out.println("Health: " + this.health);
                    System.out.println("Money: " + this.money);
                    System.out.println("Is this your final decision for your character. Please say yes or no");
                    String decision = scanner.nextLine();
                    if("yes".equalsIgnoreCase(decision)){
                        break;
                    }
                    else if(!"yes".equalsIgnoreCase(decision) || !"no".equalsIgnoreCase(decision)){
                        System.out.println("Invalid Decision please try again");
                        continue;
                    }
                    else{
                        continue;
                    }
                }
                if(this.ID<1 || this.ID>3){
                    System.out.println("Invalid ID Please Try Again");
                    continue;
                }
            }
    }
}
