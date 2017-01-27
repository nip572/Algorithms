package ctc_arrays_strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Nipun on 1/26/17.
 */


//M = 1000;
//D = 500;
//C = 100
//L = 50
//X = 10;
//v = 5;
//I = 1;
public class DecimalToRoman {

    public static String doOperation(Integer decInput){

        if(decInput == null){
            return null;
        }
        if (decInput < 0){
            return "Invalid String";
        }
        if(decInput == 0 ){
            return "O";
        }

        Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
        StringBuilder sb  = new StringBuilder();

        map.put('M' , decInput/1000);
        decInput = decInput - 1000*(map.get('M'));

        map.put('D' , decInput/500);
        decInput = decInput - 500*(map.get('D'));

        map.put('C' , decInput/100);
        decInput = decInput - 100*(map.get('C'));

        map.put('L' , decInput/50);
        decInput = decInput - 50*(map.get('L'));

        map.put('X' , decInput/10);
        decInput = decInput - 10*(map.get('X'));

        map.put('V' , decInput/5);
        decInput = decInput - 5*(map.get('V'));

        map.put('I' , decInput);

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
           for (int i = 0 ; i < entry.getValue() ; i++){
             sb.append(entry.getKey());
           }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(doOperation(6877));
    }

}
