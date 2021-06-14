package lesson8;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) throws InterruptedException {
        //一组线程执行完，再执行某处后边的代码
        Semaphore semaphore = new Semaphore(0);
        for (int i = 0; i < 10; i++) {
            final int j = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(j);
                    }finally {
                        //线程结束
                        semaphore.release();
                    }
                }
            }).start();
        }
        //等待
        semaphore.acquire(10);
        System.out.println("main");
    }
}
