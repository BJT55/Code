#include<stdio.h>
#include<stdlib.h>
#define MAX 500000
//桶排序
void bucketsort(int* s, int n)
{
    int i,j,max_num=s[0];
    int* bucket;
    //先求出序列最大值
    for(i=1;i<n;i++)
	{
        if(s[i]>max_num)
		{
            max_num=s[i];
        }       
    }
    max_num++;  //最大值加1
    if(s==NULL || n<=1)
	{
        return;
    }
    if((bucket = (int*)malloc(sizeof(int)*max_num))==NULL){return;}
    for(i=0;i<max_num;i++)
	{
        bucket[i]=0;   //空桶数组初始化
    }
    for(i=0;i<n;i++)
	{ // 寻访序列，把元素一个一个放入对应的桶里
        bucket[s[i]]+=1;   
    }
    for(i=0,j=0;i<max_num;i++)
	{
        while((bucket[i])>0)
		{  //对每个不是空的桶子进行排序
            s[j]=i;   //从不是空的桶子里把项目再放回原来的序列中
            j++;
            bucket[i]--;
        }
    }
    free(bucket);
    bucket = NULL;
}
int main()
{
	int N,a[MAX];
	scanf("%d",&N);
	for(int i=0;i<N;i++)
	{
		scanf("%d",&a[i]);
	}
	bucketsort(a,N);
	for(int j=0;j<N;j++)
	{
		printf("%d ",a[j]);
	}
}
