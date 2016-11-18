package ctc_arrays_strings;

/**
 * Created by Nipun on 11/13/16.
 */
public class LowestCommonSubsequence {

    public static int doOperation(String s1, String s2){

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        int[][] temp = new int[arr1.length +1][arr2.length+1];


        for(int i = 1 ; i < temp.length ; i++){
            for(int j = 1 ; j< temp[i].length ; j++){

                if(arr1[i-1] == arr2[j-1]){
                    temp[i][j] = temp[i-1][j-1] +1;
                }
                else{
                    temp[i][j] = Math.max(temp[i][j-1] , temp[i-1][j]);
                }
            }
        }
        return temp[arr1.length][arr2.length];
    }

    public static void main(String[] args){

        System.out.println(doOperation("ACBDEA", "ABCDA"));
    }

}
