package a;

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog("汤汤","贵宾",2,"棕色");
        System.out.println(dog.name+"是一只"+dog.color+dog.breed+"犬,它今年"+dog.age+"岁了");
        dog.eat();
        dog.sleep();
    }
}
