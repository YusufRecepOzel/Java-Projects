
public class Assistant extends Academician{
    private String postgraduate;
    public Assistant(String nameSurname , String email , String telephone,String departmant, String duty, String classes , String postgraduate){
        super(nameSurname , email , telephone , departmant , duty , classes);
        this.postgraduate = postgraduate;
    }
    public String getPostgraduate() {
        return postgraduate;
    }
    public void setPostgraduate(String postgraduate) {
        this.postgraduate = postgraduate;
    }
    public String signin(){
        return super.signin();
    }
    public String ReadExam(String grade){
        return getNameSurname() + " readed " + grade + " Exams";
    }
}
