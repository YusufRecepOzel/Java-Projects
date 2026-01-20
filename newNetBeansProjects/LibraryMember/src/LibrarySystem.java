import java.util.Scanner;
public class LibrarySystem {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please write your name");
        String name = scanner.nextLine();
        System.out.println("Please write your type. Our types are guest , teacher , student");
        String type = scanner.nextLine();
        System.out.println("How many books are you borrowed");
        int books = scanner.nextInt();
        System.out.println("How many books are in the overdue. Please write");
        int overdueBook = scanner.nextInt();
        LibraryMember library = new LibraryMember(name , type , books , overdueBook);           
        System.out.println(library.toString());
    }
}
