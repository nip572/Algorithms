package ctc_arrays_strings;

/**
 * Created by Nipun on 12/20/16.
 */
public class subArrayWithLeastSum {


    public static int doOperation(int[] arr , int k){

        if(arr == null || arr.length == 0){
            return 0;
        }
        int sum= 0;
        int index = 0;
        for(int i = 0 ; i <= k ; i++){
           sum =  arr[i] + sum;
        }
        int min_sum = sum;
        for (int i = k ; i < arr.length ;i++){
            min_sum += arr[i] - arr[i-k];
            if( min_sum < sum){
                sum=min_sum;
                index= i - k +1;
            }
        }
    return index;
    }


    public static void main(String[] args) {

        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        System.out.println(doOperation(arr , 3));
    }


}
