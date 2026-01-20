
import java.util.Scanner;
public class Library {
    private Contact contact;
    private Book book;
    private Loan loan;
    private Member member;
    private Process process;
    public Library(Contact contact , Book book , Loan loan , Member member , Process process){
        this.book = book;
        this.contact = contact;
        this.loan = loan;
        this.member = member;
        this.process = process;
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        
        Process process = new Process();
        process.login();
        process.getinformation();
        System.out.println("our composition is ordered from smallest to largest. Please You have to take this one seriously.");
        System.out.println("Contact connected to Member , Book and Member are connected to Loan and Loan and Process are connected to Library");
        System.out.println("Also Book has EBook and Printedbook(Ýnheritence)");
        System.out.println("But The Book class is abstract class you can't use that class but you can use PrintedBook and EBook");
        while(true){
        System.out.println("What is your process Loan , EBook , Printedbook , Member or Contact");
        String a = scanner.nextLine();
        if("Contact".equals(a)){
            Contact contact = new Contact("yusuf61@gmail.com" , 12345678 , "Dere Mahallesi");
            contact.getinformation();
            contact.change();
            scanner.nextLine();
        }
        if("Member".equals(a)){
            Contact contact = new Contact("yusuf61@gmail.com" , 12345678 , "Dere Mahallesi");
            Member member = new Member("Yusuf" , 12345 , contact , "Beyaz Diþ");
            member.getinformation();
            member.members_books();
            scanner.nextLine();
        }
        if("PrintedBook".equals(a)){
            PrintedBook printedBook = new PrintedBook("Hayvan Çiftliði" , "George Orwell" , "23435434123anD1223" , 1945 , 152 , "4D");
            printedBook.getinformation();
            printedBook.importantinfo();
            scanner.nextLine();
        }
        if("EBook".equals(a)){
            EBook eBook = new EBook("Hayvan Çiftliði" , "George Orwell" , "23435434123anD1223" , 2153,28 , "hayvançiftliði.com");
            eBook.getinformation();
            eBook.importantinfo();
            scanner.nextLine();
        }
        if("Loan".equals(a)){
            EBook eBook = new EBook("Hayvan Çiftliði" , "George Orwell" , "23435434123anD1223" , 2153,28 , "hayvançiftliði.com");
            PrintedBook printedBook = new PrintedBook("Hayvan Çiftliði" , "George Orwell" , "23435434123anD1223" , 1945 , 152 , "4D");
            Member member = new Member("Yusuf" , 12345 , contact , "Beyaz Diþ");
            Loan loan = new Loan(book, member, "23/05/2024", "12/02/2025");
            loan.loan();
            scanner.nextLine();
        }
        else{
            System.out.println("Wrong process Please try again");
            continue;
        }
        }
        
        
    
    }
}