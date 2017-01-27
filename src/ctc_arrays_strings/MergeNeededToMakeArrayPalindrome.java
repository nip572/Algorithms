    package ctc_arrays_strings;

    /**
     * Created by Nipun on 11/19/16.
     */
    public class MergeNeededToMakeArrayPalindrome {

        public static int doOperation(int[] arr){

            int start;
            int end;
            int ans = 0;
            for(start = 0 , end= arr.length -1 ; start<= end ;){
                if(arr[start] == arr[end]){
                    start++;
                    end--;
                }
                else if(arr[start] > arr[end]){
                    end--;
                    arr[end] += arr[end+1];
                    ans++;
                }
                else{
                    start++;
                    arr[start] += arr[start -1];
                    ans++;
                }
            }
            return ans;
        }

        public static void main(String[] args){

            int[] arr = {11, 14, 11,90};
            System.out.println(doOperation(arr));
        }

    }
