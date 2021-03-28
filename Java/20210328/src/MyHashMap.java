class HashNode {
    int key;
    int value;
    HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class MyHashMap {
    private HashNode[] array = new HashNode[16];
    private int size = 0;

    // 插入
    public void put(int key, int value){
        // 将 key 转化为数组下标
        int index = key % array.length;
        // 遍历该位置的链表，判断 key 是否已经存在
        // 若已经存在，直接修改 value
        for (HashNode cur = array[index]; cur != null; cur = cur.next){
            if (cur.key == key){
                cur.value = value;
                return;
            }
        }
        // 不存在相同的 key 直接链表头插
        HashNode newNode = new HashNode(key,value);
        newNode.next = array[index];
        array[index] = newNode;
        size++;
        // 判断 size 是否达到一定数值，若达到，则扩容
        if (loadFactor() > 0.75){
            resize();
        }
    }
    // 计算负载因子
    private double loadFactor(){
        return (double)size / array.length;
    }
    // 扩容
    private void resize(){
        // 创建一个更长的数组，将原来的数组中的数值拷贝到新的扩容的数组
        HashNode[] newArray = new HashNode[array.length*2];
        for (int i = 0; i < array.length; ++i){
            HashNode next;
            for (HashNode cur = array[i]; cur != null; cur = next){
                next = cur.next; // 备份当前的位置
                int indexNew = cur.key % array.length;
                cur.next = newArray[indexNew];
                newArray[indexNew] = cur;
            }
        }
    }

    // 查找
    public Integer get(int key){
        // 根据 key 得到 index ，再遍历链表
        int index = key % array.length;
        for (HashNode cur = array[index]; cur != null; cur = cur.next){
            if (cur.key == key){
                return cur.value;
            }
        }
        return null;
    }


    // 删除
    public void delete(int key){
        int index = key % array.length;
        for (HashNode cur = array[index]; cur != null; cur = cur.next){

        }
    }
}
