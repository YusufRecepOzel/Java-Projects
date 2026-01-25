
public class Inventory {
    private int weaponDamage;
    private String weaponName;
    private String armorType;
    private int armorDefense;
    private boolean food;
    private boolean firewood;
    private boolean water;
    public Inventory(){
        
    }
    public Inventory(String weaponName , int weaponDamage ,  String armorType , int armorDefense , boolean food , boolean firewood , boolean water){
    this.weaponDamage = weaponDamage;
    this.armorDefense = armorDefense;
    this.weaponName = weaponName;
    this.armorType = armorType;
    this.food = food;
    this.firewood = firewood;
    this.water = water;
    }
    public int getWeaponDamage() {
        return weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
    public int getArmorDefense() {
        return armorDefense;
    }
    public void setArmorDefense(int armorDefense) {
        this.armorDefense = armorDefense;
    }
    public String getWeaponName(){
        return this.weaponName;
    }
    public void setWeaponName(String weaponName){
        this.weaponName = weaponName;
    }
    public String getArmorType(){
        return this.armorType;
    }
    public void setArmorType(String armorType){
        this.armorType = armorType;
    }
    public boolean isFood() {
        return food;
    }
    public void setFood(boolean food) {
        this.food = food;
    }
    public boolean isFirewood() {
        return firewood;
    }
    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
    public boolean isWater() {
        return water;
    }
    public void setWater(boolean water) {
        this.water = water;
    }
    
}
