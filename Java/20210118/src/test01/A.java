package test01;

import java.lang.reflect.Field;
import java.util.jar.JarOutputStream;

public class A {
//    static  public  int num1 = 50;   //方法区
//    public int num2 = 100;   //实例属性
//
//    public void func(){   //方法区
//        //....
//    }


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        String str1 = "hello";
//        //方法一
//        String str2 = new String("hello");
//        //方法二
//        char[] array = {'h','e','l','l','o'};
//        String str3 = new String(array);
//        //方法三
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);

//        String a = "hello";
////        String b = "hello";
//        String b = new String("hello");
//        System.out.println(a == b);// 此时比较的是直接比较 a 和 b 引用里面存的地址是否相等
//        //  结果返回为 true
//        //  当b 为new String创建的，则结果返回 false
//        System.out.println(a.equals(b));
//        //此时返回的结果为 true
//
//        if ("hello".equals(a)){
//
//        }
//        //建议写出这种方式，如果a是null，则不会抛出异常，返回false


//        String a = new String("hello");
//        System.out.println(a == "hello");  //false
//        String a = new String("hello").intern();
//        System.out.println(a == "hello");   // true
//        //调用intern方法




//        String str = "hello";
//        // 通过反射的方式修改 “hello” 的内容
//        // 特殊手段，而不是常规手段
//
//        // 1.获取到 String 的类对象
//        // 2.根据"value"这个字段名字，在类对象中拿到对应的字段（仍然是图纸的一个部分）
//        // 3.根据图纸，把 str 这个对象给拆开，取出里面的零件
//
//        Field valueField = String.class.getDeclaredField("value");
//        valueField.setAccessible(true);
//        char[] value = (char[])valueField.get(str);
//        // 4. 修改零件的内容
//        value[4] = 'a';
//        System.out.println(str);

//        //字符和字符串之间的转换
//        char[] value = {'a','b','c'};
//        String s = new String(value);

//        String s = "abcd";
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));
//        //使用.length()获取字符串的长度，而数组的长度 .length 这是一个属性
//        System.out.println(s.length());

        // toCharArray 方法相当于是在内部创建了一个新的字符串数组并返回
        // 修改这个返回值不会影响 s 本身的内容
//        char[] value = s.toCharArray();
//        for (char v : value){
//            System.out.println(v);
//        }
//        value[0] = 'x';
//        System.out.println(s);

//        s.getBytes();
    }
}
