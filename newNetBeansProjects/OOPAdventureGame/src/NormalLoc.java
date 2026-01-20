
public abstract class NormalLoc extends Location{
    public NormalLoc(Player player , String name){
        super(player , name);
    }
    @Override
    public boolean getLocation(){
        System.out.println("It is a safe zone.");
        return true;
    }
}
