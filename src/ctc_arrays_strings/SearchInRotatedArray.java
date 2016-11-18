package ctc_arrays_strings;

/**
 * Created by Nipun on 11/7/16.
 */
public class SearchInRotatedArray {

    public static int doOperation(int[] arr , int data){

        int low = 0 ;
        int high  = arr.length -1;

        while(low <= high){

            int mid = (high + low)/2;
            if(data == arr[mid]){
                return mid;
            }

            if(arr[mid] <= arr[high]){
                if(data <=arr[high] && data > arr[mid]){
                    low = mid +1;
                }
                else {
                    high = mid -1;
                }
            }
            else {
                if(data >= arr[low] && data < arr[mid]){
                    high = mid -1;
                }
                else {
                    low = mid +1;
                }
            }
        }
        return  -1;
    }

    public static  void main(String[] args){


        int[] arr = {4,5,1,2,3};
        System.out.println(doOperation(arr , 5));
    }

}
