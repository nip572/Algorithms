package ctc_arrays_strings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nipun on 12/15/16.
 */
public class LongestCommonSubstring {


    public static int doOperation(String s1 , String s2){

        int[][] mat = new int[s2.length()+1][s1.length() +1];
        int max =0;

            for(int i = 1 ; i <= s1.length() ; i++){
            for(int j = 1 ; j <= s2.length() ; j++){
                if(s1.charAt(j-1) == s2.charAt(i-1)){
                    mat[i][j] = mat[i-1][j-1]+1;
                    if(mat[i][j] > max){
                        max = mat[i][j];
                    }
                }
            }
        }
        return max;
    }

    private static List<Character> returnList(int num , int[][] mat , String s1){

        List<Character> list = new LinkedList<>();

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[1].length ; j++){

                if(mat[i][j] == num) {
                while (mat[i][j] > 0){
                list.add(s1.charAt(mat[i-1][j-1]));
                    i--;
                    j--;
                }
                }

                }
            }
        return list;

    }


    public static void main(String[] args){

        System.out.println(doOperation("ABCD" , "DBCA"));

    }


}




/**
 * http://en.wikipedia.org/wiki/Longest_common_substring_problem
/*
 *//*

public class LongestCommonSubstring {

    */
/**
     * Dynamic way of calculating lcs
     *//*

    public int longestCommonSubstring(char str1[], char str2[]){
        int T[][] = new int[str1.length+1][str2.length+1];

        int max = 0;
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j]){
                        max = T[i][j];
                    }
                }
            }
        }
        return max;
    }

    */
/**
     * Recursive way of calculating lcs
     *//*

    public int longestCommonSubstringRec(char str1[], char str2[], int pos1, int pos2, boolean checkEqual){
        if(pos1 == -1 || pos2 == -1){
            return 0;
        }
        if(checkEqual){
            if(str1[pos1] == str2[pos2]){
                return 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
            }else{
                return 0;
            }
        }
        int r1 = 0;
        if(str1[pos1] == str2[pos2]){
            r1 = 1 + longestCommonSubstringRec(str1, str2, pos1-1, pos2-1, true);
        }
        return Math.max(r1,Math.max(longestCommonSubstringRec(str1, str2, pos1-1, pos2, false), longestCommonSubstringRec(str1, str2, pos1, pos2-1,false)));
    }

    public static void main(String args[]){
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        char str1[] = "ABCD".toCharArray();
        char str2[] = "DBCA".toCharArray();
        System.out.println(lcs.longestCommonSubstring(str1, str2));
        //System.out.println(lcs.longestCommonSubstringRec(str1, str2,str1.length-1, str2.length-1,false));
    }


}*/

