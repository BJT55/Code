import java.util.Arrays;
import java.util.Stack;

public class MySort {
    // 希尔排序:
    public static void shellSort(int[] arr){
        // 使用希尔序列
        int gap = arr.length / 2;
        while (gap >= 1){
            // 分组插排
            _shellSort(arr, gap);
            gap /= 2;
        }
    }
    // 辅助希尔排序：分组插排 与 插入排序 一样
    public static void _shellSort(int[] arr, int gap){
        for (int bound = gap; bound < arr.length; bound++){
            int num = arr[bound];
            int cur = bound - gap;
            for (; cur >= 0; cur -= gap){
                if (arr[cur] > num){
                    arr[cur + gap] = arr[cur];
                }else
                    break;
            }
            arr[cur + gap] = num;
        }
    }


    // 选择排序:
    public static void selectSort(int[] arr){
        int bound = 0;  // 标志 bound 前为已排序， bound 后为未排序
        for (; bound < arr.length-1; ++bound){
            for (int cur = bound + 1; cur < arr.length; ++cur){
                if (arr[cur] < arr[bound]){
                    swap(arr,cur,bound);
                }
            }
        }
    }

    // 交换
    public static void swap(int[] arr, int x, int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }


    // 堆排序:
    public static void heapSort(int[] arr){
        // 1.建堆
        creatHeap(arr);
        // 2.交换堆顶元素和最后一个元素，删除最后一个元素并向下调整
        int heapSize = arr.length;
        for (int i = 0; i < arr.length; ++i){
            // 交换堆顶和最后一个元素
            swap(arr,0,heapSize-1);
            // 删除最后一个元素
            heapSize--;
            // 向下调整
            shiftHeap(arr,heapSize,0);
        }
    }
    // 向下调整
    public static void shiftHeap(int[] arr, int size, int index){
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size){
            // 找出左右子树较大的
            if (child+1 < size && arr[child + 1] > arr[child]){
                child += 1;
            }
            if (arr[parent] < arr[child]){
                swap(arr,parent,child);
            }else
                break;

            parent = child;
            child = 2 * parent + 1;
        }
    }
    // 建堆
    public static void creatHeap(int[] arr){
        for (int i = (arr.length - 1 - 1)/2; i >= 0; --i){
            shiftHeap(arr,arr.length,i);
        }
    }

    // 冒泡排序：
    public static void bubbleSort(int[] arr){
        int bound = 0;
        for (;bound < arr.length; ++bound){
            for (int cur = arr.length-1; cur > bound; --cur){
                if (arr[cur] < arr[cur-1]){
                    swap(arr,cur,cur-1);
                }
            }
        }
    }


    // 快速排序：
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }
    // 辅助快速排序
    public static void _quickSort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        // 获取 基准值 所在位置
        int index = partition(arr,left,right);
        // 递归处理 index 左/右 区间
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }
    public static int partition(int[] arr, int left, int right){
        // 选取基准值
        int model = arr[right];
        int i = left, j = right;
        while (i < j){
            // 找到比基准值大的值
            while (i < j && arr[i] <= model)
                i++;
            // 找到比基准值小的值
            while (i < j && arr[j] >= model)
                j--;
            // 交换这两个元素
            swap(arr,i,j);
        }
        // 当 i 和 j 相等时，交换当前位置的值 和 基准值，使得基准值位于数组的“中间”
        swap(arr,i,right);
        return i;
    }

    // 使用非递归实现快速排序
    public static void quickSortByLoop(int[] arr){
        Stack<Integer> stack = new Stack<>();
        // 将第一组数据入栈
        stack.push(0);
        stack.push(arr.length-1);
        // 循环取栈顶元素 进行 partition 操作
        while (!stack.isEmpty()){
            int end = stack.pop();
            int start = stack.pop();
            if (start >= end){
                // 空区间 只有一个元素
                continue;
            }
            // 调用 partition
            int index = partition(arr,start,end);
            // 把得到的子区间入栈
            stack.push(end);
            stack.push(index + 1);
            stack.push(index - 1);
            stack.push(start);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,5,2,7,3,6,8};
//        shellSort(arr);
//        System.out.println(Arrays.toString(arr));
//        selectSort(arr);
//        System.out.println(Arrays.toString(arr));
//        quickSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
