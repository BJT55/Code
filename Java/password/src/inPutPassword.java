import java.util.Scanner;
//模拟实现输入密码，若错误三次则直接退出
public class inPutPassword {    //输入密码判断
    public static boolean inputPassword(String password){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while( count <3 ){
            System.out.println("请输入密码：");
            String guessPD = scanner.next();
            if ( guessPD.equals(password)){    //密码输入正确
                return true;
            }
            else{
                count++;
                int chance = 3 - count;
                System.out.println("输入有误，请重试，您还有"+ chance +"次机会...");
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("请设置密码：");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if(inputPassword(password)){
            System.out.println("密码正确，登录成功....");
        }
        else{
            System.out.println("已达到输入上限值，登录失败....");
        }
    }
}
