/**
 * 面包店：
 * 1.生产者（面包师傅-线程）：5个师傅，每个每次生产3个
 * 2.消费者（线程）：10个，每个每次消费1个
 * 库存（共享变量）：下限0，上限100
 */
public class BreadShop {

    //库存
    private static int COUNT;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {//面包师傅
                @Override
                public void run() {
                    try {
                        while (true){//不停的生产面包
                            //面包师傅之间，面包师傅和消费者之间，都是对库存共享变量的操作，需要保证线程安全
                            synchronized (BreadShop.class){
                                //当前库存+当次生产数量如果超过库存上限，需要等待
                                while (COUNT + 3 > 100)
                                    BreadShop.class.wait();
                                //满足生产条件，生产面包
                                COUNT+=3;
                                //生产后，需要通知消费者线程
                                BreadShop.class.notifyAll();
                                System.out.println(Thread.currentThread().getName()+"生产了面包，库存："+COUNT);
                            }
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "面包师傅["+i+"]").start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {//消费者
                @Override
                public void run() {
                    try {
                        while (true){//不停的消费面包
                            //面包师傅之间，面包师傅和消费者之间，都是对库存共享变量的操作，需要保证线程安全
                            synchronized (BreadShop.class){
                                //当前库存-当次消费数量如果小于库存下限，需要等待
                                while (COUNT==0)
                                    BreadShop.class.wait();
                                //满足消费条件，消费面包
                                COUNT--;
                                //消费后，需要通知生产者线程
                                BreadShop.class.notifyAll();
                                System.out.println(Thread.currentThread().getName()+"消费了面包，库存："+COUNT);
                            }
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "消费者["+i+"]").start();
        }
    }
}
