
public class MyArrayList {
    //属性
    private String[] data = null;
    private int size = 0; // 有效元素个数
    private int capacity = 100; // 最大容纳元素个数

    public MyArrayList(){
        data = new String[capacity];
    }

    // 扩容
    public void realloc(){
        // 扩大capacity
        capacity *= 2;
        String[] newData = new String[capacity];
        // 将旧的数组中的元素拷贝到新数组中
        for (int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        // 将新的扩容后的数组赋值给原有的属性 data
        data = newData;
    }

    // 增
    // 1.插入到元素末尾
    public void add(String elem){
        if (size >= capacity){
            // 扩容
            realloc();
        }
        data[size] = elem;
        size++;
    }
    // 2.插入指定位置
    public void add(int index, String elem){
        if (index < 0 || index > size){
            return;
        }
        if (size >= capacity){
            // 扩容
            realloc();
        }
        // 遍历将所有 插入位置和后面所有的元素向后移动一位
        for (int i = size - 1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = elem;
        size++;
    }

    // 删除
    // 1.按照元素的值删除
    public void remove(String elem){
        for (int i = 0; i < size; i++){
            if (elem.equals(data[i])){
                for (int j = i; j < size - 1; j++){
                    data[j] = data[j+1];
                }
                size--;
                break;
            }
        }
    }
    // 2.按照下标位置删除
    public void remove(int index){
        if (index < 0 || index >= size){
            return;
        }
        for (int i = index; i < size - 1; i++ ){
            data[i] = data[i+1];
        }
        size--;
    }


    // 根据下标获取元素
    public String get(int index){
        if (index < 0 || index >= size){
            return null;
        }
        return data[index];
    }

    // 根据下标修改元素
    public void set(String elem, int index){
        if (index < 0 || index >= size){
            return;
        }
        data[index] = elem;
    }


    // 判断元素是否存在
    public boolean contains(String elem){
        for (int i = 0; i < size; i++){
            if (data[i] .equals(elem)){
                return true;
            }
        }
        return false;
    }

    // 查找元素的位置
    public int indexOf(String elem){
        for (int i = 0; i < size; i++){
            if (data[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }


    // 查找元素的位置（从后向前找）
    public int lastIndexOf(String elem){
        for (int i = size - 1; i >= 0; i--){
            if (data[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }


    // 清空元素
    public void clear(){
        size = 0;
    }


    // 获取size大小
    public int size(){
        return size;
    }


    // 判断是否为空
    public boolean isEmpty(){
        return size == 0;
    }





    // 重写 toString 方法
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++){
            stringBuilder.append(data[i]);
            if (i < size - 1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }



    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        // 1.验证插入
        // 尾插
        myArrayList.add("C++");
        myArrayList.add("Java");
        myArrayList.add("Python");
        System.out.println("尾插入："+myArrayList);
        // 中间位置插入
        myArrayList.add(2,"C");
        myArrayList.add(1,"JavaScript");
        myArrayList.add(3,"PHP");
        System.out.println("中间位置插入: "+myArrayList);

        // 2.验证删除
        // 元素值删除
        myArrayList.remove("C");
        System.out.println("元素为‘C’的删除："+myArrayList);
        // 元素下标位置删除
        myArrayList.remove(0);
        System.out.println("元素下标0的元素删除: " + myArrayList);

        // 3.验证获取下标
        System.out.println("获取下标为2的元素： "+myArrayList.get(2));

        // 4.验证根据下标修改
        myArrayList.set("C#",0);
        System.out.println("修改下标为0的元素为C#： " + myArrayList);

        // 5.验证查找元素（未找到则返回-1）
        System.out.println("查找元素C++所在位置： "+myArrayList.indexOf("C++"));

        // 6.验证查找元素位置（未找到则返回-1）
        System.out.println("查找元素Python位置: "+myArrayList.lastIndexOf("Python"));

        // 7.验证输出size大小
        System.out.println("size 大小：" + myArrayList.size);

        // 8.验证是否为空
        System.out.println("是否为空: " + myArrayList.isEmpty());
    }
}
