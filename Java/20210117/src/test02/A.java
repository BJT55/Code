package test02;

public class A {
    public  int num = 1000;
//    private int num = 1000;
    int num1 = 1000;  //包级访问权限  只能在该包中使用

    //public  访问权限最大
    //default  访问权限其次
    //private 只能在类的内部使用  访问权限最小
    //protected

    //内部类：芭蕾的定义写到另一个类中
    //普通内部类
//    static class Test{
//        public int test;
//    }
//
//
//    public void func(){
//        Test t = new Test();
//        t.test = 10;
//    }
//
//    public static void main(String[] args) {
//        //成员内部类以来外部类的this，在外部类的static方法中没有this，改为static就可以访问
//        //静态内部类不依赖外部类的this，可以随意创建
//        Test t = new Test();
//    }
//
//    //匿名内部类：
//    A a = new A(){
//        //定义属性和方法
//    };
//
//    //局部内部类：
//    class Test2{
//
//    };
//
//    //引用的时候，类类型也是引用

    
}
