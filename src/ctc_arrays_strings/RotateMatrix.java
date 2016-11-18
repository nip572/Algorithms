package ctc_arrays_strings;

/**
 * Created by Nipun on 10/26/16.
 */
public class RotateMatrix {

    public static void swap(int a , int b){
        int temp;
        temp = a ;
        a=b;
        b=temp;
        System.out.println(a + " "+ b);
    }

    public static void print(int[][] mat){

        for(int i = 0 ; i < mat.length;i++){
            for (int j = 0 ; j < mat[1].length;j++){
                System.out.print(mat[i][j]+"   ");
            }
            System.out.println();
        }
    }


    public static int[][] doOperation(int[][] mat){

        int row = mat.length-1;
        int col = mat[1].length -1;
        System.out.println("COl is "+ col);
        int level = 0;
        if( row != col){
            System.out.println("Invalid Matrix");
            return null;
        }

        while(level < 2) {
            for (int i = level; i < col; ++i) {
                swap(mat[level][i], mat[i][col]);

                swap(mat[level][i], mat[col][col - i +level]);

                swap(mat[level][i], mat[col - i + level][level]);

            }
            ++level;
            --col;
        }

        return mat;
    }



    public static void main(String[] args){

        int[][] mat = {{0,1,2,3,},
                       {4,5,6,7},
                       {8,9,10,11},
                       {12,13,14,15}};
        int[][] mat2 = doOperation(mat);
        print(mat2);

    }
}
