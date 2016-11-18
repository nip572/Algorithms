package ctc_arrays_strings;

import java.util.Scanner;

/**
 * Created by Nipun on 9/7/16.
 */

// check length if greater than 128 return false
// create a boolean array of 128 and iterate over the string
// assign each char of string to value

// TIME COMPLEXITY O(n) SPACE COMPLEXITY O(1)

public class isUnique {

    public static boolean isUnique(String str){

        if(str.length() > 128){
            return false;
        }

        boolean[] charSet = new boolean[128];
        for(int i = 0 ; i < str.length() ; i++){
            int val = str.charAt(i);
            if(charSet[val]){
                return false;
            }
            charSet[val] = true ;
        }
        return  true;


    }

    public  static void main(String[] args){
        System.out.println("Enter a String ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        boolean a = isUnique(s);
        System.out.println(a);

    }


}
