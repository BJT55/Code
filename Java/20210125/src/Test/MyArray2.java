package Test;
// 泛型 版本： 实现MyArray的数组封装类
// 类名后面加上 <E> 泛型参数，<> 表示当前这个类是个泛型类
// E 相当于是一个形参， E 表示某一种具体的类型，会在实例化的时候确定 E 具体是那种类型
public class MyArray2<E> {
    // 创建的数组，类型就不是 Object，而是直接使用 E 作为类型
    // 后续在实例化这个 MyArray2 时，确定了E代表什么类型，也知道 data 最后的类型
    private E[] data = null;
    private int size = 0;
    private int capacity = 10;

    public MyArray2() {
        // 由于 E 这样的类型不确定，无法直接创建 E 类型的实例
        // 下面的写法是错误的
//        data = new  E[capacity];
        data = (E[]) new Object[capacity];
    }

    public void add(E data){
        if (size >= capacity){
            return;
        }
        this.data[size++] = data;
    }

    public E get(int index){
        return this.data[index];
    }


    public static void main(String[] args) {
        MyArray2<String> myArray2 =  new MyArray2<>();
        myArray2.add("hello");
        myArray2.add(" world");
        String str = myArray2.get(0)+myArray2.get(1);
        // 此时进行获取元素的时候，就不想要进行类型转换了
        System.out.println(str);

        MyArray2<Integer> myArray21 = new MyArray2<>();
        myArray21.add(10);
        myArray21.add(20);
        Integer ret = myArray21.get(0) + myArray21.get(1);
        System.out.println(ret);
    }
}
