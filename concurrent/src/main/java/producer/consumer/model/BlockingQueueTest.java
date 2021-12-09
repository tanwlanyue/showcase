package producer.consumer.model;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zhanglei211 on 2021/12/9.
 */
public class BlockingQueueTest {

    private int maxInventory = 10;

    private BlockingQueue<String> queue = new LinkedBlockingQueue<>(maxInventory);

    /**
     * 新增商品库存
     * 
     * @param e
     */
    public void produce(String e) {
        try {
            queue.put(e);
            System.out.println("放入一个商品库存，总库存为：" + queue.size());
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    /**
     * 消费商品
     * 
     * @return
     */
    public String consume() {
        String result = null;
        try {
            result = queue.take();
            System.out.println("消费一个商品，总库存为：" + queue.size());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 生产者
     * 
     * @author admin
     *
     */
    private class Producer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                produce("商品" + i);
            }
        }

    }

    /**
     * 消费者
     * 
     * @author admin
     *
     */
    private class Customer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                consume();
            }
        }
    }

    public static void main(String[] args) {

        BlockingQueueTest lc = new BlockingQueueTest();
        new Thread(lc.new Producer()).start();
        new Thread(lc.new Customer()).start();
        new Thread(lc.new Producer()).start();
        new Thread(lc.new Customer()).start();

    }
}