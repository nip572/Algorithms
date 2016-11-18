package ctc_arrays_strings;

import java.util.HashMap;

/**
 * Created by Nipun on 10/19/16.
 */
public class findDuplicateAndCheckDifference {

    public  static boolean doOperation(int[] arr , int k){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int val = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
        if(map.containsKey(arr[i])) {
            int  j = map.get(arr[i]);
            val = Math.abs(i - j);

        }
        else{
            map.put(arr[i] , i);

        }
        }
        if(val <= k){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        int arr[]= {1,2,3,4,7,5};
        boolean b = doOperation(arr , 4);
        System.out.println(b);
    }
}
