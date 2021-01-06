#include<stdio.h>
long long sum=0;
int hanoi(int n)
{
    if(n==1)
	{
        return 1;
    }
    else
	{
		return 2*hanoi(n-1)+1;
    }
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",hanoi(n));
}

