package Test;

public class test01 {
/*    public static void main(String[] args) {
        //如果采用了 LBYL 风格，则需要判断返回值是否为 null
        try{
            int ret = divide(10,0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

    }*/
    public  static Integer divide(int x, int y){
        if (y == 0){

            //这种情况西安我们应该告诉哪里出了问题
            //如果通过返回值的方法告知调用者这里出现问题，也是可以的，但这样是 LBYL 风格
//            Integer(使用这个才能返回 null)
//            return null;

            throw new ArithmeticException("此处抛出一个算术异常");
        }
        return x / y;
    }

    public static int func(){
        try {
            return 10;
        }finally {
            // 一般来说要谨慎在 finally 中使用 return 语句
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(func());
    }
}
