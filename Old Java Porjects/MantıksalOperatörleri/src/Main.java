
public class Main {
    public static void main(String [] args){
        /*
        Mantıksal Operatörler
        && ---> and Operatörü
        Bütün sonuçlar kendi içinde true ise genel sonuç true, en az birisi bile false ise genel sonuç false olur.
        || ---> or operatörü
        Sonuçlardan en az birisi bile true ise genel sonuç true, hepsi false ise genel sonuç false olur.
        
        ! ---> not operatörü
        bu operatör true olanı false ye false olanı true ye çevirir.
        */
        /*
        System.out.println(3==3);
        System.out.println(2 > 3); 
        System.out.println(3 != 3 || 2 > 3 || "Yusuf" != "Yusuf");
        
        System.out.println(! (3 < 4)); */
        System.out.println(!((3 < 4 && "Yusuf" == "Yusuf") || 3.4 > 2.1));
        
    }
    
}
