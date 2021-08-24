import java.util.PriorityQueue;

class MedianFinder {

    /** initialize your data structure here. */
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        left = new PriorityQueue<>((x,y)->y-x); // 降序
        right = new PriorityQueue<>(); // 升序
    }

    public void addNum(int num) {
        left.add(num);
        right.add(left.poll());
        if (left.size()+1 < right.size()){
            left.add(right.poll());
        }
    }

    public double findMedian() {
        if (right.size() > left.size()) return right.peek();
        return (double)(left.peek()+right.peek())/2;
    }
}