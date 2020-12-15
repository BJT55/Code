import java.util.Scanner;

public class age {
    //输入年龄打印当前年龄所处年龄段
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 18){
            System.out.println(age+"岁是少年..");
        }
        else if(age <= 28){
            System.out.println(age+"岁是青年..");
        }
        else if(age <= 55){
            System.out.println(age+"岁是中年..");
        }
        else {
            System.out.println(age+"岁是老年..");
        }
    }
}
