import java.util.Scanner;
public class TWODArray {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int [][] map = new int[3][3];
        System.out.println("Filled the map");
        for(int i = 0 ; i < map.length ; i++){
            for(int j = 0 ; j < map.length ; j++){               
                map[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        System.out.println("The map condition:");
        for(int i = 0 ; i < map.length ; i++){
            for(int j = 0 ; j < map.length ; j++){
                System.out.print(map[i][j]);
                sum = sum + map[i][j];
            }
            System.out.println();
        }
        System.out.println("Toplam Gold Current: " + sum);
    }
}
