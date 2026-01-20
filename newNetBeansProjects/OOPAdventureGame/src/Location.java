
public abstract class Location {
    public Player player;
    private String name;
    public Location(Player player , String name){
        this.player = player;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getLocation(){
        if(player.getHealth()<=0){
            return false;
        }
        return true;
    }
    
}
