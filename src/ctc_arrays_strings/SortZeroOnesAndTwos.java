package ctc_arrays_strings;

/**
 * Created by Nipun on 12/16/16.
 */
public class SortZeroOnesAndTwos {

    public static void doOperation(int[] arr){

        int low = 0 ;
        int mid = 0;
        int high = arr.length -1;

        while(mid <= high){

            switch (arr[mid]){
                case 0 : int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1 : mid++;
                    break;
                case 2 :
                    int temp1 = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp1;
                    high--;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,1};
        doOperation(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
