public class MatrixRotator {
    public static void main(String[] args) {

        // 3x3 Test Matrix
        int[][] input = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("=== SMART MATRIX ROTATOR TESTS ===\n");
        System.out.println("Original Matrix:");
        printMatrix(input);

        System.out.println("--- Rotating 90 Degrees Right ---");
        int[][] res90 = rotate(input, 90);
        printMatrix(res90);

        System.out.println("--- Rotating 180 Degrees Right ---");
        int[][] res180 = rotate(input, 180);
        printMatrix(res180);

        System.out.println("--- Rotating 270 Degrees Right ---");
        int[][] res270 = rotate(input, 270);
        printMatrix(res270);

        System.out.println("--- Rotating 360 Degrees Right ---");
        int[][] res360 = rotate(input, 360);
        printMatrix(res360);

        System.out.println("--- Rotating 450 Degrees Right ---");
        int[][] res450 = rotate(input, 450);
        printMatrix(res450);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("]");
        }
    }
    public static int [][] rotate(int [][] matrix , int degrees){
        int a = matrix.length;
        int count = ((degrees+45) / 90)%4;
        int [][] firstMatrix = matrix;       
        for(int z = 0 ; z < count ; z++){
        int [][] tempMatrix = new int[a][a];        
        for(int i = 0; i < a ; i++){
            for(int j = 0 ; j < a ; j++){               
                int number = firstMatrix[i][j];
                int newRow = j;
                int endNumber = a - 1;
                int newColumn = endNumber - i;
                tempMatrix[newRow][newColumn] = number;
                }    
     }
        firstMatrix = tempMatrix;
        
   }
        return firstMatrix;
        }
}