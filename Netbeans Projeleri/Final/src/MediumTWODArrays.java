import java.util.Scanner;
public class MediumTWODArrays {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
      int [][] table = new int [3][4];
      int sum = 0;      
        for(int i = 0 ; i < table.length ; i++){
            for(int j = 0 ; j < table.length ; j++){
                table[j][i] = scanner.nextInt();
                sum = sum + table[j][i];
            }
            System.out.println("Product " + (i+1) + "(Column " + i + ")"+ " Total Sales: " + sum);
        }
    }
}
