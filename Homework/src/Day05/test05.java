package Day05;
// 你的朋友正在使用键盘输入他的名字 name。
// 偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
//你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。

public class test05 {
    public static void main(String[] args) {
        String name = "alsed";
        String typed = "alss";
        System.out.println(isLongPressedName(name,typed));
    }

    public static boolean isLongPressedName(String name, String typed){
        int i = 0, j = 0;
        while ( j < typed.length() ){
            if ( i < name.length() && name.charAt(i) == typed.charAt(j) ){
                i++;
                j++;
            }else if ( j > 0 && typed.charAt(j) == typed.charAt(j - 1) ){  // typed 中有重复字符且 name 没有重复字符
                j++;
            }else {
                return false;
            }
        }
        if (i == name.length()){  // 判断name是否遍历完（针对name还未判断完，typede已经结束的情况）
            return true;
        }else {
            return false;
        }
    }
}
