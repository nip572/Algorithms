package ctc_arrays_strings;

/**
 * Created by Nipun on 10/27/16.
 */
public class largestContiguosSubArrayWithMaxSum {

    public static int doOperation(int[] arr){

        if(arr.length == 0){
            return 0;
        }
        if(arr.length == 1){
            return arr[0];
        }
        int max_current = arr[0];
        int max_global = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            max_current = Math.max(arr[i] , max_current + arr[i]);
            if(max_current > max_global){
                max_global = max_current;
            }
        }
        return max_global;
    }

    public static void main(String[] args){

        int[] arr = {-1,-2 , -3 , 3 ,-2 , 6};
        int a = doOperation(arr);
        System.out.println(a);
    }
}
