import java.util.Comparator;
import java.util.PriorityQueue;

class House  {
//    implements Comparable<House>
    public String type;
    public int money;
    public int area;

    public House(String type, int money, int area) {
        this.type = type;
        this.money = money;
        this.area = area;
    }

/*    @Override
    public int compareTo(House o) {
        return o.money - this.money;
    }
    */

    @Override
    public String toString() {
        return "类型：" + type + " 价格（万）：" + money + " 面积（平方米）：" + area;
    }
}

/*class HouseComparator implements Comparator<House>{

}*/
public class Test {
    public static void main(String[] args) {
/*        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);

        while (!queue.isEmpty()){
            Integer cur = queue.poll();
            System.out.print(cur+" ");
        }*/

        PriorityQueue<House> queue = new PriorityQueue<>();
        queue.offer(new House("复式loft",200,170));
        queue.offer(new House("两室一厅",100,90));
        queue.offer(new House("一室一厅",80,50));

        while (!queue.isEmpty()){
            House house = queue.poll();
            System.out.println(house);
        }
    }
}
