public class mySplit {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7,8";
        mySplitFunc(str);
    }

    static void mySplitFunc(String str){
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if ( c != ','){
                System.out.print(c + " ");
            }
        }
    }
}
