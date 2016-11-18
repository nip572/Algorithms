package ctc_arrays_strings;

/**
 * Created by Nipun on 10/18/16.
 */
public class ShortestPalindrome {

    public static String doOperation(String str) {
        String s;
        StringBuilder str1 = new StringBuilder(str);
        s = str1 + str1.reverse().toString() ;
        int j = 0;
        int i = 1;
        int val = Integer.MIN_VALUE;
        int[] lps = new int[s.length()];

        while(i < s.length()){

            if(s.charAt(j) == s.charAt(i)){
                lps[i] = j+1;
                i++;
                j++;
            } else{
                if(j == 0){
                    lps[i] = j;
                    i++;
                }
                else{
                    j = lps[j-1];
                }
            }
        }
         for(int k = 0 ; k < lps.length ; k++){
             if(lps[k] > val){
                 val = lps[k];
             }
         }

        System.out.printf(String.valueOf(val));
        System.out.printf(" ");
        str = str.substring(0 , str.length() - val);
        System.out.println("yaha " + str);
        char c = str.charAt(str.length() - val);
        str = str.substring(0 , str.length() -1);
        str = c + str;
        return  str;
    }

    public static  void main(String[] args){
        String str = "abab";
        String str2 = "abcd";
        String str3 = "ananab";
       // str = str.substring(0 , str.length() -1);
        System.out.printf("str " + str);

        System.out.println(doOperation(str));;
        //System.out.println("Second ");
        //System.out.println(doOperation(str2));;
        //System.out.println("third");
        //System.out.printf(doOperation(str3));
    }
}
