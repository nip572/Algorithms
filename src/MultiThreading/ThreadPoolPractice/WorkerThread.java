package MultiThreading.ThreadPoolPractice;

/**
 * Created by Nipun on 12/18/16.
 */
public class WorkerThread implements Runnable {

    String message;
    WorkerThread(String s){
        message = s;
    }

    @Override
    public void run() {

        System.out.println("START " + Thread.currentThread().getName() + message);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e.getStackTrace());
        }
        System.out.println("END " + Thread.currentThread().getName() );

    }
}
