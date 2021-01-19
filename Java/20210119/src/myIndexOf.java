public class myIndexOf {
    public static void main(String[] args){
        String str = "this is an apple";
        String search = "apple";
        System.out.println(myIdOfFunc(str,search));
    }

    public static int myIdOfFunc(String src, String dst){
        if (null == src || src.length() < 1 || null == dst || dst.length() < 1) {
            return -1;
        }
        if (dst.length() > src.length()) {
            return -1;
        }
        char[] srcArray = src.toCharArray();
        char[] dstArray = dst.toCharArray();
        int srcLen = srcArray.length;
        int dstLen = dstArray.length;
        for (int i = 0; i < srcLen; i++) {
            boolean find = false;
            if (srcArray[i] == dstArray[0] && (i + dstLen <= srcLen)) {
                int equalCount = 0;
                for (int j = 0; j < dstLen; j++) {
                    if (srcArray[i + j] == dstArray[j]) {
                        equalCount++;
                    }
                }
                if (equalCount == dstLen) {
                    find = true;
                }
            }
            if (find) {
                return i;
            }
        }
        return -1;
    }
}
