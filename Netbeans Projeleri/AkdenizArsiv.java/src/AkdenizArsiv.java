import java.io.*;
import java.util.Date;
public class AkdenizArsiv {
    public static void main(String[] args) throws IOException{
        File folder = new File("documents");
        System.out.println(folder.getAbsolutePath());
        try{
            System.out.println(folder.getCanonicalPath());
        }
        catch(IOException e){
            System.out.println("An Error Occurred Please Try Again");
        }
        System.out.println(folder.getName());
        System.out.println(folder.getPath());
        System.out.println(folder.getParent());
        long time = folder.lastModified();
        Date sonDegisimTarihi = new Date(time);
        System.out.println("Son Tarih " + sonDegisimTarihi);
        System.out.println(folder.length());
        File [] list = folder.listFiles();
        for(File f : list){
            System.out.println("- " + f.getName());
        }
        File file = new File("HelloWorld");
        boolean succeed = file.mkdir();
        System.out.println(succeed);
        System.out.println(file.delete());
    }
}
