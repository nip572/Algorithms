package ctc_arrays_strings;

/**
 * Created by Nipun on 11/3/16.
 */
public class smallestAndSecondSmallest {

    public static void  doOperation(int[] arr){

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] < first){
                second = first;
                first = arr[i];

            }
            if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }


        }
        System.out.println("smallest " + first);
        System.out.println("second smallest " + second);
    }


    public static void  main(String[] args){

        int[] arr = {1,2,3,4,0,-1};
        doOperation(arr);
    }
}
