
public class Main {
    public static void main(String [] args){
        //Academician a = new Academician("Ahmet Yılmaz" , "a@gmail.com" , "0505" , "CENG" , "Professor" , "CSE101");
        Lecturer l = new Lecturer("Joseph William Ledet" , "j@gmail.com" , "000" , "CSE" , "Professor" , "CENG 102" , "Prof. Dr.");
        Officer o = new Officer("Veli Can" , "v@gmail.com" , "Veli" , "IT" , "Full Time" );
        Assistant as = new Assistant("Yusuf Recep Özel" , "yusuf@gmail.com" , "0506" ,"CSE", "LAB", "101 and 102" , "AI and Machine Learning");
        Workers w = new ITworker("CSE101", "Night" , "Ayşe Demir" , "A@gmail.com" , "501" , "Check Security Cameras");
        //Workers [] launch= {a,l,o,w};
        //Workers.launch(launch);
        System.out.println(l.ReadExam("2. Grade"));
        System.out.println(as.ReadExam("1. Grade"));
    }
    
}
