import java.util.Arrays;
public class FinalExam2024 {
    
    public static int stepCount(int n){
        System.out.println("For the input: " + n);
        int count = 0;
        while(n != 6174){
            n = sortIncreasing(n) - sortDecreasing(n);
            System.out.println(count + ". " + sortDecreasing(n) + " - " + sortIncreasing(n) + " = " + n);
            count++;
        }
        System.out.println("Total steps = " + count);
        return count;
    }
    public static boolean isValidKaprekar(int n){
        String s = n + "";
        if(s.length()>1 && s.length() < 5){
            return true;
        }
        return false;
    }
    public static int sortIncreasing(int n){
        int k = 0;
        String s = n + "";
        int [] newN = new int[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            newN[i] = s.charAt(k) - '0';
            k++;
        }
        Arrays.sort(newN);
        n = 0;
        for(int i = 0 ; i < newN.length ; i++){
            n =(n*10) + newN[i];
        }
        return n;
    }
    public static int sortDecreasing(int n){
     int k = 0;
        String s = n + "";
        int [] newN = new int[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            newN[i] = s.charAt(k);
            k++;
        }
        int t = 4;
        Arrays.sort(newN);
        int [] newNumber = new int[s.length()];
        for(int i = 0 ; i < newN.length ; i++){
            newNumber[t] = newN[i];
            t--;
        }
        n = 0;
        for(int i = 0 ; i < newN.length ; i++){
            n =(n*10) + newNumber[i];
        }
        return n;
    }
    public static void main(String [] args){
        if(args.length < 1 || args.length > 4){
        System.out.println(args + " is not a valid value");
    }
        if(args == null){
            System.out.println("No Values Passed");
        }
    }
}
