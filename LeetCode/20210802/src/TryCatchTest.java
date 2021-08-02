public class TryCatchTest {
    public static void main(String[] args) {
//        int a = 0;
//        try {
//            a = 10/1;
//            System.out.println(a);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            a = 100;
//        }
//        System.out.println(a);  //100

        System.out.println(func(10));  // 110

    }

    public static int func(int a){
        try {
            return a;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return a+100;
        }
    }
}
