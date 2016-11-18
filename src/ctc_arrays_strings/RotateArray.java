package ctc_arrays_strings;

/**
 * Created by Nipun on 10/22/16.
 */
public class RotateArray {

    static  int[] arr = {1,2,3,4,5};
    public static void main(String[] args){

        doOperation(arr , 2);
        System.out.println();
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }


    public static void reverse(int[] arr , int start , int end){

        int temp;
        if(start < 0 ){
            System.out.println("Invalid starting point");
        }
        if(end >= arr.length){
            System.out.println("Invalid ending point");
        }

        while(start < end){
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }


    }

    public static void doOperation(int[] arr , int k){

        reverse(arr , 0 , k-1);
        reverse(arr, k , arr.length-1);
        reverse(arr, 0 , arr.length-1);

    }





}
