
import java.util.Scanner;




class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayı :");
        int a = scanner.nextInt();
        System.out.println("İkinci Sayı :");
        scanner.hasNextLine();
        int b = scanner.nextInt();
        System.out.println("Üçüncü Sayı :");
        scanner.hasNextLine();
        int c = scanner.nextInt();
        
        int maks;
         if ( a >= b && a >= c){
             maks = a;
         }
             else if ( b>= a && b >= c){
                 maks= b;
                     
         }
             else {
             maks=c;
    }
         System.out.println("Maksimum sayı = " + maks);
    }
    
}
