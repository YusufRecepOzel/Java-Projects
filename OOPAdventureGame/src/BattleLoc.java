import java.util.Scanner;
public class BattleLoc extends Location{
    public String award;
    public int maxObstacle;
    public BattleLoc(Player player , String name , Obstacle obstacle , String award){
        super(player , name);
        this.obstacle = obstacle;
        this.award = award;
    }
    
    @Override
    public boolean getLocation(String location){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the " + location);
        this.maxObstacle = (int) (Math.random() * 3) + 1;
        System.out.println("There are " + this.maxObstacle + " monsters in this area");
        while(true){
        System.out.println("Your remaining right to escape is " + player.getRunRight());
        System.out.println("Do you want to fight or run Please write fight or run.");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("Fight")){         
            combat();
            return true;
        }
        else if(choice.equalsIgnoreCase("Run")){
            player.changeRunRight();
            System.out.println("Your remaining right to escape is " + player.getRunRight());
            if(player.getRunRight() == 0){
            System.out.println("You do not have any right to escape. You must fight.");
            continue;
            }
            else{
            System.out.println("You escaped.");
            System.out.println("Your remaining right to escape is " + player.getRunRight());
            return true;
            }            
        }
        else{
            System.out.println("This is not a valid option. Please try again.");
            System.out.println("For this invalid option. Your monster count will be changed. Maybe this is a good or bad situation.");
            continue;
        }  
        }
    }
    public void combat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game throws a coin... (1: You, 0: Monster)");
        int ilkkan = (int) (Math.random() * 2);       
        for (int i = 0; i < this.maxObstacle; i++) {
            int health = obstacle.getOriginalHealth();
            this.obstacle.setHealth(health);
            System.out.println("\n--- Monster " + (i + 1) + " ---");
            System.out.println("You come face to face with a " + this.obstacle.getName());

            if (ilkkan == 1) {
                System.out.println("The first attack is yours");
                while (this.player.getHealth() > 0 && this.obstacle.getHealth() > 0) {
                    this.obstacle.setHealth(this.obstacle.getHealth() - player.getTotalDamage());
                    System.out.println("YOU HIT " + player.getTotalDamage() + " | Monster HP: " + Math.max(0, this.obstacle.getHealth()));
                    if (this.obstacle.getHealth() <= 0) break;
                    int monsterDamage = this.obstacle.getDamage() - this.player.getTotalDefense();
                    if (monsterDamage < 0) monsterDamage = 0;
                    this.player.setHealth(this.player.getHealth() - monsterDamage);
                    System.out.println("ENEMY HIT YOU FOR " + monsterDamage + " | Your HP: " + Math.max(0, this.player.getHealth()));
                    if (this.player.getHealth() <= 0) death();
                }
            } 
            else {
                System.out.println("The monster uses its attack first");
                while (this.player.getHealth() > 0 && this.obstacle.getHealth() > 0) {
                    int monsterDamage = this.obstacle.getDamage() - this.player.getTotalDefense();
                    if (monsterDamage < 0) monsterDamage = 0;
                    this.player.setHealth(this.player.getHealth() - monsterDamage);
                    System.out.println("ENEMY HIT YOU FOR " + monsterDamage + " | Your HP: " + Math.max(0, this.player.getHealth()));
                    if (this.player.getHealth() <= 0) death();
                    this.obstacle.setHealth(this.obstacle.getHealth() - player.getTotalDamage());
                    System.out.println("YOU HIT " + player.getTotalDamage() + " | Monster HP: " + Math.max(0, this.obstacle.getHealth()));
                    if (this.obstacle.getHealth() <= 0) break;
                }
            }
            if (this.obstacle.getHealth() <= 0) {
                System.out.println("THE " + this.obstacle.getName() + " IS DEAD");
                player.setMoney(player.getMoney() + this.obstacle.getLoot());
                System.out.println("You earned " + this.obstacle.getLoot() + " gold! Total Money: " + player.getMoney());
                if (i < this.maxObstacle - 1) {
                    while (true) {
                        System.out.println("Next monster is coming. Escape right: " + player.getRunRight());
                        System.out.print("Fight or Run? : ");
                        String choice = scanner.nextLine();
                        if (choice.equalsIgnoreCase("Fight")) {
                            break;
                        } else if (choice.equalsIgnoreCase("Run")) {
                            if (player.getRunRight() > 0) {
                                player.changeRunRight();
                                System.out.println("You escaped! Remaining right: " + player.getRunRight());
                                return;
                            } else {
                                System.out.println("No right to escape! You must fight.");
                                break;
                            }
                        } else {
                            System.out.println("Invalid option.");
                        }
                    }
                }
            }
        }
        System.out.println("\nYOU CLEARED AREA!");
        obstacle.setWin(obstacle.getWin() + 1);
        System.out.println("YOUR REWARD IS " + this.award);
        if (this.award.equals("Food")) player.invent.setFood(true);
        if (this.award.equals("Water")) player.invent.setWater(true);
        if (this.award.equals("Firewood")) player.invent.setFirewood(true);
        System.out.println("RETURNING TO THE MENU");
    }
    private void death() {
        System.out.println("YOU ARE DEAD! EXITING THE GAME. PLEASE TRY HARDER.");
        System.exit(0);
    }
            }