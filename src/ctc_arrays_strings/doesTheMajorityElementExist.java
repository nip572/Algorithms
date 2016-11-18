package ctc_arrays_strings;

import java.util.HashMap;

/**
 * Created by Nipun on 10/27/16.
 */
public class doesTheMajorityElementExist {

    public static int doOperation(int[] arr){

        int n = arr.length/2;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < arr.length ; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i] , hm.get(arr[i]) + 1);

                if(hm.get(arr[i]) > n ){
                    return arr[i];
                }
            }
            else // first occurence
            {
                hm.put(arr[i] , 1);
            }
        }
        return 0;
    }

    public static  void main(String[] args){

        int[] arr = {3,3,4,2,4,4,2,4,4};
        int a = doOperation2(arr);
        System.out.println(a);
    }

    public static  int doOperation2(int[] arr){

        int count= 1;
        int finalCount = 0;
        int mindex = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == arr[mindex]){
                count++;
            }
            else {
                count--;
            }

            if(count == 0 ){
                mindex = i;
                count = 1;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == arr[mindex]){
                finalCount++;
            }
            if(finalCount > arr.length/2){
                return arr[mindex];
            }
        }
            return 0;
    }

}
