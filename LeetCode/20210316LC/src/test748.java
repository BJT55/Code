public class test748 {
}


class Solution748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target = count(licensePlate);
        String ans = "";
        for (String word : words){
            if ((word.length() < ans.length() || ans.length() == 0)
            && dominates(target,count(word.toLowerCase()))){
                ans = word;
            }
        }
        return ans;
    }
    public boolean dominates(int[] licenseCount, int[] WordCount){
        for (int i = 0; i < 26; ++i){
            if (licenseCount[i] > WordCount[i])
                return false;
        }
        return true;
    }

    // 计算每个字母出现的次数：
    public int[] count(String word){
        int[] ans = new int[26];
        for (char letter : word.toCharArray()){
            int index = Character.toLowerCase(letter) - 'a';
            if(0 <= index && index < 26){
                ans[index]++;
            }
        }
        return ans;
    }
}