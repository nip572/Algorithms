package ctc_arrays_strings;

/**
 * Created by Nipun on 9/19/16.
 */
public class OneAway {

    public static boolean doOperation(String first , String second){

        if(first.length() == second.length()){
            doOperationReplace(first , second);
        }
        if(first.length() > second.length()){
          doOperationEdit(first , second);
        }

        if(second.length() > first.length()){
            doOperationEdit(second,first);
        }
        return  false;

    }

    public static boolean doOperationReplace(String first , String second){
        int count = 0;
        if(first.length() != second.length()){
            return false;
        }
        for(int i = 0 ; i < first.length() ; i++){
            if(first.charAt(i) != second.charAt(i)){
                count++;
            }
        }
        return count == 1;
    }

    public static boolean doOperationEdit(String first, String second){

        int diff = first.length() - second.length();
        System.out.println("diff " + diff);

       // if(diff > 1){
         //   return false;
        //}
        for(int i = 0 ; i < second.length() ; i++){
            System.out.println(second.charAt(i) + " " + first.charAt(i));
            if(second.charAt(i) != first.charAt(i)) {

                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args){

        String str = "Pale";
        String str2 = "Pales";
        String str3 = "ale";
        boolean b = doOperationEdit(str2 , str);
        //boolean c = doOperation(str , str3);
        System.out.println("EDIT: " + b);
       // System.out.println("Replace: " + c);


    }

}
