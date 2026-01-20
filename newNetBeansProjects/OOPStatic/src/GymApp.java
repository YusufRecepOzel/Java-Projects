
public class GymApp {
    public static void main(String [] args){
        int [] yusufCalories = {10 , 20 , 30 , 40 , 50};
        int [] aliCalories = {1 , 2, 3, 4, 5};
        int [] ayşeCalories = {100 , 200 , 300 , 400 , 500};
        FitnessMember yusuf = new FitnessMember("Yusuf" , 102 , yusufCalories);
        System.out.println(FitnessMember.getGymSummary());
        FitnessMember ali = new FitnessMember("Ali" , 101 , aliCalories);
        System.out.println(FitnessMember.getGymSummary());
        FitnessMember ayşe = new FitnessMember("Ayşe" , 100 , ayşeCalories);
        FitnessMember[] members = {yusuf , ali , ayşe};
        int [] overallAverage = new int[3];
        for(int i = 0 ; i < overallAverage.length ; i++){
            overallAverage[i] = members[i].calculateMemberAverage();
            System.out.println(members[i].toString());
        }
        System.out.println(overallAverage[1]);
        System.out.println(FitnessMember.getGymSummary());
    }
}
