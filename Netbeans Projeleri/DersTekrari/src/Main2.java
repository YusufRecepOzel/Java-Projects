import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a char");
        String a = scanner.nextLine();
        int b = hexToDecimal(a);
        System.out.println(b);
    }
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch<= 'F'){
        return 10 + (ch - 'A');
        }
        else{
            return ch - '0';
        }
    }
    public static int hexToDecimal(String a){
        int lastNumber = 0;
        int hex = 16;
        for(int i = 0; i<= a.length() - 1; i++){
            char c = a.charAt(i);
            int number = hexCharToDecimal(c);
            int gecerlius = a.length() - 1 - i;
            lastNumber = lastNumber + ((int)Math.pow(hex,gecerlius)*number);
            
    }
        return lastNumber;
}
}