package ctc_arrays_strings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nipun on 11/12/16.
 */
public class equlibariumExist {

    public static List<Integer> doOperations(int[] arr){

        List<Integer> list = new LinkedList<>();
        int sum = 0;
        int leftSum = 0;

        for(int i = 0 ;i < arr.length ; i++){

            sum += arr[i];
        }

        for(int i = 0 ; i < arr.length ; i++){

            sum -= arr[i]; //rightsum
            if(leftSum == sum){
                list.add(i);
            }
            leftSum += arr[i];
        }
            if(list.isEmpty()){
                return null;
            }
        return list;
    }

    public static void main(String[] args){

        int[] arr = {-7,1,5,2,-4,3,0};
        List<Integer> list = doOperations(arr);
        for(int i : list){
            System.out.println(i);
        }
    }

}
