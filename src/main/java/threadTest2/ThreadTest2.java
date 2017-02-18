package threadTest2;

/**
 * Created by Administrator on 2017/2/18.
 *
 * mothed two:
 *      implements Runnable interface, override run()
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        //打印当前线程
        System.out.println("21---" + Thread.currentThread().getName());

        //创建MyThread2类新线程
        MyThread2 thread2 = new MyThread2();
        Thread th = new Thread(thread2);
        th.start();
        System.out.println("22---" + th.getName());
    }
}
