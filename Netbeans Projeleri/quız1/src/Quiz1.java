import java.util.Scanner;
public class Quiz1 {
   public static void main(String[] args) {
      
      System.out.print("Enter two integers: ");
      Scanner inp = new Scanner(System.in); // 2
      int n1 = inp.nextInt(); // 2
      int n2 = inp.nextInt(); // 2
      
      System.out.print("How should we divide? (1 for integer division, 2 for decimal): ");
      int choice = inp.nextInt(); // 2
      if(choice == 1) // integer division
         System.out.println((n1 / n2) + " with a remainder of " + (n1 % n2)); // 4 + 4
      else // decimal division
         System.out.println(1.0 * n1 / n2); // 4
      
      
      
      
      
   }
}