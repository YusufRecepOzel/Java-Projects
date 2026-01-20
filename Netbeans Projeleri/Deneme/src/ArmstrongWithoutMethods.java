import java.util.Scanner;
import java.util.Date;

public class ArmstrongWithoutMethods {
   public static void main(String[] args)  {
      System.out.print("Enter an integer: " );
      Scanner inp = new Scanner(System.in);
      int n = inp.nextInt();
      int nOrig = n;
      int count = 0;
      if(n == 0)
         count = 1;
      while(n > 0) {
         count++;
         n /= 10;
      }
//      System.out.print(count);
      int sum = 0;
      n = nOrig;
      for(int i = 0; i < count; i++) {
         sum += Math.pow(nOrig % 10, count);
         nOrig /= 10;
      }
      if(n == sum)
         System.out.println("Armstrong");
      else
         System.out.println("Not Armstrong");

   }
}
