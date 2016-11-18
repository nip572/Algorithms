package ctc_arrays_strings;

import java.util.Arrays;

/**
 * Created by Nipun on 11/7/16.
 */
public class fibonacci {
    static  int[] arr = new int[41];
    public static int recursion(int num){

        if(arr[num] != -1){
            return arr[num];
        }

            arr[num] = recursion(num-1)+ recursion(num -2);
            return arr[num];

    }

    public static void main(String[] args){
        Arrays.fill(arr , -1);
        arr[1] = 1; arr[0] = 0;
        System.out.println(recursion(40));
    }

}
