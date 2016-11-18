package ctc_arrays_strings;

/**
 * Created by Nipun on 11/4/16.
 */
public class BuySellStocks {

    public static  int doOperation(int[] arr){

        if(arr == null){
            return -1;
        }

        int minElement = arr[0];
        int maxDifference = arr[1] - arr[0];

        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i] - minElement > maxDifference){
                maxDifference = arr[i ] - minElement;
            }
            if(arr[i ] < minElement){
                minElement = arr[i];
            }
        }
        return  maxDifference;
    }

    public static void main(String[] args){

        int[] arr = {100, 80, 70,60,50};
        System.out.println(doOperation(arr));
    }

}
