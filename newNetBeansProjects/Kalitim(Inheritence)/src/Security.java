
public class Security extends Officer{
    private String document;
    public Security(String departmant, String shift , String nameSurname , String email , String telephone , String document){
        super(departmant , shift , nameSurname , email , telephone);
        this.document = document;
    }
}
