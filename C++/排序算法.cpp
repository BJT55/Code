#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define size 5

void printfsort(int *s,int n);  //输出
void bubblesort(int *s,int n);  //冒泡排序 
void quicksort(int *s,int left,int right);  //快速排序 
void selectsort(int *s,int n);  //选择排序
void insertsort(int *s,int n);  //插入排序 
void shellsort(int *s,int n);  //希尔排序 
void mergesort(int *s,int left,int right);
void merge(int *s,int left,int mid,int right);  //归并排序
int max(int *s, int n);
void radixsort(int *s, int n);  //基排序 


int main()
{
	int choose,N=size;
	int a[N];
	do
	{

        printf("\n\n************************排序算法****************************\n");
	    printf("                        1.冒泡排序\n");
	    printf("                        2.快速排序\n");
	    printf("                        3.选择排序\n");
	    printf("                        4.插入排序\n");
	    printf("                        5.希尔排序\n");
		printf("                        6.归并排序\n");
		printf("                        7.基排序\n");	
		printf("                        8.桶排序\n");
	    printf("                        0.退出系统\n");
	    printf("\n请输入需要排序的%d个数：\n",N); 
	    for(int i=0;i<N;i++)     //输入需要进行排序的数 
	    {
		    scanf("%d",&a[i]);
	    } 
	    printf("\n请输入您选择的排序方法:");
        scanf("%d", &choose);
        switch(choose)
	    {
	        case 1:
			    bubblesort(a,N);
				printfsort(a,N); 
                break;
            case 2:
			    quicksort(a,0,N-1);
			    printfsort(a,N); 
                break;
            case 3:
            	selectsort(a,N);
            	printfsort(a,N);
            	break;
            case 4:
            	insertsort(a,N);
            	printfsort(a,N);
            	break;
            case 5:
            	shellsort(a,N);
            	printfsort(a,N);
            	break;
            case 6:
            	mergesort(a,0,N-1);
            	printfsort(a,N);
            	break;
            case 7:
            	radixsort(a,N);
            	printfsort(a,N);
            	break;
            case 0:
                break;
	    }	    
    }while(choose!=0);
}

void bubblesort(int *s,int n)  //冒泡排序 
{
	int i,j,temp;
	for(i=0;i<n;i++)   //交换，大的值下沉，小的值上浮 
	{
		for(j=0;j<n;j++)
		{
			if(s[j]>s[j+1])
			{
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
		}
	}
}


void quicksort(int *s,int left,int right)   //快速排序 
{
	int i,j,k,temp;
	if(left>right)
	{
		return ;
	}
	temp=s[left];
	i=left;
	j=right;
	while(i!=j)
	{
		while(s[j]>=temp&&i<j)  //从右开始比较 
		{
			j--;
		}
		while(s[i]<=temp&&i<j)   //从左开始比较 
		{
			i++;
		}
		if(i<j)   //左边数值大于右边数值，交换 
		{
			k=s[i];
			s[i]=s[j];
			s[j]=k;
		}
	}
	s[left]=s[i];
	s[i]=temp;
	quicksort(s,left,i-1);
	quicksort(s,i+1,right);
}


void selectsort(int *s,int n)   //选择排序 
{
	int i,j,temp;
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(s[i]>s[j])
			{
				temp=s[j];
				s[j]=s[i];
				s[i]=temp;
			}
		}
	}
}


void insertsort(int *s,int n)  //插入排序
{
	int i,j,temp=s[0];
	for(i=1;i<n;i++)
	{
		temp=s[i];
		j=i-1;
		while(j>=0&&temp<s[j])
		{
			s[j+1]=s[j];
			j--;
		}
		s[j+1]=temp;
	}
 } 

 
void shellsort(int *s,int n)   //希尔排序 
{
	int t=size,temp,i,j,k;
	while(t!=1)
	{
		t=t/2;
		for(i=0;i<size;i++)
		{
			for(j=i+t;j<size;j++)
			{
				if(s[j]<s[i])
			    {
				temp=s[j];
				s[j]=s[i];
				s[i]=temp;
			    } 
			}
			
		}
	}
}


void mergesort(int *s,int left,int right)  //归并排序 
{
	if(left<right)
	{
		int mid=(left+right)/2;
		mergesort(s,left,mid);
		mergesort(s,mid+1,right);
		merge(s,left,mid,right);
	}
}
void merge(int *s,int left,int mid,int right)
{
	int i=left,j=mid+1,t=left;
	int srr[size];
	while(i<=mid&&j<=right)
	{
		if(s[i]<s[j])
		{
			srr[t++]=s[i++];
		} 
		else srr[t++]=s[j++];
	}
	while(i<=mid)   
	{
		srr[t++]=s[i++];
	}
	while(j<=right)   
	{
		srr[t++]=s[j++];
	}
	for(int k=left;k<=right;k++)
	{
		s[k]=srr[k];
	}  
}


int max(int *s, int n) 
{
    int x=1; //保存最大的位数
    int y=10;
    for(int i=0;i<n;i++)
    {
        while(s[i]>=y)
        {
            y*=10;
            x++;
        }
    }
    return x;
}
void radixsort(int *s, int n) //基数排序
{
    int x=max(s,n);
    int temp[n];
    int count[10]; //计数器
    int i,j,k;
    int radix = 1;
    for(i =1;i<=x; i++) //进行x次排序
    {
        for(j=0;j<10;j++)
            count[j]=0; //每次分配前清空计数器
        for(j=0;j<n;j++)
        {
            k = (s[j]/radix)%10; //统计每个桶中的记录数
            count[k]++;
        }
        for(j=1;j<10;j++)
            count[j]=count[j-1]+count[j]; //将tmp中的位置依次分配给每个桶
        for(j=n-1;j>=0;j--) //将所有桶中记录依次收集到tmp中
        {
            k = (s[j]/radix)%10;
            temp[count[k]-1]=s[j];
            count[k]--;
        }
        for(j=0;j<n;j++) //将临时数组的内容复制到data中
            s[j]=temp[j];
        radix=radix*10;
    }
} 


void printfsort(int *s,int n)   //打印输出 
{
	int k; 
	for(k=0;k<size;k++)
	{
		printf("%d  ",s[k]);
	}     
}
