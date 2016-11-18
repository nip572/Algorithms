package ctc_arrays_strings;

/**
 * Created by Nipun on 10/30/16.
 */
public class MissingNumber {


    //sum all numbers using (n*(n+1)/2)
    public static int doOperations(int[] arr, int n){  // if n is exact size then n+1 * n+2 /2

        int total = 0;
        int check = n*(n+1)/2;
        for(int i = 0;i<arr.length;i++){
            total = total + arr[i];
        }
        return total - check;
    }

    // XOR ELEMEMTS IN ARRAY
    // XOR NUMBERS BETWEEN 1 - n
    // XOR BOTH THE RESULTS = answer
}
