
import java.util.Scanner;

public class Contact {
    private String email;
    private int phonenumber;
    private String address;
    public Contact(String email , int phonenumber , String address){
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
    }
    public void getinformation(){
        System.out.println("Your Adress is: " + address);
        System.out.println("Your Email is : " + email);
        System.out.println("Your phone number is : " + phonenumber);
    }
    public void change(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can change your address , email or phone number");
        System.out.println("You have to give your process with these letters: address , email or phonenumber");
        System.out.println("You can't make 2 process at the same time. You have to do that one by one");
        System.out.println("Ýf you need to quit Please press q");
        while(true){
            System.out.println("What process will you choose. Please write it");
            String a = scanner.nextLine().toLowerCase();
            if("address".equals(a)){
                String temporary_adress;
                temporary_adress = address;
                System.out.println("You have to choose your new address");
                String b = scanner.nextLine();
                address = b;
                if(b.equals(temporary_adress)){
                    System.out.println("Your new address as same as your old address Please Try Again");
                    
                    continue;
                }
                if(b.equals(address)){
                    System.out.println("Your address has been updated successfuly");
                    System.out.println("Your Adress is: " + address);
                    address = b;
                    continue;
                }
                else{
                    System.out.println("You made an wrong process Please Try again");
                    continue;
                }
            }
            if("email".equals(a)){
                String temporary_email;
                temporary_email = email;
                System.out.println("You have to choose your new email");
                String c = scanner.nextLine();
                email = c;
                if(c.equals(temporary_email)){
                    System.out.println("Your new email as same as your old email Please Try Again");
                    continue;
                }
                if(c.equals(email)){
                    System.out.println("Your email has been updated successfuly");
                    System.out.println("Your Email is : " + email);
                    email = c;
                    continue;
                }
                else{
                    System.out.println("You made an wrong process Please Try again");
                    continue;
                }
            }
            if("phonenumber".equals(a)){
               int temporary_phonenumber;
                temporary_phonenumber = phonenumber;
                System.out.println("You have to choose your new phone number");
                int c = scanner.nextInt();
                scanner.nextLine();
                phonenumber = c;
                if(c == temporary_phonenumber){
                    System.out.println("Your new phonenumber as same as your old phonenumber Please Try Again");
                    continue;
                }
                if(c == phonenumber){
                    System.out.println("Your phone number has been updated successfuly");
                    System.out.println("Your phone number is : " + phonenumber);
                    phonenumber = c;
                    continue;
                }
            }
            if("q".equals(a)){
                System.out.println("ÇIKIÞ YAPILIYOR...");
                break;
            }
            else{
                System.out.println("You made an wrong process Please Try again");
                continue;
            }
        }
    }
}
