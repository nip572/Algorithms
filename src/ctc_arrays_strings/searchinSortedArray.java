package ctc_arrays_strings;

/**
 * Created by Nipun on 10/25/16.
 */
//77,78,80,27,29,43,
// 0, 1, 2, 3 ,4, 5,

public class searchinSortedArray {

    public  static void doOperation(int[] arr){
        int start = 0;
        int end = arr.length-1;

        if(arr[start] < arr[end]){
            return  ;
        }
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] < arr[mid +1]){

            }
        }
    }
}
