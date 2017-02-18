package threadlock;

/**
 * Created by Administrator on 2017/2/18.
 * 实现一个简单卖票案例
 *      假如有100张票
 *    要求:
 *      六个窗口一起卖100张票
 *      保证线程安全,没有重复的票被卖出去
 */
public class ThreadLockTest {

    public static void main(String[] args) {
        ThreadLock ticket = new ThreadLock();

        //创建六个窗口线程
        Thread thread1 = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket,"窗口2");
        Thread thread3 = new Thread(ticket,"窗口3");
        Thread thread4 = new Thread(ticket,"窗口4");
        Thread thread5 = new Thread(ticket,"窗口5");
        Thread thread6 = new Thread(ticket,"窗口6");

        //开启三个线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
