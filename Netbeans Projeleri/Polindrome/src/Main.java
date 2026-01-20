
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // Problem 1 - is the integer entered a prime number?
//       System.out.print("Enter an integer: ");
//       int n = input.nextInt();
//       int div = 2;
//       while(n % div != 0 && div < n)
//          div++;
//       if(div < n)
//          System.out.println(n + " is not prime. It is divisible by " + div);
//       else
//          System.out.println(n + " is prime");
      
      // Problem 2 - is the string entered a palindrome?
      System.out.print("Enter a String: ");
      String text = input.nextLine();
      int first = 0, last = text.length()-1;
      while(text.charAt(first) == text.charAt(last)
         && first < last) {
         first++;
         last--;
      }
      
      if(first >= last)
         System.out.println(text + " is a palindrome");
      else
         System.out.println(text + " is not a palindrome");
      
      
   }
}
