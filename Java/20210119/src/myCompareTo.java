public class myCompareTo {
    public static void main(String[] args) {
        String str1 = "aabbccc";
        String str2 = "aaaaaaaac";
        if (myComTo(str1,str2) > 0){
            System.out.println("字符串"+str1+"大");
        }else if (myComTo(str1,str2) == 0 ){
            System.out.println("字符串"+str1+"字符串"+str2+"一样大");
        }else {
            System.out.println("字符串"+str2+"大");
        }
    }
    public static int myComTo(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int len = len1 > len2 ? len2 : len1;
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) - str2.charAt(i) < 0) {
                return -1;
            } else if (str1.charAt(i) - str2.charAt(i) > 0) {
                return 1;
            } else {
                continue;
            }
        }
        if (len1 == len2){
            return 0;
        }else {
            return (len1 - len2) > 0 ? 1 : -1;
        }
    }
}
