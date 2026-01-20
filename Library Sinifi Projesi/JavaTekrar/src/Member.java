
import java.util.Scanner;


public class Member {
    private String books;
    private String name;
    private int memberId;
    private Contact contact;
    public Member(String name , int memberId , Contact contact , String books){
        this.contact = contact;
        this.memberId = memberId;
        this.name = name;
        this.books = books;
    }
    public void getinformation(){
        System.out.println("Your Name is : " + name);
        System.out.println("Your member ID is : " + memberId);
        contact.getinformation();
    }
    public void members_books(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your books are: " + books);
        System.out.println("If you want to give us library book first please provide the book title then the borrow date then the return date");
        System.out.println("Ýf you want to give us your book please provide your book title , book type and borrow date");
        System.out.println("What is your process please write library book or your book");
        System.out.println("Ýf you want to quit Please press q");
        while(true){  
            String a = scanner.nextLine();
            if("library book".equals(a)){
                System.out.println("What is your book name");
                System.out.println("Please you can write one by one");
                String b = scanner.nextLine();
                System.out.println("What is the borrow date please write DD MM YYYY");
                String c = scanner.nextLine();
                System.out.println("What is the return date");
                String d = scanner.nextLine();
                System.out.println( b  + " was taken by library.");
                System.out.println("Thank you for giving our book. You can try another type of book in our library.");
                continue;
            }
            if("your book".equals(a)){
                System.out.println("What is your book name");
                System.out.println("Please you can write one by one");
                String e = scanner.nextLine();
                System.out.println("What is the book type");
                String f = scanner.nextLine();
                System.out.println("What is the borrow date please write DD MM YYYY");
                String g = scanner.nextLine();
                System.out.println(e  + " was taken by library.");
                System.out.println("Also we have a gift for you. you have to have a conversation with our telesecreter then you can take your gift.");
                continue;
            }
            if("q".equals(a)){
                System.out.println("Çýkýþ Yapýlýyor...");
                break;
            }
            else{
                System.out.println("This is a wrong process Please try again");
                continue;
            }
            
        }
    }
}
