
public class Main {
    public static void main(String [] args){
        Book b1 = new Book("Harry Potter" , 400 , "Rowling" , "Ekşi Yayıncılık");
        b1.setNumberOfPage(-400);
        System.out.println(b1.getNumberOfPage());
        Book b2 = new Book("The Lord Of The Rings" , 500 , "Peter Jackson" , "Ekşi Yayıncılık");
        b2.setName("Lord Of The Rings");
        System.out.println(b2.getName());
    }
}
