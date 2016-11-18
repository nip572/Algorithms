package ctc_arrays_strings;

/**
 * Created by Nipun on 10/22/16.
 */
public class BinarySearchInSortedArray {

        public static int doOperation(int[] arr , int num){

            int start = 0;
            int end = arr.length-1;
            int mid;

            if(arr == null){
                return -1;
            }

            while(start <= end){
                mid = (start + end)/2;
                if( num == arr[mid]){
                    return mid;
                }
                else if (num > arr[mid]){
                    start = mid +1 ;
                }
                else {
                    end = mid -1 ;
                }

            }
            return  -1;
        }

    public static  void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int a = doOperation(arr , 0);
        System.out.println("value is " + a);
    }

}
