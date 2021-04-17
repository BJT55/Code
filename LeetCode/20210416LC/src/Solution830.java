import java.util.ArrayList;
import java.util.List;

class Solution830 {
    public static  List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < s.length();){
            int j = i+1;
            List< Integer > list = new ArrayList<>();
            while(j < s.length()){
                if(s.charAt(j) == s.charAt(i)){
                    j++;
                }else{
                    if(j-i >= 3){
                        list.add(i);
                        list.add(j);
                    }
                    i = j;
                    break;
                }
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        System.out.println(largeGroupPositions(s));
    }
}