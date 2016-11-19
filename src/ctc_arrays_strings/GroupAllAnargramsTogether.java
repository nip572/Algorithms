package ctc_arrays_strings;

import java.util.HashMap;

/**
 * Created by Nipun on 11/18/16.
 */
public class GroupAllAnargramsTogether {

    public static String[] doOperation(String[] arr){
        int intVal = 0;
        HashMap<Integer , Integer> hm = new HashMap<Integer, Integer>();
        String[] str = new String[arr.length];
        int start = 0;
        int end = arr.length -1;
        for(int i = 0 ; i < arr.length ; i++){
            char[] chars = arr[i].toCharArray();
            for (int j = 0 ; j < chars.length ; j++){
              intVal += chars[j];
                if(hm.containsKey(intVal)){
                    if(arr[i].length() == arr[hm.get(intVal)].length()){
                        System.out.println(arr[i] + " " + arr[hm.get(intVal)]);
                        str[start]= arr[i];
                        str[start+1] = arr[hm.get(intVal)];
                        start= start+2;
                    }

                }
            }
        }
        return str;
    }
    public static void main(String[] args){
        String[] arr = {"dog" ,"cat" , "god" ,"bat"};
        int j = 0;
        arr=doOperation(arr);
        for(String s : arr){
            System.out.println(s);
        }

    }


}
