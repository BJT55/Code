import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        // 1.插入(存储顺序与插入顺序无关)
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        map.put("4","four");
        map.put("4","five");
        System.out.println(map);

        // 2.查找
//        System.out.println(map.get("1"));
        // get 根据 key 找 value, 此处的 two 为 value，因此返回 null
//        System.out.println(map.get("two"));
        // 看是否存在 key , 若不存在 则返回自己给定的值, 若存在 则返回 map 已存在的值
//        System.out.println(map.getOrDefault("9","nine"));
//        System.out.println(map.getOrDefault("1","nine"));

        // 3.使用 size 获取包含多少键值对
//        System.out.println(map.size());

        // 4. 判断是否为空
//        System.out.println(map.isEmpty());

        // 5. 清空所有
//        map.clear();
//        System.out.println(map.isEmpty());

/*      // 效率较低，不建议使用
        // 6.遍历 map
        // 所有 key 和 value
        for (Map.Entry<String,String> entry : map.entrySet()){
            // Entry 是 Map 的内部类
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // 所有的 key
        for (String key : map.keySet()){
            System.out.println(key);
        }

        // 所有的 value
        for (String value : map.values()){
            System.out.println(value);
        }*/

    }
}
