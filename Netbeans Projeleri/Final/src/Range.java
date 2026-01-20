
public class Range {
    public static void main(String [] args){
        range(5, 15, 3);
        range(5, 10);
        range(10);
    }
    public static int [] range(int start , int end , int step){
        int size = 0;
        int k = 0;
        if(start < end && step > 0){
        size = (int) Math.ceil((double)(end - start) / step);    
        }        
        int [] order = new int[size];
        for(int i = start ; i < end ; i = i+step){
            order[k] = i;
            k++;
        }
        return order;        
    }
    public static int [] range(int start , int end){
        int size = 0;
        int k = 0;
        if(start < end){
            size = end - start;
        }
        int [] order = new int[size];
        for(int i = start ; i < end ; i++){
            order[k] = i;
            k++;
        }
        return order;
    }
    public static int [] range(int end){
        int k = 0;
            int [] order = new int[end];
        for(int i = 0 ; i< end ; i++){
            order[k] = i;
            k++;
        }
        return order;
    }
}
