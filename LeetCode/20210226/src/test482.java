public class test482 {
    public static void main(String[] args) {
        Solution482 s = new Solution482();
        String S = "5F3Z-2e-9-w";
        int K = 4;
        System.out.println(s.licenseKeyFormatting(S,K));
    }
}


// 44ms  28.05%
class Solution482 {
    public String licenseKeyFormatting(String S, int K) {
        if (K <= 0) return "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < S.length(); i++){
            if(S.charAt(i) != '-') builder.append(S.charAt(i));
        }
        for (int i = builder.length() - K; i > 0; i -= K){
            builder.insert(i,'-');
        }
        return builder.toString().toUpperCase();
    }
}
