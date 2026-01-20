
import java.time.Clock;
import java.util.Scanner;


public class Main {
    /*
    if (koşul) {
    
    }
    else if (başka bir koşul) {
    
    
    }
    else if (başka bir koşul) {
    
    }
    else {
    
    }
    
    */
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu Giriniz");
        double not = scanner.nextDouble();
        
        if (not >= 88 && not <= 100) {
            System.out.println("AA"); 
        }
        else if (87 >= not && not>= 81) {
            System.out.println("BA");
            
        }
        else if (80 >= not && not>= 74){
            System.out.println("BB");
            
        }
        else if (not <= 73 && not >=68) {
            System.out.println("BC");
            
        }
        else if ( not <= 67 && not >= 60)
            System.out.println("CC");
        else {
            System.out.println("Kaldınız veya Büte Kaldınız");
        }
    }
    
}
/* if ile else if arasındaki fark eğer iç içe if olursa 
ordaki ifler birbirine bakıp çalıştırmazken else ifteki 
üçüncü ikinciye bakıp o çalışırsa artık ben çalışmam diyip
göstermiyor fakat ifte 2. ve 3.yü aynı anda çalıştırıp 
herşeyi gösteriyor ÇOK ÖNEMLİ!!!!!
*/