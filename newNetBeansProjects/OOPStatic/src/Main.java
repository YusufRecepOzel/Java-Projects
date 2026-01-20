
public class Main {
    public static void main(String [] args){
        System.out.println("Online Student: " + Student.howStudent());
        Student student1 = new Student("Ali" , 220 , 100);
        Student student2 = new Student("Ayşe" , 330 , 90);
        student1.exit();
        System.out.println("Online Student: " + Student.howStudent());
        Student student3 = new Student("Mehmet" , 200 , 80);
        System.out.println("Online Student: " + Student.howStudent());
        int[] notlar = new int[3];
        notlar[0] = student1.point;
        notlar[1] = student2.point;
        notlar[2] = student3.point;
        System.out.println(Student.calcMean(notlar));
    }
}
