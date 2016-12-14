package ctc_arrays_strings;

/**
 * Created by Nipun on 12/10/16.
 */
public class findNthLargestNumber {


    public static int doOperation(int[] nums ,int k){

        if(k < 0  || k > nums.length){
            return -1;
        }


        return  doOperation(nums , 0 , nums.length -1 , k);
    }

    public static int doOperation(int[] nums , int start, int end , int k){


        int pivot = start;
        int left = start;
        int right = end;

        while(left <= right)
        {
            while(left <= right && nums[left] <= nums[pivot])
            {
            left++;
            }
            while(left<= right && nums[right]> nums[pivot]){
            right --;
             }

            if(left < right)
            {
            swap(nums, left, right);
            }
        }
        swap(nums , pivot ,right);

         if(k == right +1)
        {
            return nums[right];
        }
        else
        if( k > right +1){
            return doOperation(nums , right+1 , end ,k);
        }
        else
            return doOperation(nums ,start, right-1,k);

    }

    private static void swap(int[] nums, int left, int right) {

    int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }


    public  static  void main(String[] args){


        int[] a = {10,5,11,4,3,12,5};
        System.out.println(doOperation(  a, 0 , 6, 3));
    }


}
