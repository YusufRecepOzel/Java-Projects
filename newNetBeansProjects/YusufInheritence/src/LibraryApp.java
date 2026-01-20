
public class LibraryApp {
    public static void main(String [] args){
        Game.setPlatformName("Steam");
        NarrativeGame [] game = new NarrativeGame[3];
        game[0] = new NarrativeGame(5 , true , "The Walking Dead Game" , "choice-based" , 19.99 , 101 , "Steam");
        game[1] = new NarrativeGame(20 , true , "Heavy Rain" , "choice-based" , 9.99 , 201 , "Steam");
        game[2] = new NarrativeGame(32 , false , "Alan Wake 2 " , "TPS - Shooter" , 59.99 , 203 , "Epic Games Store");
        for(int i = 0; i < game.length ; i++){
            System.out.println(game[i].displayGameInfo());
            System.out.println(game[i].displayStoryDetails());
    }
        System.out.println(Game.gameCount);
    }
}
