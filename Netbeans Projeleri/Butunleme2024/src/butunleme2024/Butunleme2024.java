
public class Butunleme2024 {
    public static int [][] parts(int n){
        int intFirst = 0;
        int intSecond = 0;
        String first = "";
        String second = "";
            String s = n + "";
            int k = 0;
            int [][] sum = new int[s.length()-1][2];
            for(int i = 1; i<s.length() ; i++){
                first = s.substring(0 , i);
                second = s.substring(i);
                intFirst = Integer.valueOf(first);
                intSecond = Integer.valueOf(second);
                sum[k][0] = intFirst;
                sum[k][1] = intSecond;
                k++;
            }
            return sum;
    }
    public static boolean isKaprekar(int n){
        int [][] prob = parts(n);
        for(int i = 0; i < prob.length ; i++){
            int sol = prob[i][0];
            int sağ = prob[i][1];
            if(sol + sağ == n && sol != 0 && sağ != 0){
                return true;
            }
        }
        return false;
    }
    public static int [] kaprekarPair(int n){
        int [][] prob = parts(n);
        for(int i = 0; i < prob.length ; i++){
            int sol = prob[i][0];
            int sağ = prob[i][1];
            if(sol + sağ == n && sol != 0 && sağ != 0){
                return prob[i];
            }
        }
        return new int[0];
    }
    public static void displayResult(int n){
        if(isKaprekar(n)){
            System.out.println("N = " + n);
            System.out.println("N*N = " + (n*n));
            for()
    }
    public static void main(String [] args){
        
    }
}
