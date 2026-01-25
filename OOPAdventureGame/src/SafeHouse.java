
public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player){
        super(player , "Safe House");
    }
    public void maxHealth(){
        getPlayer().setHealth(getPlayer().getDefaultHealth());
        System.out.println("Your Health is full. Health: " + getPlayer().getDefaultHealth());        
    }
    @Override
    public boolean getLocation(String location){
        System.out.println(location + " is a safe zone.");
        return true;
    }
}
