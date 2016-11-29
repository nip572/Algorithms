package ctc_arrays_strings;

/**
 * Created by Nipun on 10/28/16.
 */
public class Quicksort {

public static int partition(int[] a, int start , int end) {

int pivot = a[end];
    int pindex = start;
    for(int i = start ; i < end ; i++){
     if(a[i]<= pivot ){
         int temp = a[i];
         a[i] = a[pindex];
         a[pindex] = temp;
        pindex++;
    }
    }
    int temp = a[end];
    a[end] = a[pindex];
    a[pindex] = temp;
    return  pindex;

}
    public static void quicksort(int[] a , int start , int end){
        if(start < end){
            int pindex = partition(a , start , end);
            quicksort(a, start , pindex-1);
            quicksort(a , pindex+1 , end);
        }
    }



    public static  void main(String[] args){

        int[] arr = {7,2,1,6,8,5,3,4};
        quicksort(arr , 0 , 7);

        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
