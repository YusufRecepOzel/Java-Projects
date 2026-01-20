import java.util.Scanner;

public class Main {
    public static int sumOfDigits(int n, int exp) {
    if (n == 0) {
        return 0;
    }
    int lastDigit = n % 10;
    int remainingNumber = n / 10;
    return (int) Math.pow(lastDigit, exp) + sumOfDigits(remainingNumber, exp);
}
}
