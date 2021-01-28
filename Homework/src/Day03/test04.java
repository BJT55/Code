package Day03;
//赎金信：给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
//判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
//如果可以构成，返回 true ；否则返回 false
public class test04 {
    public static void main(String[] args) {
        String ransom = "apple";
        String magazine = "pineapple";
        Solution sl = new Solution();
        System.out.println(sl.canConstruct(ransom,magazine));
    }

    public static class Solution{
        public boolean canConstruct(String ransomNote, String magazine){
            int count = 0;
            for (int i = 0; i < ransomNote.length(); i++){
                char r = ransomNote.charAt(i);
                for (int j = 0; j < magazine.length(); j++){
                    char m = magazine.charAt(j);
                    if ( r == m ){
                        count++;
                        break;
                    }
                }
            }
            if (count == ransomNote.length()){
                return true;
            }else {
                return false;
            }

        }
    }
}
