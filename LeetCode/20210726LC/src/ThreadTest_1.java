public class ThreadTest_1 {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1 ");
        t2.setName("线程2 ");

        t1.start();
        t2.start();
    }
}

class Number implements Runnable{
    private int number = 1;  // 设置共享数据


    @Override
    public synchronized void run() {
        while (true){
            notify();
            if (number < 100){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " : " + number);
                number++;

                try {
                    wait();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }else {
                break;
            }
        }
    }
}
