package ctc_arrays_strings;

import java.util.HashMap;

/**
 * Created by Nipun on 2/21/17.
 */
public class FirstRepeatedNumberIndex {


    public static int doOperation(int[] arr){

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int min = Integer.MAX_VALUE;

        if(arr == null || arr.length == 0){
            return -1;
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                  if(hm.get(arr[i]) < min){
                      min = hm.get(arr[i]);
                  }
            }
            else {
                hm.put(arr[i] , i);
            }
        }
        return arr[min];
    }


    public static void main(String[] args){

        int[] arr = {2,3,3,2};
        System.out.println(doOperation(arr));


    }


}
