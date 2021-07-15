import java.util.ArrayList;
import java.util.List;

public class Solution93 {
    static final int SEG_COUNT = 4; // 4段IP地址
    List<String> res = new ArrayList<>();
    int[] segments = new int[SEG_COUNT];

    public List<String> restoreIpAddresses(String s) {
        segments = new int[SEG_COUNT];
        dfs(s,0,0);
        return res;
    }

    private void dfs(String s, int segId, int segStart){
        // 4 段 ip 地址并且遍历完字符串
        if (segId == SEG_COUNT){
            if (segStart == s.length()){
                StringBuilder ans = new StringBuilder();
                for (int i = 0; i < SEG_COUNT; ++i){
                    ans.append(segments[i]);
                    if (i != SEG_COUNT-1){
                        ans.append(",");
                    }
                }
                res.add(ans.toString());
            }
            return;
        }

        // 没有找到 4 段 ip 地址就已经遍历完毕, 提前回溯
        if (segStart == s.length()){
            return;
        }

        // (前导不能为 0 ) 如果当前数字为 0, 则这一段ip 地址只能为 0
        if (s.charAt(segStart) == '0'){
            segments[segId] = 0;
            dfs(s,segId+1,segStart+1);
        }

        // 一般情况
        int address = 0;
        for (int segEnd = segStart; segEnd < s.length(); ++segEnd){
            address = address*10 + (s.charAt(segEnd) - '0');
            if (address > 0 && address <= 0xFF){
                segments[segId] = address;
                dfs(s,segId+1,segEnd+1);
            }else {
                break;
            }
        }

    }
}
