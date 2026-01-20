
public class Deneme2 {
    public static void main(String [] args){
        String email = "yusuf@gmail.com";
        int a = email.indexOf("@");
        String b = email.substring(0,a);
        System.out.println(b);
    }
}
