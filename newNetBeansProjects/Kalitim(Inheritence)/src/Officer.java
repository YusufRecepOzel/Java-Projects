
public class Officer extends Workers{
    String departmant,shift;
    public Officer(String departmant, String shift , String nameSurname , String email , String telephone){
        super(nameSurname , email , telephone);
        this.departmant = departmant;
        this.shift = shift;
    }
    public String orderLaunch(){
    return super.orderLaunch() + " Quiet Sandwich";  
    }
    
}
