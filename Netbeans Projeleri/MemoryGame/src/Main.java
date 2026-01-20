
import java.util.Scanner;

public class Main {
    private static Card[][] cards = new Card[4][4];
    public static void main(String[] args) {       
        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');
        GameBoard();
    }
    public static void GameBoard(){
        Scanner scanner = new Scanner(System.in);
        int [][] a = new int[4][4];
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                if(cards[i][j].getGuess()){
                    System.out.print(" |" + cards[i][j].getAmount() + "| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
        }
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.println(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
