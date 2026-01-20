
public class Student {
    public String name;
    public int id;
    public int point;
    private static int onlineCounter = 0;
    public Student(String name , int id , int point){
        this.name = name;
        this.id = id;
        this.point = point;
        Student.onlineCounter++;
    }
    public static int howStudent(){
        return Student.onlineCounter;
    }
    public int exit(){
        return Student.onlineCounter--;
    }
    public static double calcMean(int [] arr){
        double overall = 0;
        for(int i = 0 ; i < arr.length ; i++){
            overall = overall + arr[i];
        }
        return overall / arr.length;
    }
}
