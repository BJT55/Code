package test01;

public class Cat {
    public String name;
    public String gender;   //实例成员
//   alt+insert  自动生成构造方法
    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;

//        this.eat("鱼");
    }
//  this 指向当前对象的引用
//  this 的类型就是当前这个类的类型
//  this 这个引用的指向不能修改
//  this 不能是null

//    public void  eat(String food){
//        System.out.println(name+"正在吃"+ food );
//    }
//
//    //alt + insert --->  toString
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
//    }
//
//    //静态方法中不能使用this
//    //this 指向的是当前的实例
//    //static 方法和实例无关，只和类有关
//
//    public static void func(){
//        System.out.println("这是一个static方法");
//    }


//    static {
//     // static 修饰代码块，代码块知识在类加载的时候执行一次
//     //往往用来初始化静态成员
//        System.out.println("这是静态代码块");
//    }
//    {
//        System.out.println("这是普通代码块");
//    }


    //访问限定符
    //面向对象程序设计，这是一种写代码的思想方法
    //面向对象中的一些核心招式：类和对象，抽象，封装，继承，组合，多态，反射/自省

    //三大特性：封装、继承、多态
}
