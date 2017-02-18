package threadtest;

/**
 * Created by Administrator on 2017/2/18.
 *
 * ThreadTest
 *
 * mothed one:
 *      extend Thread.class , override run mothed
 */
public class ThreadTest {
    public static void main(String[] args) {

        //打印当前线程
        System.out.println("1---" + Thread.currentThread().getName());

        //创建MyThread类的新线程
        MyThread thread = new MyThread();
        //开启新线程
        thread.start();
        //打印线程
        System.out.println("2----" + Thread.currentThread().getName());
        System.out.println("3---" + thread.getName());
    }
}

//MyThread类继承Thread
class MyThread extends Thread {
    @Override
    public void run() {  //重写run方法
        System.out.println("4----" + Thread.currentThread().getName());
    }

}
