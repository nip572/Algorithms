package ctc_arrays_strings;

/**
 * Created by Nipun on 11/12/16.
 */
public class nextGreaterElement {

    public static void doOperation(int[] arr){

        int max = arr[arr.length -1];
        System.out.println(arr[arr.length -1] + " -1");
        for(int i = arr.length -2 ; i >= 0 ;i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.println(arr[i] + " -1");
            } else {
                System.out.println(arr[i] + " " + max);
            }
        }

    }

    public static void main(String[] args){
        System.out.println("Increasing");
        int[] arr = {1,2,3,4};
        doOperation(arr);
        System.out.println("Decreasing");
        int[] arr2 = {4,3,2,1};
        doOperation(arr2);
        System.out.println("Random");
        int[] arr3 = {13,7,6,12};
        doOperation(arr3);

    }
}
