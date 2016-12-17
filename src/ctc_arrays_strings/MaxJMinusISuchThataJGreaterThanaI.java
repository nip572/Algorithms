package ctc_arrays_strings;

/**
 * Created by Nipun on 12/16/16.
 */
public class MaxJMinusISuchThataJGreaterThanaI {

    public static int doOperation(int[] arr) {
        int maxDiff = -1;
        int k = 0;
        int l = 0;
    int[] leftMins = new int[arr.length];
        int[] rightMax = new int[arr.length];

        leftMins[0] = arr[0];
        for(int i = 1 ; i < leftMins.length ; i++){
            leftMins[i] = Math.min(leftMins[i-1] , arr[i]);
        }
        rightMax[rightMax.length -1] = arr[arr.length-1];
        for(int i = rightMax.length -2 ; i >=0 ; i--){
            rightMax[i] = Math.max(arr[i] , rightMax[i+1]);
        }
        while(k  < arr.length && l < arr.length){

            if(leftMins[l] < rightMax[k]){
                maxDiff = Math.max(maxDiff , k -l);
                k++;
            }
            else {
                l++;
            }
        }
        return  maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {34,8,10,3,2,80,30,33,1};
        System.out.println(doOperation(arr));
    }
}
