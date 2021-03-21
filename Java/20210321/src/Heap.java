import java.util.Arrays;

public class Heap {
    // array 表示存储堆的数组
    // size 表示数组上有效元素的个数
    // index 表示从哪个位置开始进行向下调整
    // 已大堆为例

    // 向下调整
    public static void shiftDown(int[] array, int size, int index){
        int parent = index;
        int child = 2 * parent + 1;
        // 循环，若 child >= size 就说明 parent 已经是叶子结点，
        while (child < size) {
            // 1.找出左右子树的最大值
            if (child + 1 < size && array[child + 1] > array[child]){
                // 如果右子树存在，且右子树大于左子树的值
                child = child + 1;
            }
            // 用 child 记录左右子树中较大的值
            // 2.用 child 和 parent 进行比较，不符合就交换两个元素
            if (array[parent] < array[child]){
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            }else
                break;

            // 更新循环变量
            parent = child;
            child = parent * 2 + 1;
        }
    }

    public static void createHeap(int[] array){
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--){
            shiftDown(array,array.length,i);
        }
    }

    private int[] data = new int[100];
    private int size = 0;

    public Heap(int[] data, int size){
        this.size = size;
        for (int i = 0; i < size; ++i){
            this.data[i] = data[i];
        }

    }
    // 插入新元素
    public void offer(int val){
        if (size >= data.length){
            return;
        }

        // 1.x=先把新元素放入到数组的末尾
        data[size] = val;
        size++;
        // 新元素加入可能会破坏堆的结构，因此要调整使得堆重新符合要求
        // 向上调整
        shiftUp(data,size,size-1);
    }

    // 向上调整
    public static void shiftUp(int[] array, int size, int index){
        int child = index;
        int parent = (child - 1) / 2;
        while (child > 0){
            // 比较父节点和自己诶按是否符合堆得要求
            if (array[parent] < array[child]){
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            }else{
                break;
            }
            child = parent;
            parent = (child - 1) / 2;
        }
    }


    // 获取堆顶元素
    public Integer peek(){
        if (size == 0)
            return null;

        return data[0];
    }

    // 删除堆顶元素
    public Integer poll(){
        if (size == 0)
            return null;

        Integer tmp = data[0];
        data[0] = data[size-1];
        size--;
        shiftDown(data,size,0);
        return tmp;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; ++i){
            s.append(data[i] + " ");
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int[] array = {4,9,5,2,7,3,6,8};
        createHeap(array);

        Heap heap = new Heap(array,array.length);
        // 添加：
        heap.offer(10);
        System.out.println(heap.toString());
        // 删除:
        heap.poll();
        System.out.println(heap.toString());

    }
}
