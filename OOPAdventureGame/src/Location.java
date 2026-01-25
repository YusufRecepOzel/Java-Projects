
public abstract class Location {
    public Player player;
    private String name;
    protected Obstacle obstacle;
    public Location(Player player , String name){
        this.player = player;
        this.name = name;
    }
    public Obstacle getObstacle() {
        return obstacle;
    }
    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getLocation(String location){
        if(player.getHealth()<=0){
            return false;
        }
        return true;
    }
    
}
