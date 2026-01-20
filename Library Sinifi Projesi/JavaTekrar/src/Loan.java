
public class Loan {
    private Book book;
    private Member member;
    private String loandate;
    private String returndate;
    public Loan(Book book , Member member , String loandate , String returndate){
        this.book = book;
        this.loandate = loandate;
        this.member = member;
        this.returndate = returndate;
    }
    public void loan(){
        System.out.println("The Book name is: " + book);
        System.out.println("The Member is: " + member);
        System.out.println("The Loan Date is: " + loandate);
        System.out.println("The Return Date is: " + returndate);
        
    }
}
