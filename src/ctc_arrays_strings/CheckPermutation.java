package ctc_arrays_strings;
import java.util.Arrays;

/**
 * Created by Nipun on 9/7/16.
 */
public class CheckPermutation {

    public static boolean checkPermutationSort(String str1, String str2){

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        if(str1.length() != str2.length()){
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0 ; i < str1.length(); i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPermutationByCharCount(String str1 , String str2){

        int val;
        if(str1.length() != str2.length()){
            return false;
        }

        int[] c1 = new int[128];
        for(int i = 0 ; i < str1.length() ; i++){
             val = str1.charAt(i);
            c1[val]++;
        }

        for(int i = 0 ; i < str2.length() ; i++){
            int val2 = str2.charAt(i);
            c1[val2]--;
            if(c1[val2] < 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){

        String s1 = "nupin";
        String s2 = "nipun";
        boolean b = checkPermutationSort(s1, s2);
        boolean b1 = checkPermutationByCharCount(s1 ,s2);
        System.out.println("Sorting " +b);
        System.out.println("check counts " + b1);

    }

}
