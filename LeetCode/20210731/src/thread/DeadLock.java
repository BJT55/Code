package thread;

public class DeadLock {
    public static void main(String[] args) {
        Eat p1 = new Eat(0,"甲");
        Eat p2 = new Eat(1,"已");
        p1.start();
        p2.start();
    }
}


// 食物
class Food{

}
// 餐具
class Tools{

}

class Eat extends Thread{
    static Food food = new Food();
    static Tools tools = new Tools();

    int choice;
    String people;

    Eat(int choice,String people){
        this.choice = choice;
        this.people = people;
    }

    @Override
    public void run(){
        try {
            eat();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    private void eat() throws InterruptedException {
        if (choice == 0){
            synchronized(food){
                System.out.println(this.people + "获得食物...");
                Thread.sleep(1000);
                synchronized (tools){
                    System.out.println(this.people+"获得餐具...");
                }
            }
        }else {
            synchronized (tools){
                System.out.println(this.people+"获得餐具...");
                Thread.sleep(1000);
                synchronized(food){
                    System.out.println(this.people+"获得食物...");
                }
            }
        }
    }
}
