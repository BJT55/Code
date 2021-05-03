import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] step=new int[m+1];
        for(int i=0;i<m+1;i++){
            step[i]=Integer.MAX_VALUE;
        }
        step[n]=0;
        for(int i=n;i<m;i++){
            if(step[i]==Integer.MAX_VALUE){
                continue;
            }//求i的约数
            List<Integer>list=div(i);
            for(int j : list){
            //j代表此时我们一步可以条几个台阶
                if(i+j<=m&&step[i+j]!=Integer.MAX_VALUE){
                    step[i+j]=Math.min(step[i+j],step[i]+1);
                }else if(i+j<=m){
                    step[i+j]=step[i]+1;
                }
            }
        }
        if(step[m]==Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(step[m]);
        }
    }
    public static List<Integer>div(int num){
        List<Integer>list=new ArrayList<>();
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                list.add(i);
                if(num/i!=i){
                    list.add(num/i);
                }
            }
        }
        return list;
    }
}