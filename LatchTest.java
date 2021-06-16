package lesson8;

import java.util.concurrent.CountDownLatch;

public class LatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            final int j = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(j);
                    }finally {
                        //线程结束
                        latch.countDown();
                    }
                }
            }).start();
        }
        //等待
        latch.await();
        System.out.println("main");
    }
}
