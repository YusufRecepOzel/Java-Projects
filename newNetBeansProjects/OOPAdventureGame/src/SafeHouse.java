
public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player , String name){
        super(player , name);
    }
    public void maxHealth(){
        getPlayer().setHealth(getPlayer().getDefaultHealth());
        System.out.println("Your Health is full. Health: " + getPlayer().getDefaultHealth());        
    }
    @Override
    public boolean getLocation(){
        System.out.println("It is a safe zone.");
        return true;
    }
}
