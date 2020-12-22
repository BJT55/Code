#include <iostream>
using namespace std;
int main()
{
	for(int i=1;i<=100;i++)
	{
		int k=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				k++;
				break;
			}
		}
		if(k==0)
		{
			cout<<i<<' ';	
		}				
	}
	return 0;
} 
