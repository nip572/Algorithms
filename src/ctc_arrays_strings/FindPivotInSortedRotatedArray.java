package ctc_arrays_strings;

/**
 * Created by Nipun on 12/15/16.
 */
public class FindPivotInSortedRotatedArray {

/*    public static int doOperation(int[] arr){

        int start = 0 ;
        int end = arr.length -1;
        if(arr[start] < arr[end]){
            return 0;
        }

        while(start <= end){
            int mid = (start + end )/2;
            if(arr[mid]> arr[mid+1]){
                return (mid +1);
            }
            else if(arr[start] > arr[mid]){
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return 0;
    }


    public static void main(String[] args){

        int[] arr = {73,84,94,21,27,28,29,54,66};
        System.out.println(doOperation(arr));

    }*/


    private static int findPivot(int[] arr){

        int start = 0;
        int end = arr.length-1;
        if(arr[start] < arr[end]){
            return 0;
        }

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] > arr[mid +1]){
                return mid +1;
            }
            else if(arr[start] > arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return 0;
    }

    private static int binarySearch(int[] arr , int start , int end , int num){

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == num){
                return mid;
            }
            else if(num > arr[mid]){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }

    private static int doOperation(int[] arr , int num){

        int pivot = findPivot(arr);
        int start = 0;
        int ans;
        // {73,84,94,21,27,28,29,54,66};
        if(pivot == 0){
            ans = binarySearch(arr , 0 , arr.length-1 , num);
        }
        else if (num >= arr[start] && num < arr[pivot -1])
        {
            ans = binarySearch(arr , 0 , pivot -1 , num);
        }
        else {
            ans =  binarySearch(arr , pivot , arr.length -1 , num);
        }
        return ans;
    }


    public static void main(String[] args) {

        int[] arr = {73, 84, 94, 21, 27, 28, 29, 54, 66};
        System.out.println(doOperation(arr, 27));

    }
}
