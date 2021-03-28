import org.omg.CORBA.MARSHAL;

import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class SetAndMap {
    // 找到数组中只出现一次的数
    public int singleNumber01(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int x : nums){
            Integer single = map.get(x);
            if (single == null){
                map.put(x,1);
            }else {
                map.put(x,single+1);
            }
        }
        // 找到 single 为 1 的数
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return 0;
    }


    // 方法二： 按位异或
    public int singleNumber02(int[] nums){
        int ret = 0;
        for (int x : nums){
            ret ^= x;
        }
        return ret;
    }

    // 复制带随机指针的链表
    public Node copyRandomList(Node head){
        // 1.遍历旧链表，将每个旧链表中的结点都创建新的结点放入map中
        Map<Node , Node> map = new HashMap<>();
        for (Node cur = head; cur != null; cur = cur.next){
            map.put(cur, new Node(cur.val));
        }
        // 2.再次遍历，构造 next / random 的指向
        for (Node oldNode = head; oldNode != null; oldNode = oldNode.next){
            // 连接next
            Node newNode = map.get(oldNode);
            Node newNodeNext = map.get(oldNode.next);
            newNode.next = newNodeNext;
            // 连接random
            Node newNodeRandom = map.get(oldNode.random);
            newNode.random = newNodeRandom;
        }
        return map.get(head);
    }

    // 宝石与石头
    public int numJewelsInStones(String jewels, String stones){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); ++i){
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); ++i){
            if (set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }


    // 找到前 k 个重复的单词
    public List<String> topFrequent(String[] words, int k){
        // 1.统计短词出现的次数
        Map<String, Integer> map = new HashMap<>();
        for (String word : words){
            Integer value = map.getOrDefault(word, 0);
            map.put(word, value + 1);
        }
        // 2.对单词出现的次数进行排序
        List<String> wordList = new ArrayList<>(map.keySet());
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 变量捕获，匿名内部类，可以直接使用外部的变量
                // 本质上相当于编译器自动给该匿名内部类创建了一个同名字变量
                // 并且在实例化的时候自动进行了传参
                int count1 = map.get(o1);
                int count2 = map.get(o2);
                if (count1 == count2){
                    // 如果相等，就按照 String 默认的规则排序（按照字典）
                    return o1.compareTo(o2);
                }
                return count2 - count1;
            }
        });
        return wordList.subList(0,k);
    }
}
