public class ThreadTest {
    public static void main(String[] args) {
        Food f = new Food();
        new Thread(f).start();
    }
}

class Food implements Runnable{

    @Override
    public void run() {
        System.out.println("我要食物...");
    }
}