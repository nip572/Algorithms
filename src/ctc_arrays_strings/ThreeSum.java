package ctc_arrays_strings;

import java.util.Arrays;

/**
 * Created by Nipun on 2/22/17.
 */
public class ThreeSum {


    public static boolean doOperation(int[] arr , int sum){

        int start;
        int end;

        if(arr == null || arr.length == 0){
            return false;
        }

        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length - 2 ; i++){
            start = i +1;
            end = arr.length-1;

            while (start < end){

                if(arr[i] + arr[start] + arr[end] ==  sum ){
                    return true;
                }
                else if(arr[i] + arr[start] + arr[end] <  sum){
                    start++;
                }
                else {
                    end--;
                }

            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,0};
        System.out.println(doOperation(arr , 15));
    }


}
