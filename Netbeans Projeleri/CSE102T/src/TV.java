import java.util.Scanner;
public class TV {
    boolean status = false;
    int channel = 0;
     
    public void turnOn(){
        status = true;
        System.out.println
        }
     }
public int Channel(){
    while(true){
    Scanner scanner = new Scanner(System.in);
     System.out.println("Please write your channel number");
     int channel = scanner.nextInt();
     if(channel < 1 || channel > 120){
        System.out.println("This number does not exist. Please try again.");
        continue;
    }
     return channel;    
    }
     
}
public int soundLevel(){
    Scanner scanner = new Scanner(System.in);
    while(true){
    System.out.println("Please write your sound number");
    int sound = scanner.nextInt();
    if(sound < 0 || sound > 7){
        System.out.println("ERROR: there are much or less sound. Please try again.");
        continue;
    }
    return sound;    
    }
    
}
public int IncreaseNumber(int channel){
  int newChannel = channel + 1;
  return newChannel;
}
 public static void main(String [] args){
     Scanner scanner = new Scanner(System.in);
     TV mytv = new TV();  
     
     while(true){
         System.out.println("Please write your command");
         System.out.println("Your commands are tvstatus channel soundlevel and increasenumber Please write carefully");
         String command = scanner.nextLine();                
         if("tvstatus".equalsIgnoreCase(command)){
             status = mytv.TVStatus(status);
             if(status == false){
                 break;
             }
             else if(status == true){
                 continue;
             }
         }
         if("channel".equalsIgnoreCase(command)){
             channel = mytv.Channel();
             System.out.println("You are watching " + channel + " now.");
             continue;
         }
         if("soundlevel".equalsIgnoreCase(command)){
             int sound = mytv.soundLevel();
             System.out.println("Your sound is " + sound + " now");
             continue;
         }
         if("increasenumber".equalsIgnoreCase(command)){
             int newChannel = mytv.IncreaseNumber(channel);
             System.out.println("You are watching " + newChannel + " now");
             continue;
         }
         else{
             System.out.println("This is a wrong command please try again");
         }
     }
     System.out.println("The TV system is closed");
 }

}
