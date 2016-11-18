package ctc_arrays_strings;

/**
 * Created by Nipun on 10/28/16.
 */
public class Quicksort {

public static int partition(int[] arr, int start , int end){


    int pivot = arr[end];
    int pindex = end;
    for(int i = start ; start < end ; i++){

        if(arr[i] <= pivot){
            swap(arr[i] , arr[pindex]);
            pindex++;
        }
        swap(arr[pindex] , arr[end]);
    }

        return pindex;
}
    public static void quicksort(int[] arr , int start , int end){

        int pindex;
        if(start < end){
            pindex = partition(arr,start,end);
            quicksort(arr, start,pindex-1);
            quicksort(arr,pindex +1 , end);
        }
    }

    public static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
    }

    public static  void main(String[] args){

        int[] arr = {7,6,5,4,3,2,1,0};
        quicksort(arr , 0 , 7);
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
