
import java.util.Scanner;

public class PrintedBook extends Book{
    private int pages;
    private String shelflocation;
    public PrintedBook(String title , String author , String isbn , int publicationyear , int pages , String shelflocation){
        super(title, author, isbn, publicationyear);
        this.pages = pages;
        this.shelflocation = shelflocation;
    }
    public void getinformation(){
        super.getinformation();
        System.out.println("Book Pages is : " + pages);
        System.out.println("Shelf Location is: " + shelflocation);
    }
    public void importantinfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much your book weight ?");
        double weight = scanner.nextDouble();
        double cost = weight * 10;
        System.out.println("Your Book Cost is : " + cost);
    }
}
