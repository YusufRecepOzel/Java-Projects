
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    /*int [][] a = new int[2][2];
    a[0][0] = 10;
    a[0][1] = 20;
    a[1][0] = 30;
    a[1][1] = 40;*/
    /*int [][] a = {{10,20} , {30,40}};
        System.out.println(a[1][0]);*/
    Scanner scanner = new Scanner(System.in);
    int [][] a = new int[2][2];
    for(int i = 0 ; i < 2 ; i++){
        for(int j = 0 ; j < 2 ; j++){
            a[i][j] = scanner.nextInt();
        }
    }
    for(int i = 0 ; i < 2 ; i++){
        for(int j = 0 ; j < 2 ; j++){
            System.out.print(a[i][j] + " ");
        }
        System.out.println(" ");
    }
    }    
}
