import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to EBOB system");
        System.out.println("Please write number 1");
        int number1 = scanner.nextInt();
        System.out.println("Please write number 2");
        int EBOB = 0;
        int EBOB2 = 0;
        int number2 = scanner.nextInt();
            if(number1 > number2){
               for(int i = 1 ; i < number1 ; i++){
                if ((number1 % i == 0) && (number2 % i == 0)){
                    EBOB = i;
            } 
            }
            
            }
            System.out.println("Your EBOB: " + EBOB);
            if(number2 > number1){
              for(int i = 1 ; i < number2 ; i++){
                if ((number1 % i == 0) && (number2 % i == 0)){
                 EBOB2 = i;
            } 
            }  
            }
            System.out.println("Your EBOB: " + EBOB2);
    }  
}
