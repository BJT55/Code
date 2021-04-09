import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();

        for(String s : cpdomains){
            String[] data = s.split(" ");
            int count = Integer.parseInt(data[0]);
            String[] domins = data[1].split("\\.");

            for(int i = domins.length - 2; i >= 0; --i){
                domins[i] += "." + domins[i+1];
            }

            for(String domin : domins){
                map.put(domin, map.getOrDefault(domin,0) + count);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            StringBuilder ans = new StringBuilder();
            ans.append(entry.getValue()).append(" ").append(entry.getKey());
            res.add(ans.toString());
        }
        return res;
    }
}