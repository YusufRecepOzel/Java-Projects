
import java.util.Scanner;

public class Main3 {
    public static boolean isAsal(int sayı){
        int originalnumber = sayı;
        if(sayı <= 1){
            return false;
        }
        while(sayı > 2){
            sayı--;
            if(originalnumber % sayı == 0){
                return false;
            }
            else{
                continue;
            }
    }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number");
        int number = scanner.nextInt();
        if(isAsal(number)){
            System.out.println(number + " is a asal number");
        }
        else{
            System.out.println(number + " is not an Asal number");
        }
    }
}
