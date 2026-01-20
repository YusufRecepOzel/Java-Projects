import java.util.Arrays;
import java.util.Scanner;
public class ArrayEasy {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Girişler yapıldıktan sonra...)");
        int [] arr = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("En Yuksek Sicaklik: " + (arr[arr.length - 1]));
    }
}
