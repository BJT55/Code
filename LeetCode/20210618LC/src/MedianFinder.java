import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    /** initialize your data structure here. */
    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>((a,b)->{return b-a;});
    }

    public void addNum(int num) {
        // 前/2个小的放在max中, 后n/2个大的放在min中
        // 此时max的peek是前半段中最大的, min的peek是后半段中最小的
        max.add(num);
        min.add(max.remove());
        if (min.size() > max.size()){
            max.add(min.remove());
        }
    }

    public double findMedian() {
        if (min.size() == max.size()){
            return (min.peek() + max.peek())/2.0;
        }
        return max.peek();
    }
}
