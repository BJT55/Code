#include <stdio.h>
int Find_Max(int ar[], int n)
{
	int Max_Value = ar[0];
	for (int i = 1;i < n; i++)
	{
		if (Max_Value < i)
		{
			Max_Value = i;
		}
	}
	return Max_Value;
}
int Find(int ar[], int n, int(*pfun)(int ar[], int n))
{
	return pfun(ar, n);
}
void main()
{
	int ar[] = { 1, 3, 4, 2, 5, 6, 7, 8, 9, 5, 0 };
	int len = sizeof(ar) / sizeof(ar[0]);
	printf("%d \n", Find(ar, len, Find_Max));
}