
public class NarrativeGame extends Game{
    private int chapters;
    private boolean isChoiceBased;
    public NarrativeGame(int chapters , boolean isChoiceBased , String title , String genre , double basePrice , int gameID , String platformName){
        super(title , genre , basePrice , gameID , platformName);
        this.chapters = chapters;
        this.isChoiceBased = isChoiceBased;
    }
    public String displayStoryDetails(){
        return ("Chapters: " + this.chapters + "\n"
             + "isChoiceBased: " + this.isChoiceBased);
    }
}
