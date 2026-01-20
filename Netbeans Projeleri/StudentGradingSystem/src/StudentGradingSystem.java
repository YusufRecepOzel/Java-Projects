
public class StudentGradingSystem {
    public static void main(String[] args) {
        
        // ==========================================
        // SCENARIO 1: Standard Class (3 Exams)
        // ==========================================
        System.out.println("==========================================");
        System.out.println("TEST SCENARIO 1: Standard Class");
        System.out.println("==========================================");
        
        String[] classA_names = {"Alice", "Bob", "Charlie"};
        int[][] classA_grades = {
            {50, 60, 70},   // Lowest (50) dropped -> Avg: 65.0
            {40, 40, 40},   // Lowest (40) dropped -> Avg: 40.0
            {90, 100, 80}   // Lowest (80) dropped -> Avg: 95.0
        };
        
        // Running the system with Class A data
        runGradingSystem(classA_names, classA_grades);


        // ==========================================
        // SCENARIO 2: Larger Group & Edge Cases
        // ==========================================
        System.out.println("\n\n==========================================");
        System.out.println("TEST SCENARIO 2: Large Group & Edge Cases");
        System.out.println("==========================================");
        
        String[] classB_names = {"David", "Eve", "Frank", "Grace", "Heidi"};
        int[][] classB_grades = {
            {10, 20, 10, 20},   // Mixed low scores
            {100, 90, 95, 100}, // High performer
            {50, 50, 50, 50},   // Exact pass limit (50.0)
            {60, 70, 60, 70},   // Average student
            {0, 0, 0, 0}        // All zeros (Edge case)
        };

        // Running the system with Class B data
        runGradingSystem(classB_names, classB_grades);
    }

    public static void runGradingSystem(String[] names, int[][] grades) {
        System.out.println("\n--- DETAILED CLASS LIST ---");
        printClassList(names, grades);

        System.out.println("\n--- CLASS PERFORMANCE ANALYSIS ---");
        analyzeClassPerformance(grades);

        System.out.println("\n--- TOP STUDENT ---");
        String topStudent = findTopStudent(names, grades);
        System.out.println("Congratulations: " + topStudent);
    }

    public static double calculateAverage(int [] grades){
        if(grades == null || grades.length < 2){
            return 0.0;
        }
        double sum = 0;
        int max = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < grades.length ; i++){
        if(grades[i] < max){
            max = grades[i];
            index = i;            
        }        
    }
        for(int i = 0; i < grades.length ; i++){
          sum = sum + grades[i];  
        }
        sum = sum - max;
        sum = sum / (grades.length - 1);
        return sum;
    }
    public static String findTopStudent(String [] names , int [][] grades){
        String student = " ";
        double min = Double.MIN_VALUE;
        for(int i = 0 ; i < grades.length ; i++){
            double average = calculateAverage(grades[i]);
            if(average > min){
                min = average;
                student = names[i];
            }
        }
        return student;
    }
    public static void analyzeClassPerformance(int [][] grades){
        double sum = 0;
        for(int i = 0; i< grades.length ; i++){
            double average = calculateAverage(grades[i]);
            sum = sum + average;
        }
        sum = sum / grades.length;
        System.out.printf("Class General Average: %.2f\n", sum);
        int failedCount = 0;
        for(int i = 0 ; i < grades.length ; i++){
            if(calculateAverage(grades[i]) < 50.0){
                failedCount++;
            }
        }
        System.out.println("Number of Failed Students: " + (failedCount));
    }
    public static void printClassList(String [] names , int [][] grades){
        for(int i = 0 ; i < grades.length ; i++){
        System.out.printf("Student: %-10s | Average: %.1f\n", names[i], calculateAverage(grades[i]));        
        }        
    }
}
