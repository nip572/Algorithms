package ctc_arrays_strings;

/**
 * Created by Nipun on 12/15/16.
 */
public class Heap {

    private static void maxHeapify(int[] arr , int i){

        int l = 2*i +1;
        int r = l+1;
        int largest;
        if(l < arr.length && arr[l] > arr[i])
        largest = l;
        else{
            largest = i;
        }
        if(r< arr.length && arr[r] > arr[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            maxHeapify(arr , largest);
        }
    }

    public static int[] buildMaxHeap(int[] arr){

        for (int i = (arr.length/2) -1 ; i>= 0 ; i--){
            maxHeapify(arr , i);
        }
        return arr;
    }


    public static void main(String[] args){

        int[] arr = {1,2,4,5,6,7,8,9};
        arr = buildMaxHeap(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
