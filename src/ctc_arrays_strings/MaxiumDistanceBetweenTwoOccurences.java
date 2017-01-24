package ctc_arrays_strings;

import java.util.HashMap;

/**
 * Created by Nipun on 12/20/16.
 */
public class MaxiumDistanceBetweenTwoOccurences {

    public static int doOperation(int[] arr , int k ){
        int maxDist = Integer.MIN_VALUE;

        if(arr == null || arr.length == 0) {
            return -1;
        }
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(arr[i]) && arr[i] == k){
                if((i - (hm.get(arr[i])) > maxDist)){
                    maxDist = (i - (hm.get(arr[i])));
                }
            }
            else {
                hm.put(arr[i] , i);
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(doOperation(arr , 4));

    }



}
