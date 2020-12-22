#include <iostream>
using namespace std;
void sort(int *a)
{
	int temp;
	for(int i=0;i<10;i++)
	{
		for(int j=i;j<10;j++)
		{
			if(a[j]>a[j+1]) 
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		} 
	}
}
int main()
{
	int a[]={1,3,7,76,32,10,45,12,66,23};
	sort(a);
	for(int i=0;i<10;i++)
	{
		cout<<" "<<a[i];
	}
}

