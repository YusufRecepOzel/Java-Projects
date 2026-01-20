
public class StoreApp {
    public static void main(String [] args){
        System.out.println(Smartphone.totalPhonesCreated);
        Smartphone samsung = new Smartphone("Samsung" , 59000 , 256 , 2023 , 101);
        System.out.println(Smartphone.totalPhonesCreated);
        Smartphone iphone = new Smartphone("İphone" , 80000 , 128 , 2021 , 202);
        Smartphone.setStoreName("Yusuf Store");
        System.out.println(Smartphone.getStoreName());
        System.out.println(samsung.getPrice());
        samsung.setPrice(-59000);
        System.out.println(samsung.getPrice());
        System.out.println(iphone.getStorage());
        iphone.setStorage(256);
        System.out.println(iphone.getStorage());
        System.out.println(samsung.toString());
        System.out.println(iphone.toString());
        System.out.println(Smartphone.totalPhonesCreated);
    }
}
