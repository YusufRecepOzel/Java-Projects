
public class Workers {
    protected String nameSurname , email , telephone;
    public String signin(){
        return this.nameSurname + "signed in";
    }
    public Workers(String nameSurname , String email , String telephone){
        this.nameSurname = nameSurname;
        this.email = email;
        this.telephone = telephone;
    }
    public static void launch(Workers[] launch){
        for(int i = 0 ; i < launch.length ; i++){
            System.out.println(launch[i].orderLaunch());
        }
    }
    public String orderLaunch(){
        return this.nameSurname + ": ordered";
    }
    public String getNameSurname(){
        return this.nameSurname;
    }
    public void setnameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String telephone(){
        return this.telephone;
    }
    public void telephone(String telephone){
        this.telephone = telephone;
    }
}
