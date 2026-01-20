import java.util.Arrays;

public class RPGInventory {
     static int[] inventory = {101, 505, 202}; 

    public static void main(String[] args) {
        System.out.println("--- START ---");

        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight()); 

        System.out.println("\n--- LOOTING RING (550) ---");

        lootItem(550);
        
        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());

        System.out.println("\n--- DROPPING SHIELD (202) ---");
        dropItem(202);
        
        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());

        System.out.println("\n--- DROPPING MISSING ITEM (999) ---");
        dropItem(999);
        
        System.out.print("Inventory: " + Arrays.toString(inventory));
        System.out.println(" | Total Weight: " + calculateTotalWeight());
    }
    public static void lootItem(int newItemID){
        int [] tempInventory = new int[inventory.length + 1];
        for(int i = 0; i< inventory.length ; i++){
            tempInventory[i] = inventory[i];
        }
        tempInventory[inventory.length] = newItemID;
        inventory = tempInventory;
    }
    public static void dropItem(int itemToRemove){
        int index = -1;
        for(int i = 0 ; i<inventory.length ; i++){
            if(inventory[i] == itemToRemove){
                index = i;
                break;
            }
        }
        if(index == -1){
            return;
        }
        int k = 0;
        int [] tempInventory = new int[inventory.length - 1];
        for(int i = 0 ; i < inventory.length ; i++){
            if(index == i){
                continue;
            }
            tempInventory[k] = inventory[i];
            k++;
        }
        inventory = tempInventory;
    }
    public static double calculateTotalWeight(){
        double totalWeight = 0;
        for(int i = 0 ; i < inventory.length ; i++){
            if(inventory[i] >= 100 && inventory[i] <=199){
                totalWeight += 5.0;
            }
            if(inventory[i] >= 200 && inventory[i] <= 299){
                totalWeight += 10.0;
            }
            if(inventory[i]>=300 || inventory[i] <= 99){
                totalWeight += 1.0;
            }
        }
        return totalWeight;
    }
}
