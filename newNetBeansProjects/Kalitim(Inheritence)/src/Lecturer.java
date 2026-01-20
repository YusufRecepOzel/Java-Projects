
public class Lecturer extends Academician{
    private String degree;
    public Lecturer(String nameSurname , String email , String telephone,String departmant, String duty, String classes , String degree){
        super(nameSurname , email , telephone , departmant , duty , classes);
        this.degree = degree;
    }
    public String signin(){
        return this.degree + super.signin();
    }
    public String orderLaunch(){
        return this.degree + super.orderLaunch() + " and Gourmet Streak";
    }
    public String ReadExam(String grade){
        return getDegree() + getNameSurname() + " readed " + grade + " Exams";
    }
    public String getDegree(){
        return this.degree;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }
}
