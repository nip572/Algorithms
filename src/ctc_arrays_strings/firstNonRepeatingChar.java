package ctc_arrays_strings;

import java.util.Arrays;

/**
 * Created by Nipun on 10/19/16.
 */
public class firstNonRepeatingChar {

    public static Character doOperation(String str){

        int[] arr = new int[128];
        Arrays.fill(arr , -1);


        for(int i = 0 ; i < str.length() ; i++){
            if(arr[str.charAt(i)] == -1 ){
            arr[str.charAt(i)] = i;
            }
            else{
                arr[str.charAt(i)] = -2;
            }

        }

        int min = str.length();
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] >= 0 && min > arr[i] ){
                min = arr[i];
                System.out.println("min " + min);
            }
        }
        return (min >= 0 && min < str.length())? str.charAt(min): null;



    }

    public static Character getFirstNonRepeatingCharacterLinearOptimized(String string) {
        if(string == null || string.length() == 0) {
            return null;
        }

        int n = string.length();
        if(n == 1) {
            return string.charAt(0);
        }

        int[] arr = new int[256];   // Index of non repeating characters. If repeating, then index = -2
        // Initialize character index of all characters to -1
        for(int i = 0; i < 256; i++) {
            arr[i] = -1;
        }

        for(int i = 0; i < n; i++) {
            if(arr[string.charAt(i)] == -1) {
                // character seen first time
                arr[string.charAt(i)] = i;
            } else {
                // Repeated character
                arr[string.charAt(i)] = -2;
            }
        }

        int minIdx = string.length(); // Index of first non repeating character
        System.out.println(minIdx);
        for(int i = 0; i < 256; i++) {
            if(arr[i] >= 0 &&
                    minIdx > arr[i]) {
                minIdx = arr[i];
                //System.out.println(minIdx);
            }
        }
        System.out.println("minIdx" + minIdx);
        return (minIdx >= 0 && minIdx < string.length()) ? string.charAt(minIdx) : null;
    }

    public static void main(String[] args) {
        String string = "nipunahuja";
        System.out.println("Output: " + doOperation(string));
    }
}

