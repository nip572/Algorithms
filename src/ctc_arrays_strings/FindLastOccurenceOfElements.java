package ctc_arrays_strings;

/**
 * Created by Nipun on 1/23/17.
 */
public class FindLastOccurenceOfElements {


    public static int doOperation(int[] arr , int n){

        if(arr ==  null || arr.length == 0){
            return -1;
        }

        int start = 0 ;
        int end = arr.length -1 ;
        int mid;
        int ptr = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if ((mid == end && arr[end] == n) ||( arr[mid] < arr[mid +1] && arr[mid] == n) ){
                return mid;
            }
          else if(arr[mid] <= n){
                start = mid +1;
            }

            else {
                end = mid -1;
            }
        }
        return ptr;
    }

    public static void main(String[] args){

        int[] arr = {1,2,2,3,4};
        System.out.println(doOperation(arr , 2));

    }


}
