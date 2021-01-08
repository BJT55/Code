#include <stdio.h>
#define size 5
void mergesort(int *s,int left,int right);
void merge(int *s,int left,int mid,int right);
int main()
{
	int N=size;
	int a[N];
	printf("\n请输入需要排序的%d个数：\n",N); 
	for(int i=0;i<N;i++)
	{
	    scanf("%d",&a[i]);
	} 
	mergesort(a,0,N-1);
    int k; 
	for(k=0;k<size;k++)
	{
		printf("%d  ",a[k]);
	} 
}

void mergesort(int *s,int left,int right)
{
	if(left<right)
	{
		int mid=(left+right)/2;
		mergesort(s,left,mid);
		mergesort(s,mid+1,right);
		merge(s,left,mid,right,size);
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
