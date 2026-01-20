
public class Academician implements IWorkers{
    String nameSurname,departmant,duty;
    public Academician(String nameSurname, String departmant , String duty){
        this.nameSurname = nameSurname;
        this.departmant = departmant;
        this.duty = duty;
        System.out.println(this.school);
    }
    public String getDepartmant() {
        return departmant;
    }
    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }
    public String getDuty() {
        return duty;
    }
    public void setDuty(String duty) {
        this.duty = duty;
    } 
    @Override
    public void signin(){
        System.out.println("Entered");
    }
    @Override
    public void logout(){
        System.out.println("Exitted");
    }
    @Override
    public boolean meal(int time){
        System.out.println("The meal has eaten");
        return true;
    }
    public String getNameSurname(){
        return this.nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
}
