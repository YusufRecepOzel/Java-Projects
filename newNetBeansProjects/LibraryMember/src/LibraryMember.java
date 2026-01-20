
public class LibraryMember {
    public String name;
    public String memberType;
    public int booksBorrowed;
    public int daysOverdue;
    public LibraryMember(String name , String memberType , int booksBorrowed , int daysOverdue){
        this.name = name;
        this.memberType = memberType;
        this.booksBorrowed = booksBorrowed;
        this.daysOverdue = daysOverdue;
    }
    public double calculateFine(){
        double fine = 0;
        if(this.memberType.equalsIgnoreCase("Teacher")){
            fine = (daysOverdue* 0.5);
        }
        else if(this.memberType.equalsIgnoreCase("Student")){
            fine = (daysOverdue* 1.5);
        }
        else if(this.memberType.equalsIgnoreCase("Guest")){
            fine = (daysOverdue* 3.0);
        }
        return fine;
    }
    public boolean borrowLimitExceeded(){
        if(this.memberType.equalsIgnoreCase("Student")){
            if(this.booksBorrowed<=5){
                return false;
            }
        }
        else if(this.memberType.equalsIgnoreCase("Teacher")){
            if(this.booksBorrowed<=15){
                return false;
            }
        }
        else if(this.memberType.equalsIgnoreCase("Guest")){
            if(this.booksBorrowed<=2){
                return false;
            }
        }
         System.out.println("Warning: You cannot borrow any more books!");
            if(this.memberType.equalsIgnoreCase("Student")){
                this.booksBorrowed = 5;
            }
            if(this.memberType.equalsIgnoreCase("Teacher")){
                this.booksBorrowed = 15;
            }
            if(this.memberType.equalsIgnoreCase("Guest")){
                this.booksBorrowed = 2;
            }
        return true;
    }
    public int calculateMembershipScore(){
        int calc = (this.booksBorrowed * 10) - (this.daysOverdue * 2);
        if(calc<0){
            return 0;
        }
        return calc;
    }
    public String toString(){
        return "Name: " + this.name + "\n"
             + "Member Type: " + this.memberType + "\n"
             + "Books Borrowed: " + this.booksBorrowed + "\n"
             + "Days Overdue: " + this.daysOverdue + "\n"
             + "Fine: " + calculateFine() + "\n"
             + "Borrow Limit: " + borrowLimitExceeded() + "\n"
             + "Score: " + calculateMembershipScore() + "\n";
    }
}
