
public class Main {
    public static void main(String [] args){
        HesapMakinesi hesap1 = new HesapMakinesi(10 , 5 , "Siyah");
        
        System.out.println(hesap1.sum());
        System.out.println(hesap1.sub());
        hesap1.sayı1 = 15;
        System.out.println(hesap1.divide());
        System.out.println(hesap1.multip());
        System.out.println(hesap1.color);
        HesapMakinesi hesap2 = new HesapMakinesi(8 , 3 , "Mavi");
        System.out.println(hesap2.sum());
        System.out.println(hesap2.sub());
        System.out.println(hesap2.color);
    }
}
