
public class Game {
    private String title;
    private String genre;
    private double basePrice;
    private final int gameID;
    private static String platformName;
    protected static int gameCount;
    public Game(String title , String genre , double basePrice , int gameID , String platformName){
        this.title = title;
        this.genre = genre;
        this.basePrice = basePrice;
        this.gameID = gameID;
        this.platformName = platformName;
        this.gameCount++;
    }
    public int getGameID(){
        return this.gameID;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public static String getPlatformName(){
        return Game.platformName;
    }
    public static void setPlatformName(String platformName){
        Game.platformName = platformName;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public String displayGameInfo(){
        return ("Title: " + this.title + "\n"
             + "Game ID: " + this.gameID + "\n"
             + "Platform Name: " + this.platformName + "\n"
             + "Genre: " + this.genre + "\n"
             + "Price: " + this.basePrice);
    }
}
