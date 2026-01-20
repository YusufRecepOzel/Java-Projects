
public class FinallyBlogu {
    public static void main(String [] args){
        try{
            int a = 30/0;
        }
        catch(NullPointerException e){
            System.out.println("Null Referance Error...");
        }
        finally{
            System.out.println("Finally Blog is working...");
        }
        System.out.println("Burasi Calisiyor");
    }
}
