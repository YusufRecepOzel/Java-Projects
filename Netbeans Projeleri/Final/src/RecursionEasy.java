
public class RecursionEasy {
    public static void main(String [] args){
        int i = 5;
        int sum = recursion(i);
        System.out.println(sum);
    }
    public static int recursion(int i){       
        if(i==1){
            return 1;
        }
        return i = (i) + recursion(i-1); 
    }
}
