package ctc_arrays_strings;

/**
 * Created by Nipun on 10/20/16.
 */
public class MergeSortedArraysInplace
{
    final static int INVALID_NUM = 0;

    public void inplaceMergeArrays(int[] arrayA, int[] arrayB)
    {
        // move all elements of arrayA with valid values towards the end
        int validNumIndex = arrayA.length - 1;
        for (int i = arrayA.length - 1; i >= 0; i--)
        {
            if (arrayA[i] != INVALID_NUM)
            {
                arrayA[validNumIndex] = arrayA[i];
                validNumIndex -= 1;
            }
        }
        for (int i = 0 ; i < arrayA.length ; i++){

            System.out.print(arrayA[i] + " ");

        }
        System.out.println();
        // i: index of first valid valued element in arrayA
        int i = validNumIndex + 1;
        int j = 0, k = 0;

        // fill-up arrayA starting from 0th index since this end of arrayA is free now
        while ((i < arrayA.length) && (j < arrayB.length))
        {
            if (arrayA[i] < arrayB[j])
            {
                arrayA[k++] = arrayA[i++];
            }
            else
            {
                arrayA[k++] = arrayB[j++];
            }
        }

        // copy any remaining elements of smaller array into larger one
        while (j < arrayB.length)
        {
            arrayA[k++] = arrayB[j++];
        }
    }

    //1,3,4,7,0,0,0     2,5,6
    //1,3,4,1,3,4,7     12,15,16
    public  static void doOperation(int[] arr1, int[] arr2){

        int k = 0;
        int j = 0;
        int m = arr1.length-1;

        for(int i = arr1.length -1 ; i >=0 ; i--){

            if(arr1[i] != 0){
                arr1[m] = arr1[i];
                m--;
            }
        }

        int i = m +1;
        while((i < arr1.length) && (k < arr2.length)){
            if(arr1[i] > arr2[k]){
                arr1[j] = arr2[k];
                j++;
                k++;
            }
            else{
                arr1[j] = arr1[i];
                j++;
                i++;
            }
        }
        while(k < arr2.length){
            arr1[j] = arr2[k];
            j++;
            k++;
        }

    }


    public static void main(String[] args)
    {
        MergeSortedArraysInplace solution = new MergeSortedArraysInplace();


        int[] arrayA = {-3, 5, INVALID_NUM, 7, INVALID_NUM, 10, INVALID_NUM, 11, INVALID_NUM};
        int[] arrayB = {-1, 2, 6, 12};
        doOperation(arrayA,arrayB);

        //solution.inplaceMergeArrays(arrayA, arrayB);
        for (int i = 0;  i < arrayA.length; i++)
        {
            System.out.print(arrayA[i] + ", ");
        }
    }
}