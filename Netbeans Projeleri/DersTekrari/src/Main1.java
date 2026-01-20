import java.util.Scanner;

public class Main1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first digit");
        int a = scanner.nextInt();
        System.out.println("Enter the second digit");
        int b = scanner.nextInt();
        System.out.println(sum(a, b));
    }
        public static int sum(int a , int b){
            int sum = 0;
            if(a <= b){
            for(int i = a ; i<=b ; i++){
                sum = sum + i;
            }            
            }
            else{
            for(int i = a; i >= b; i--){
                    sum = sum + i;
                    }
            }
            
            return sum;
        }
}
