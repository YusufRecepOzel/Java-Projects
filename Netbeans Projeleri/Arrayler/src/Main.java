
import java.util.Scanner;


public class Main {
    public static double ortalamabul(double [] array){
        double toplam = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < array.length ; i++){
            array[i] = scanner.nextDouble();
            toplam = toplam + array[i];
        }
        return (toplam / array.length);
    }
    public static void main(String[] args) {
        double[] a = new double[4];
        System.out.println("Ortalama: " + ortalamabul(a));
    }
    public static void main(String[] args) {
        //int a = 5;
        int [] a = new int[5];
        for(int i = 0; i < 5 ; i++){
            a[i] = i * 4 + 2;         
        }
        for(int i = 0; i < 5 ; i++){
            System.out.println(a[i]);
        }
        
        /*int[] a = {30,40,50,60,70};
        System.out.println(a[5]);*/
        /*int[] a = new int[10];
        a[5] = 32;
        a[9] = 50;*/
        //double[] c;
    }
}
