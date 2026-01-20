
public class Main2 {
    public static void main(String [] args){
        for(int i = 0 ; i <=12 ; i++){
            int result = factoriel(i);
            System.out.println(i + "! = " + result);
        }
    }
    public static int factoriel(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int result1 = 1;
        for(int a = 2 ; a <= n ; a++){
            result1 = result1 * a;
        }
        return result1;
    }
}
