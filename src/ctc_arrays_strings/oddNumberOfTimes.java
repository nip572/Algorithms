package ctc_arrays_strings;

/**
 * Created by Nipun on 10/27/16.
 */
public class oddNumberOfTimes {

    public static int doOperation(int[] arr){

        int num = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            num = num ^ arr[i];
        }
        if(num == 0){
            return 0;
        }
        return num;
    }

    public static void main(String[] args){

        int[] arr = {1,1,2,2,2,2};
        int num = doOperation(arr);
        System.out.println(num);
    }
}
