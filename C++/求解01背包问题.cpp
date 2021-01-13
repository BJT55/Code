#include<stdio.h>
#define MAXN 50
int n,W;
int w[MAXN], v[MAXN], x[MAXN];
int maxv;
void dfs(int i,int tw,int tv,int op[])
{
	if(i>n)
	{
		if(tw==W&&tv>maxv)
		{
			maxv=tv;
			for(int j=i;j<=n;j++)
			{
				x[j]=op[j];
			}
		}
	}
	else
	{
		op[i]=1;
		dfs(i+1,tw+w[i],tv+v[i],op);
		op[i]=0;
		dfs(i+1,tw,tv,op);
	}
}
int main()
{
	scanf("%d",&n);
    scanf("%d",&W);
    int i; 
    for(i=1;i<=n;i++)
    {
	    scanf("%d",&w[i]);
	    scanf("%d",&v[i]);
    }
	int op[MAXN];
	dfs(1,0,0,op);
	printf("%d",maxv);
}
