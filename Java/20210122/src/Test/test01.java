package Test;

public class test01 {
    public static void main(String[] args) {
        // 1.A 是 B 的父类 构造 B 的时候 就需要先构造 A 的实例
        // 2.构造 A 的实例 就会调用 A 的构造方法
        // 3.构造 A 的构造方法的时候 此时就会调用this.func(),此时的 this 是指向子类的实例
        // 4.如果在 B.func() 打印 B 的 num 值 就会发现 num 的值为 0  在执行父类的构造方法的时候就
        //   而此时 B 的初始化代码（包括就地初始化和代码块以及构造方法都没有执行到）
        A b = new B();
    }
}

class A {
    public A(){
        this.func();
    }

    public void func(){
        System.out.println("A.func()");
    }
}

class B extends A{
    private int num = 1;
    @Override
    public void func(){
        System.out.println("B.func() " + num);
    }
}
