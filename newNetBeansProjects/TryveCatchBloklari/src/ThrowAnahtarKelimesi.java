import java.util.Scanner;

public class ThrowAnahtarKelimesi {
    public static void place_control(int age){
        if(age<18){
            throw new ArithmeticException();
            
        }
        else{
            System.out.println("You can enter the place");
        }
    }
       public static void main(String [] args){
           Scanner scanner = new Scanner(System.in);
           System.out.println("What is your age");
           int age = scanner.nextInt();
           try{
             place_control(age);   
           }
           catch(ArithmeticException e){
               System.out.println("Please leave this place nicely");
           }
           
       }
}
