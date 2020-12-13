package experiment01;

public class PrintStar {
		public static void main(String[] args){
			Star star=new Star();
			star.printstar(6);
			star.printstar(10);
		}
}

class Star{
		public void printstar(int n)
		{
			for(int i=0;i<n;i++)
			{
				if(i!=n-1)
				{
					for(int j=0;j<n-1-i;j++)
					{
						System.out.printf(" ");
					}
					System.out.printf("*");
					for(int k=0;k<2*i-1;k++)
					{
						System.out.printf(" ");
					}
					if(i!=0)
					{
						System.out.printf("*");
					}		
				}
				else
				{
					for(int t=0;t<2*n-1;t++)
					{
						System.out.printf("*");
					}
				}
				System.out.println();
			}
		}
}

