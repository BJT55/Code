package a;

public class Dog {
    public String name;
    public String breed;
    public  int age;
    public String color;

    public Dog(String name,String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    void eat()
    {
        System.out.println("它喜欢吃骨头...");
    }
    void sleep()
    {
        System.out.println("它正在睡觉....");
    }
}
