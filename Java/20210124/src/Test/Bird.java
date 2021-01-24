package Test;

public class Bird extends Animal implements IRunning{
    public Bird(String name) {
        super(name);
    }
    @Override
    public void run(){
        System.out.println(name + "蹦蹦跳");
    }
}
