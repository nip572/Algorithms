package ctc_arrays_strings;

import java.util.HashSet;

/**
 * Created by Nipun on 9/8/16.
 */
public class permutationOfPalindrome {
    //nitin
    //itnni anna
    //tinit

    public static boolean palindromeOfPermutationHashSet(String str) {
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (hs.contains(str.charAt(i))) {
                hs.remove(str.charAt(i));
            } else {
                hs.add(str.charAt(i));
            }
        }
        return hs.size() <= 1;
    }

    public static void main(String[] args) {
        String s = "ab";
        Boolean b = palindromeOfPermutationHashSet(s);
        System.out.println(b);
    }
}
