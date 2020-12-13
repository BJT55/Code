package experiment02;


public class StringSort {


	public static void main(String[] args){
		String[] str1={"i","am","a","student"};
		String[] str2={"i","like","apple"};
		
		int[] a={1,4,3,6,7,8,5};
		int[] b={1,5,6,6,4,9,0,7};
		
		double[] c={1.2,3.4,5.5,2.20};
		double[] d={5.5,2.2,7,65,1,2};
		
		Array.niXu(str1);
		Array.niXu(str2);
		Array.bin(a, b);
		Array.jiao(c, d);
	}

}

class Array{
	public static void niXu(String str[] ){
		for(int i=str.length-1;i>=0;i--){
			System.out.printf(str[i]);
		}
		System.out.println();
	}
	public static void bin(int[] a,int[] b){
		int[] c = new int[20];
		int k = a.length;
		int t=0;
		for(int i = 0;i < b.length;i++)
		{
			int flag = 0;
			for(int j = 0;j < k;j++)
			{
				if(b[i] == a[j])
				{
					flag=1;
				}
			}
			if(flag != 0)
			{
				c[i] = b[i];
				if(i==0){
					System.out.print(c[i]+" ");
				}
				else{
					if(c[i]!=c[i-1]){
						System.out.print(c[i]+" ");
					}
				}			
				t=t+1;
			}
		}
		System.out.println();
	}
	public static void jiao(double[] a,double[] b){
		double[] c = new double[20];
		int k = a.length;
		int t=0;
		for(int i = 0;i < b.length;i++)
		{
			int flag = 0;
			for(int j = 0;j < k;j++)
			{
				if(b[i] == a[j])
				{
					flag=1;
				}
			}
			if(flag != 0)
			{
				c[i] = b[i];
				if(i==0){
					System.out.print(c[i]+" ");
				}
				else{
					if(c[i]!=c[i-1]){
						System.out.print(c[i]+" ");
					}
				}			
				t=t+1;
			}
		}
		System.out.println();
	}
}