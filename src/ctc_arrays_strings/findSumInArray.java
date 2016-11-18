package ctc_arrays_strings;

import java.util.Arrays;

/**
 * Created by Nipun on 10/27/16.
 */
public class findSumInArray {

    public static boolean findSum(int[] arr , int sum){

        int l = 0;
        int r = arr.length -1;
        Arrays.sort(arr);
         while(l < r){
             if(arr[l] + arr[r] == sum){
                 return true;
             }else if( arr[l] + arr[r] > sum){
                 r--;
             }
             else{
                 l++;
             }
         }
        return  false;
    }

    public static void main(String[] args){

        int[] arr= {1,2,3,4,5,6};
        boolean b =findSum(arr , 19);
        System.out.println(b);
    }
}
