package ctc_arrays_strings;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {

        int top = 0;
        int right = matrix[0].length -1 ;
        int bottom = matrix.length -1 ;
        int left = 0;
        int dir = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(top <= bottom && left <= right){
            if(dir == 0){
                for(int i = left ; i <=right ; i++){
                    list.add(matrix[top][i]);
                }
                top++;
                dir = 1;
            } else
            if( dir == 1){
                for(int i = top ; i <= bottom ; i++){
                    list.add(matrix [i][right]);
                }
                right --;
                dir = 2;
            }
            else
            if(dir == 2){
                for(int i = right ; i >= left ; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
                dir = 3;
            }
            else
            if(dir == 3){
                for(int i = bottom ; i >= top ; i--){
                    list.add(matrix[i][left]);
                }
                left++;
                dir = 0;
            }
        }
        return list;

    }
    public static void main(String[] args ) {

        int[][] matrix =
                {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                        {13,14,15,16}};
        ArrayList<Integer> list = new ArrayList<>();
        list = spiralOrder(matrix);
        for(int i : list){
            System.out.print(i + " ");
        }
    }

}
