import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int digit = digitSum(number);
        System.out.println("Digit Sum: " + digit);
    }
    public static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
}
