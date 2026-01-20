
import java.util.Scanner;





public class Main {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        if(scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.println("Sayı:" + a);
        }
        else{
            System.out.println("Lütfen Bir Sayı Giriniz");
            scanner.nextLine();
            int a = scanner.nextInt();
            System.out.println("Sayı:" + a);
        }
    
        
    }
    
}
