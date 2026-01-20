
import java.util.Scanner;

public class Process {
    private String name;
    private String surname;
    private String email;
    private String password;
    public void signup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name");
        name = scanner.nextLine();
        System.out.println("What is your surname");
        surname = scanner.nextLine();
        System.out.println("What is your email");
        email = scanner.nextLine();
        System.out.println("What is your password");
        password = scanner.nextLine();
        System.out.println("The process is completed. Please Log in. ");
        login();
    }
    public void login(){
        Scanner scanner = new Scanner(System.in);
        if(name == null || email == null || surname == null || password == null){
            System.out.println("You arent sign up yet. Please sign up");
            signup();
        }
        while(true){
        System.out.println("Please log in with your email");
        String a = scanner.nextLine();
        System.out.println("Please log in with your password");
        String b = scanner.nextLine();
        if(a.equals(email) && b.equals(password)){
            System.out.println("Login successful Please login your process");
            break;
        }
        if(!a.equals(email) || !b.equals(password)){
            System.out.println("Your email or password is wrong. Please try again");
            continue;
        } 
        }      
}
       public void getinformation(){
       System.out.println("Your name is: " + name);
       System.out.println("Your email is: " + email);
       System.out.println("Ýf you see your password please you have to login with your password again");
       login();
       System.out.println("Your password is: " + password);
}
}
