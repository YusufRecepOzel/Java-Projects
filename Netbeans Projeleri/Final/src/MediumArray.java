import java.util.Arrays;
public class MediumArray {
    public static void main(String [] args){
        int k = 0;
        int [] arr = {10,20,30,40,50};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int first = arr[0];
        for(int i = 1 ; i< arr.length ; i++){
            arr[k] = arr[i];
            k++;
        }
        arr[arr.length - 1] = first;
        System.out.println("After Shifting Left: " + Arrays.toString(arr));
    }
}
