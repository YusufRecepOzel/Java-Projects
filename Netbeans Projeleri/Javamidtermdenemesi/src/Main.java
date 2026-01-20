
import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write");
        String palindrome = scanner.nextLine();
        String lowerCasePalindrome = generatePalindrome(palindrome);
        String finalPalindrome = reverse(lowerCasePalindrome);
        if(lowerCasePalindrome.equals(finalPalindrome)){
            return true;
        }
        else{
            return false;
        }
    }   
    public static void main(String [] args){
        if(isPalindrome() == true){
            System.out.println("This is a Palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
    public static String generatePalindrome(String palindrome){
        String lowerCase =  palindrome.toLowerCase();
        return lowerCase;
    }
    public static String reverse(String lowerCasePalindrome){
        String a = "";
        for(int i = lowerCasePalindrome.length() - 1; i >=0 ; i--){
            char karakter = lowerCasePalindrome.charAt(i);
            a = a + karakter;
        }
        return a;
    }
    
}
