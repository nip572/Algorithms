package ctc_arrays_strings;

/**
 * Created by Nipun on 11/3/16.
 */
public class seperateZeroAndOnes {

    public static void doOperation(int[] arr){

        int left = 0 ;
        int right = arr.length - 1;

        while(left < right){

            while (arr[left] == 0 ){
                left ++;
            }
            while (arr[right] == 1){
                right--;
            }

            if(left< right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {0,1,0,1,1,1,0,1};
        doOperation(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
    }

}
