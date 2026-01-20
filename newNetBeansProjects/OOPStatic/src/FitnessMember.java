
public class FitnessMember {
    public String name;
    public int memberId;
    private int [] workoutCalories;
    private static int countMembers = 0;
    private static int totalCalories = 0;
    public FitnessMember(String name , int memberId , int [] userCalories){
        this.name = name;
        this.memberId = memberId;
        this.workoutCalories = userCalories;
        FitnessMember.countMembers++;
        for(int i = 0 ; i < userCalories.length ; i++){
            FitnessMember.totalCalories += userCalories[i];
        }
    }
    public int calculateMemberAverage(){
        int sum = 0;
        for(int i = 0 ; i < this.workoutCalories.length ; i++){
            sum += this.workoutCalories[i];
        }
        int average = sum / 5;
        return average;
    }
    public static String getGymSummary(){
        return ("Active Users: " + FitnessMember.countMembers + "\n"
         + "Total Calories: " + FitnessMember.totalCalories);
    }
    public String toString(){
        return ("Name: " + this.name + "\n"
             + "Id: " + this.memberId + "\n"
             + "Calories: " + calculateMemberAverage());
    }
}
