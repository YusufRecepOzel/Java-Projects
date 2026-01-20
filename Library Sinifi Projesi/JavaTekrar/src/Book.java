
public abstract class Book {
   private String title;
   private String author;
   private String isbn;
   private int publicationyear;
   public Book(String title , String author , String isbn , int publicationyear){
       this.author = author;
       this.isbn = isbn;
       this.publicationyear = publicationyear;
       this.title = title;
   }
   public void getinformation(){
       System.out.println("The Book Title is: " + title);
       System.out.println("The Book isbn: " + isbn);
       System.out.println("The book author: " + author);
       System.out.println("The book Publication Year: " + publicationyear);
   }
   public abstract void importantinfo();
}
