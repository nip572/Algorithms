package ctc_arrays_strings;

/**
 * Created by Nipun on 10/18/16.
 */
public class LongestPrefixSuffix {


    public static int[] doOperation(String str ){
        int j = 0;
        int[] lps = new int[ str.length()];
        lps[j] = 0;
        int i = 1;

        while(i < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                lps[i] = j+1;
                i++;
                j++;
            } else
            {
                if(j == 0){
                    lps[i] = j;
                    i++;
                }else
                {
                    j = lps[j-1];
                }
            }
        }

        return lps;
    }

    public static void main(String[] args){
       int[] lps = doOperation("ananabbanana");
        for(int i = 0 ; i < lps.length ; i++){
            System.out.print(lps[i] + " ");
        }
    }
}
