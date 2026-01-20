
public abstract class Academician extends Workers{
    String departmant,duty;
    String classes;

    public Academician(String nameSurname , String email , String telephone,String departmant, String duty, String classes){
        super(nameSurname,email,telephone);
        this.departmant = departmant;
        this.duty = duty;
        this.classes = classes;
    }
    public String orderLaunch(){
        return super.orderLaunch() + " Standard meal";
    }
    public String signin(){
        return super.signin() + " A gate";
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
    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void GoLectures(){
        System.out.println("Lectures Entered");
    }
    public abstract String ReadExam(String grade);
}
