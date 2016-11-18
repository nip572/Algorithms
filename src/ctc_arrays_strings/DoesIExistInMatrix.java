package ctc_arrays_strings;

import java.util.List;

/**
 * Created by Nipun on 11/14/16.
 */
public class DoesIExistInMatrix {

    public static boolean doOperation(int[][] arr){
        int count= 0;
        int startPtr=0;
        int endPtr=0;

        for(int i = 0 ; i <arr.length ; i++){
            if(count%2 == 1 && count > 1){

                i++;

            }
            for(int j = 0 ; j < arr[i].length ; i++){
                if(arr[i][j] == 0){
                    count++;
                    endPtr = j;

                }

            }

        }
        return  true;
    }


    public static List<Integer> doOperation(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        return null;
    }
}
