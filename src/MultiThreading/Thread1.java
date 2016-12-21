package MultiThreading;

/**
 * Created by Nipun on 12/18/16.
 */
public class Thread1 implements Runnable {

    public void run(){

        for(int i = 0 ; i < 10 ; i++){
            System.out.println(i);
            System.out.println( Thread.currentThread().getName());


            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getStackTrace());

            }
        }
    }

}
class ExecuteThread{

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread t = new Thread(t1);
        Thread t2m = new Thread(t2);
        t2m.setPriority(Thread.MIN_PRIORITY);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        t2m.start();
        System.out.println("Running MAin Thread");
    }

}
