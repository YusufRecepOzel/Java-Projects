
public class EBook extends Book{
    private double filesizeMB;
    private String downloadlink;
    public EBook(String title , String author , String isbn , int publicationyear , double filesizeMB , String downloadlink){
        super(title, author, isbn, publicationyear);
        this.downloadlink = downloadlink;
        this.filesizeMB = filesizeMB;
    }
    public void getinformation(){
        super.getinformation();
        System.out.println("Book File Size(Mb) is " + filesizeMB);
        System.out.println("Book Download Link is: " + downloadlink);
    }
    public void importantinfo(){
        double downloadtime = filesizeMB / 120;
        System.out.println("Your download speed is: 2");
        System.out.println("Estimated download time is : " + downloadtime + " minutes");
    }
}
