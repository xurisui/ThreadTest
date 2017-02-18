package threadTest2;

/**
 * Created by Administrator on 2017/2/18.
 */
public class MyThread2 implements Runnable {
    //重写run方法
    public void run() {
        System.out.println("23----" + Thread.currentThread().getName());
    }
}
