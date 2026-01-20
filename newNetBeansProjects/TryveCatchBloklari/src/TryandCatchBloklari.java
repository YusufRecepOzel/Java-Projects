
public class TryandCatchBloklari {
    public static void main(String [] args){
        //int a = 30 / 0;// Unchecked Exception
        //int [] a = {1,2,3,4,5};
        //System.out.println(a[6]);
        //System.out.println("Burasi Calisiyor");
        try{
            int b = 30 / 12;
            int [] a = {1,2,3,4,5};
            System.out.println(a[4]);
           
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You overrunned the Array");
        }
        catch(ArithmeticException e){
            System.out.println("You can not divided a number to zero");            
        }
        catch(Exception e){
            System.out.println("An Error is executed");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("This one is working");
    }
}
