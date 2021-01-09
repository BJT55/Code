
#include<iostream>
#include<stdio.h>
#include<stdlib.h>
using namespace std;
const int maxn=200000;
int a[maxn];
int N;
 
void swap(int& a,int& b)
{
	int tmp=a;
	a=b;
	b=tmp;
}
 
/*从第i个元素开始向下调整，元素个数为N*/
void down_adjust(int i,int N)
{
	while(i*2+1<N) //存在子结点 
	{
		int child=i*2+1; 
		if(child+1<N&&a[child]>a[child+1]) //保证child总指向子结点中较小的的那个 
		{
			child++;
		}
		if(a[i]>a[child]) 
		{
			swap(a[i],a[child]);	
		}
		else break; //由于从后往前进行down_adjust，子结点的子结点一定比子结点还要大 
		i=child;
	}
}
 
/*堆排序*/
void heap_sort(int N)
{
	for(int i=N/2;i>=0;i--) //先对每个非叶结点进行一次向下调整，保证每个元素都比其左右子结点小 
	down_adjust(i,N);
	for(int i=N;i>0;i--) //i表示元素个数 
	{
		swap(a[0],a[i-1]); //此时a[0]一定是最小的元素 
		down_adjust(0,i-1);	//减小调整范围 
	}
	
} 
 
int main()
{
	while(scanf("%d",&N)!=EOF)
	{
		for(int i=0;i<N;i++)
		{
			scanf("%d",&a[i]);
		}
		heap_sort(N);
		for(int i=N-1;i>=0;i--)
		{
			if(i!=0) printf("%d ",a[i]);
			else printf("%d\n",a[i]);
		}
	}
	return 0;
}
