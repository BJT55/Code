public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Product p1 = new Product(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        Thread t1 = new Thread(c1);
        t1.setName("消费者1");

        p1.start();
        t1.start();
    }
}

class Clerk {
    private int productCount = 0;

    // 生产产品
    public synchronized void produceProduct(){

        if (productCount < 20){
            productCount++;

            System.out.println(Thread.currentThread().getName() + ": 开始生产第 " + productCount + " 个产品");
            notify();
        }else {
            // 当有产品20个
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    // 消费产品
    public synchronized void consumeProduct(){

        if (productCount > 0){
            System.out.println(Thread.currentThread().getName() + ": 开始消费第 " + productCount + " 个产品");
            productCount--;
            notify();
        }else {
            // 当前没有产品
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}


// 生产者线程
class Product extends Thread{
    private Clerk clerk;

    public Product (Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run(){
        try {
            sleep(100);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ":开始生产产品......");
        while (true){
            clerk.produceProduct();
        }
    }
}

// 消费者线程
class Consumer implements Runnable{
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":开始消费产品....");

        while (true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}