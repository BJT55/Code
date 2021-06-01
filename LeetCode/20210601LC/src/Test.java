public class Test {
    public static void main(String[] args) {
        String s = "012345623";
        int end = s.indexOf('2',3);
        System.out.println(s.substring(0,end));
    }
}
