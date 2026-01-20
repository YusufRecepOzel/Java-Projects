import java.util.Scanner;

public class Deneme3 {
    public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a number");
      int number = scanner.nextInt();
      if(isPalindrome(number)){
          System.out.println("This is a Palindrome number");
      }
      else{
          System.out.println("This is not an Palindrome number");
      }  
    }
    public static boolean isPalindrome(int number){
        String s = number + "";
        String reversedS = "";
        for(int i = s.length() - 1; i>=0 ; i--){
            reversedS = reversedS + s.charAt(i);
        }
        if(reversedS.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
