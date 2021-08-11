public class ThreadTest{
    public static void main(String[] args) {
        Eat person1 = new Eat(0,"小明");
        Eat person2 = new Eat(1,"小红");

        person1.start();
        person2.start();
    }
}

class Food {

}
class Tools{

}
class Eat extends Thread{
    // 保证只有一份
    static Food food = new Food();
    static Tools tools = new Tools();

    int choice;
    String person;

    Eat(int choice, String person){
        this.choice = choice;
        this.person = person;
    }

    @Override
    public void run(){
        // 就餐
        try {
            eat();
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
    }

    // 就餐
    private void eat() throws InterruptedException {
        if (choice == 0){
            synchronized (food){
                // 获得就餐的锁
                System.out.println(this.person + "获得食物的锁...");
                sleep(1000);
                synchronized (tools){
                    System.out.println(this.person + "获得餐具的锁...");
                }
            }
        }else {
            synchronized (tools){
                // 获得就餐的锁
                System.out.println(this.person + "获得餐具的锁...");
                sleep(1000);
                synchronized (food){
                    System.out.println(this.person + "获得食物的锁...");
                }
            }
        }
    }
}