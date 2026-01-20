import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class FileReader {
    public static void main(String [] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("File.txt"));
        while(scanner.hasNext()){
            String veri = scanner.next();
            System.out.println("Okunan parca " + veri);
        }
    }
}
