import java.util.Scanner;

public class Game {
    Player player = new Player();
    Location location;
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello player please make a decision to choice a character.");
        player.selectCha();
        System.out.println("Please choose a location");
        System.out.println("Forest Entry: Shadows move quickly between the trees, and the smell of ancient blood fills the air...");
        System.out.println("Cave Entry: The air is stale, and you hear the dragging footsteps of the undead...");
        System.out.println("River Entry: You see massive paw prints in the mud and hear a roar that shakes the ground...");
        System.out.println("Your player do not have anything. I strongly recommend you to go toolstore");
        while(true){
        System.out.println("Our locations are 3. cave , 1. safehouse , 5. river , 2. toolstore , 4. forest. You can go anywhere if you want. ");
        System.out.println("İf you finished all the areas Please write 6 to quit.");
        int locations = scanner.nextInt();
        if(locations == 1){
        SafeHouse safehouse = new SafeHouse(player);
        System.out.println(safehouse.getLocation("Safe House"));
        safehouse.maxHealth();
        continue;
        }
        if(locations == 2){
        Toolstore toolstore = new Toolstore(player);
        System.out.println(toolstore.getLocation("Tool Store"));
        toolstore.menu();
        continue;
        }
        if(locations == 4){
        location = new Forest(player);
        location.getLocation("Forest");
        continue;
        }
        if(locations == 3){
        if(player.invent.isFirewood() == false){
            System.out.println("You said: I cannot see anything in this darkness. I can not go through like that and you step back.");
        continue;
        }
        else{
            System.out.println("You used your firewood to see the darkness");
            location = new Cave(player);
            location.getLocation("Cave");
        while(true){
        if(player.invent.isFood() == false){
            Toolstore toolstore = new Toolstore(player);
            System.out.println("You said: I can not go anywhere without food. I have to go to the Tool Store");
            toolstore.menu();
            continue;
        }
        else{
            System.out.println("You said: This food make me feel better.");
            break;
        }
        }      
        }
        continue;
        }
        if(locations == 5){
        location = new River(player);
        location.getLocation("River");
        while(true){
        if(player.invent.isWater() == false){
            Toolstore toolstore = new Toolstore(player);
            System.out.println("You said: I can not go anywhere without water. I have to go to the Tool Store");
            toolstore.menu();
            continue;
        }
        else{
            System.out.println("You said: This water make me feel better.");
            break;
        }
        }
        continue;
        }
        if(locations == 6){
            if (player.invent.isFood() && player.invent.isWater() && player.invent.isFirewood()) {
            System.out.println("CONGRATULATIONS, YOU WIN!");
            System.exit(0);
    }
            else{
                System.out.println("ARE YOU FUCKING SERIOUS. DO YOU THINK YOU'RE SMART? DO YOU THINK YOU CAN FOOL ME? YOU CAN'T ESCAPE FROM HERE SO EASILY. GO BACK TO YOUR GAME AND FINISH IT LIKE A MAN.");
                System.out.println("Yes you found an easter egg. Congratulations");
                continue;
            }
        }
        }        
    }
}
