package MultiThreading.ThreadPoolPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Nipun on 12/18/16.
 */
public class ThreadPoolClass {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0 ; i <10 ; i++){
            WorkerThread wt = new WorkerThread(" " + i);
            executorService.execute(wt);
        }
        executorService.shutdown();

    }


}
