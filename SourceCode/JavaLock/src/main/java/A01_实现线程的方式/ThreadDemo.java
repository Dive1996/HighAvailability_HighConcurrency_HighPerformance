package A01_实现线程的方式;

import org.junit.Test;

/**
 * @author liujun
 * @version 1.0
 * @date 2020/9/12
 * @author—Email liujunfirst@outlook.com
 * @blogURL https://blog.csdn.net/ljfirst
 * @description
 */
public class ThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("i am ThreadDemo");
    }

    @Test
    public void test() {
        ThreadDemo t = new ThreadDemo();
        t.start();
    }

}
