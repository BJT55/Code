package Test;
import java.util.Scanner;
public class Login {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名： ");
        String name = scanner.next();
        System.out.println("请输入密码： ");
        String password = scanner.next();
        try {
            loginName(name);
        }catch (NameException e){
            e.printStackTrace();
        }
        try {
            loginPassword(password);
        }catch (PasswordException e){
            e.printStackTrace();
        }
    }

    public static void loginName(String name) throws NameException{
        if (!name.equals("admin")){
            throw new NameException("用户名输入错误");
        }


    }

    public static void loginPassword(String password) throws PasswordException{
        if (!password.equals("123456")){
            throw new PasswordException("密码输入错误");
        }
    }
}
