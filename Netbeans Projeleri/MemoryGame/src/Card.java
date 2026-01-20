
public class Card {
    private char amount;
    private boolean guess = false;
    public Card(char amount){
       this.amount = amount;
    }
    public void setAmount(char amount){
        this.amount = amount;
    }
    public char getAmount(){
        return amount;
    }
    public void setGuess(boolean guess){
        this.guess = guess;
    }
    public boolean getGuess(){
        return guess;
    }
}
