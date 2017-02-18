package threadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/2/18.
 */
public class ThreadLock implements Runnable {

    //定义一个票的数量
    int ticket = 100;
    //定义一个锁对象
    Object lock = new Object();

    //方法一:把run方法同步
    /*
    public synchronized void run() {

        while (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("当前线程是:" + Thread.currentThread().getName() + "正在卖第" + ticket + "票.");

            ticket--;
        }

    }
    */

    /*
    //方法二:把执行代码上锁
    public void run() {
        while (true) {

                synchronized (lock) {
                    if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("当前线程是:" + Thread.currentThread().getName() + "正在卖第" + ticket + "票.");
                    ticket --;
                }
            }
        }
    }
    */
    //方法:三:Lock接口
    Lock lk = new ReentrantLock();
    public void run() {
        while (true) {

            lk.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前线程是:" + Thread.currentThread().getName() + "正在卖第" + ticket + "票.");
                ticket--;
            }
            lk.unlock();
        }
    }


}
