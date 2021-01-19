public class myReplace {
    public static void main(String[] args) {
        String str = "An Apple";
        myReplaceFunc(str,'A','a');
    }
    static void myReplaceFunc(String str,char sourChar,char newChar){
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == sourChar){
                c = newChar;
            }
            System.out.print(c);
        }
    }
}
