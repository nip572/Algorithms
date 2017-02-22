package ctc_arrays_strings;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nipun on 2/21/17.
 */
public class MovingWindow {

    int size;
    int sum ;
    Queue<Integer> q = new LinkedList<>();

    public MovingWindow(int size){
        this.size = size;
        sum = 0;
    }
    private int update(int num){

        if(size == 1){
            return num;
        }
        //1,2,3,4,5,6
        if(q.size() == size){
            int x = q.remove();
            sum -=x;
            sum += num;
            q.add(num);
        }
        else {                      
            sum += num;
            q.add(num);
        }
        return sum;
    }


    public static void main(String[] args) {

        MovingWindow mv = new MovingWindow(3);

        System.out.print(mv.update(1) + " ");
        System.out.print(mv.update(2)+ " ");
        System.out.print(mv.update(3)+ " ");
        System.out.print(mv.update(4)+ " ");
        System.out.print(mv.update(5)+ " ");
        System.out.print(mv.update(6));





    }

}
