import java.util.Scanner;
import java.util.TreeMap;

public class HJ8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int i = 0; i < n; ++i){
                int key = in.nextInt();
                int value = in.nextInt();
                if(!map.containsKey(key)){
                    map.put(key,value);
                }else{
                    map.put(key,map.get(key)+value);
                }
            }
            for(Integer key : map.keySet()){
                System.out.println(key + " " +  map.get(key));
            }
        }
    }
}
