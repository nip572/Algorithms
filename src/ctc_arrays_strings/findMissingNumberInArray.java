package ctc_arrays_strings;

/**
 * Created by Nipun on 10/13/16.
 */
public class findMissingNumberInArray {

    //APPROACH
    // find sum of both subtract. Get the result
    //Second Approach
    // result is a1[0] , result = result ^ rest array now XOR result with starting from 0th element in the second array

    public static int findDupplicate(int[] array1, int[] array2){

        int result;
        if(Math.abs(array1.length - array2.length) != 1){
            System.out.println("Difference in length is more than 1");
        }
        if(array1.length == 1 && array2 == null){
            return array1[0];
        }
        if(array2.length == 1 && array1 == null ){
            return array2[0];
        }

        result = array1[0];
        for(int i = 1 ; i < array1.length ; i++){
            result = result ^ array1[i];
        }

        for(int i = 0 ; i < array2.length ; i++){
            result = result ^ array2[i];
        }
        return result;
    }

    public static  void main(String[] args){
        int[] arr2 = {1};
        int[] arr1 = {};

        int result = findDupplicate(arr1, arr2);
        System.out.printf("Result is: " + result);


    }
}
