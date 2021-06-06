public class MyBlockingQueue<E> {

    private Object[] elements;
    private int putIndex;//存放元素的索引
    private int takeIndex;//取元素的索引
    private int size;//存放元素的数量

    public MyBlockingQueue(int capacity){
        elements = new Object[capacity];
    }

    //线程安全的存放元素：如果超过最大容量，需要等待，否则就存放
    public synchronized void put(E e) throws InterruptedException {
        while(size==elements.length)
            wait();
        elements[putIndex] = e;
        putIndex = (putIndex+1) % elements.length;
        size++;
        notifyAll();
    }

    //线程安全的取元素：如果队列中没有元素，需要等待，否则就可以取
    public synchronized E take() throws InterruptedException {
        while (size==0)
            wait();
        E e = (E) elements[takeIndex];
        takeIndex = (takeIndex+1) % elements.length;
        size--;
        notifyAll();
        return e;
    }

    public static void main(String[] args) {
        MyBlockingQueue<Integer> queue = new MyBlockingQueue<>(10);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        queue.put(3);
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                        Integer n = queue.take();
                        System.out.println("消费");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
