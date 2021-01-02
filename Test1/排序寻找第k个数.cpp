#include<stdio.h>
#define SIZE 10000000
void quicksort(long long *s,long long left,long long right);
int main(){
	long long n,k;	
	scanf("%ld%ld",&n,&k);
	long long arr[n];
	for(int i=0;i<n;i++){
		scanf("%ld",&arr[i]);
	}
	quicksort(arr,0,n);
	printf("%ld",arr[k-1]);
}

void quicksort(long long *s,long long left,long long  right)   
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
		while(s[j]>=temp&&i<j)  
		{
			j--;
		}
		while(s[i]<=temp&&i<j)   
		{
			i++;
		}
		if(i<j)   
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


