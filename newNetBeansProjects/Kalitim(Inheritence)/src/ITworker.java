
public class ITworker extends Officer{
    private String duty;
    public ITworker(String departmant, String shift , String nameSurname , String email , String telephone , String duty){
        super(departmant , shift , nameSurname , email , telephone);
        this.duty = duty;
    }
    public String orderLaunch(){
        return super.orderLaunch() + " and Pizza";
    }
}
