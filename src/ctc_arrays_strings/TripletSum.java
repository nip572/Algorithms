package ctc_arrays_strings;

import java.util.Arrays;

/**
 * Created by Nipun on 11/29/16.
 */
public class TripletSum {

     public static boolean doOperation(int sum , int[] arr){

         Arrays.sort(arr);

         for(int i = 0 ; i < arr.length -2 ; i++){

             int start = i+1;
             int end = arr.length -1;

             while(start < end){

                 if(arr[i] + arr[start] +arr[end] == sum){
                     return  true;
                 }else
                     if(arr[i] + arr[start] +arr[end] < sum){
                         start ++;
                     }
                 else {
                         end--;
                     }

             }
         }
         return  false;
     }


    public  static void main(String[] args){

        int[] arr = {1,8, 2,10,3,4,5};
        System.out.println(doOperation(24,arr));

    }

}
