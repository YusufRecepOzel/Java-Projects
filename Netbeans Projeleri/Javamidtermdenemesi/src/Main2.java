
public class Main2 {
    public static int sumOfDigits(int n, int exp){ 
    int sum = 0;
    for(int i = 0; i < exp; i++) {
        int lastDigit = n % 10;
        sum += Math.pow(lastDigit, exp);
        n /= 10; 
    }
    return sum;
}
}
