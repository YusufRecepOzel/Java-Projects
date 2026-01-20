import java.util.Scanner;
public class MediumRecursion {
    public static void main(String [] args){
        System.out.println(addDigits(123));
    }
    public static int addDigits(int n){
        // Base Case
        if(n == 0){
            return 0;
        }
        // recursive call and convergence
        return (n%10) + addDigits(n / 10);
}
}