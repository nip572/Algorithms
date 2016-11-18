package ctc_arrays_strings;

/**
 * Created by Nipun on 10/27/16.
 */
public class MergeSort {

    public static void merge(int[]left , int[]right , int[] arr){

        int nl = left.length;
        int nr = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nl && j < nr ){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while(i < nl){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nr){

            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[]arr){

        int n = arr.length;
        if(n < 2){
            return;
        }
        int mid = n/2;
        int[]left = new int[mid];
        int[] right = new int[n - mid];
        for(int i = 0 ; i < mid ; i++){
            left[i] = arr[i];
        }
        for(int i = mid ; i < n ; i++){
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left , right ,arr);
    }

    public static  void  main(String[] args){

        int[] arr = {8,7,6,5,4,3,2,1};
        mergeSort(arr);
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
