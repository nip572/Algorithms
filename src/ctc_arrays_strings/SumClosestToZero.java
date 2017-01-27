package ctc_arrays_strings;

import java.util.Arrays;

/**
 * Created by Nipun on 1/23/17.
 */
public class SumClosestToZero {

    public static int doOperation(int[] arr){

        if(arr == null || arr.length == 0){
            return Integer.MAX_VALUE;
        }

        Arrays.sort(arr);
        int start = 0 ;
        int end = arr.length -1;
        int negative = Integer.MIN_VALUE;
        int positive = Integer.MAX_VALUE;
        int sum ;
        while(start <= end){
             sum = arr[start] + arr[end];
            if(sum  < 0){
                if(sum > negative){
                    negative = sum;
                }
                start++;
            }
            else if(sum > 0){
                if (sum < positive){
                    positive = sum;
                }
                end--;
            }
            else {
                sum = arr[start] + arr[end];
               // positive=sum;
            }

        }
        return (Math.abs(negative)<positive?Math.abs(negative):positive);
    }

    public static void main(String[] args){
        int[]arr = {1,60,-10,70,-80,85};
        System.out.println(doOperation(arr));
    }


}
