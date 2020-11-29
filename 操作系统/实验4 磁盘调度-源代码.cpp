#include<stdio.h> 
#include<stdlib.h>
#include<time.h> 

//产生随机数15个 
void random(int *a)
{ 	
	int i,number=0;
	srand((unsigned) time(NULL));    //每次运行产生不同的随机数 
	for (i=0; i<15; i++)     //取15个随机数，放入数组a中 
	{	
		number=rand()%201;        //产生1-200的随机数 
		a[i]=number;      //将随机数赋给数组 
	} 
} 

//打印数组
void Print(int *a)    
{
	for(int i=0;i<15;i++)  //打印每一次排序的结果 
	{
		printf("%d ",a[i]);
    } 
	printf("\n\n");

}

//冒泡排序
void Sort(int *a) 
{	
	int i,j;
	int key;
	int temp;
	for(i=0;a[i]!='\0';i++)  
	{
		key=0;
		for( j=0; j+1<15-i; j++ )
		{
			if( a[j]>a[j+1] )
			{
				key=1;
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		if(key==0)  
		    break;
    }
}

//运行 
void run(int *a)
{	
	int	i,j,k;
	int count=1;   //计数 
    int start;    //起始磁道 
	int avl=0;   //平均寻道长度 
	for(i=0;i<15;i++)
	{
		if(a[i]>=100)
		{
			start=i;  
		    break;
		}
	}
	avl=a[start]-100;
    for(j=start;j<15;j++)       //大于100 
    {
    	printf("%2d:%5d访问\n",count, a[j] );
    	count++;
    	if(j+1<15)
    	avl=avl+a[j+1]-a[j];
	}
	avl=avl+a[14]-a[start-1];
	for(k=start-1;k>=0;k--)     //小于100 
	{
		printf("%2d:%5d访问\n",count, a[k]);
		count++;
		if(k-1>=0)
		avl=avl+a[k]-a[k-1];
	}
	avl/=15;
	printf("\n\n平均寻道长度:%d",avl); 
}

//主函数 
int main()
{		
	int a[15]={0};
	random(a);    //随机数 
	printf("********************磁盘调度********************\n\n");
	printf("磁头在100号磁道上，并向磁道号增加的方向上移动\n\n"); 
	printf("********************磁盘调度********************\n");
	printf("\n15个随机磁道请求序列:\n");
	Sort(a);   //从小到大排序 
	Print(a);    // 打印排好的随机数 
	run(a);	  //运行 
	return 0;
}

