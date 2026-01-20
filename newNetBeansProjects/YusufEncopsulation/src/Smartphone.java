
public class Smartphone {
    private String brand;
    private double price;
    private int storage;
    private int productionYear;
    private final int serialNumber;
    private static String storeName;
    public static int totalPhonesCreated;
    public Smartphone(String brand , double price , int storage , int productionYear , int serialNumber){
        this.brand = brand;
        this.price = price;
        this.storage = storage;
        this.productionYear = productionYear;
        this.serialNumber = serialNumber;
        totalPhonesCreated++;
    }
    public int getSerialNumber(){
        return this.serialNumber;
    }
    public static String getStoreName(){
        return Smartphone.storeName;
    }
    public static void setStoreName(String storeName){
        Smartphone.storeName = storeName;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getProductionYear(){
        return this.productionYear;
    }
    public int getStorage(){
        return this.storage;
    }
    public void setStorage(int storage){
        if(storage < 1){
            System.out.println("Error Please write positive numbers.");
            return;
        }
        for(int i = 0; i < 31 ; i++){
            if(storage == Math.pow(2 , i)){
                this.storage = storage;
            }        
        }   
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        if(price<0){
            price = 10000;
            this.price = price;
        }
        else{
            this.price = price;
        }
    }
    public double calculateDiscount(){
        if(productionYear>=2024){
            return this.price;
        }
        else if(productionYear>=2022 && productionYear <= 2023){
            return this.price * 0.85;
        }
        else if(productionYear<2022){
            return this.price * 0.70;
        }
        return this.price;
    }
    public String toString(){
        return ("Brand: " + this.brand + "\n"
             + "Production Year: " + this.productionYear + "\n"
             + "Price: " + this.price);
    }
}
