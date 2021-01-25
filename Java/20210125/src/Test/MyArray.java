package Test;

public class MyArray {
    private Object[] data = null;
    private int size = 0;
    private int capacity = 20;

    public MyArray(){
        data = new Object[capacity];
    }

    public  void add(Object data){
        if (size >+ capacity){
            return;
        }
        this.data[size++] = data;
    }

    public Object get(int index){
        return data[index];
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(new Person("张三",20));
        myArray.add(new Person("李四",21));
        myArray.add(new Person("王五",19));

        Person person = (Person) myArray.get(0);

        MyArray myArray1 = new MyArray();
        myArray1.add("hello");
        myArray1.add("world");
        String str = (String) myArray1.get(0);

    }
}
