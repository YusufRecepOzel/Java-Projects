import java.util.Scanner;

public class ArmstrongTopDown {
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int n = inp.nextInt();
      
      //boolean isArmstrong = true;
      if(isArmstrong(n))
         System.out.println(n + " is Armstrong.");
      else
         System.out.println(n + " is not Armstrong.");
   }
   
   public static boolean isArmstrong(int n) {
      int count = countDigits(n);
      int sum = sumOfDigits(n, count);
      return sum == n;
//       if(sum == n)
//          return true;
//       else
//          return false;
   }
   
   public static int countDigits(int n){ 
      if(n == 0)
         return 1;
      return (int)Math.log10(n) + 1;
//      return 0;
   }

   public static int sumOfDigits(int n, int exp){ 
      int sum = 0;
      for(int i = 0; i < exp; i++)
      while(n > 0) {
         sum += Math.pow(n % 10, exp);
         n /= 10;
      }
      return sum;
      // In today's lesson we talked about this method. I gave a "take home" thought assignment.
      // The first ten (10) students to contact me with a solution to this will receive 10 points on
      // their quiz total this semester. NOTE: the solution can only use tools that we have already discussed
      // in this course.
   }
}