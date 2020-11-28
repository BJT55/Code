#include <stdio.h>




/*
int main()
{
	int a[2][5] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int *p1 = (int *)(&a + 1);    //指向a整个数组的后一位（空的）
	int *p2 = (int *)(*(a + 1));    //指向第二行a[1]的第一位（6）
	printf("%d,%d", *(p1 - 1), *(p2 - 1));    //p1-1指向数组最后一位，p2-1指向6的前一位，即a[0][4]
	system("pause");
}
*/

/*     指针每行4个元素，数组每行5个元素
void main()
{
	int a[5][5];
	int(*p)[4];
	p = a;
	printf("%p,%d\n", &p[4][2] - &a[4][2], &p[4][2] - &a[4][2]);
	system("pause");
}
*/

/*
int a[]={1,2,3,4};

sizeof(a)     16;
sizeof(a+0)    4;   //地址，指针
sizeof(*a)     4;
sizeof(a+1)    4;
sizeof(a[1])   4;
sizeof(*&a)   16;  
sizeof(&a+1)   4;
sizeof(&a[0])  4;

*/

/*
//void a;   不允许使用不完整的类型   
// void *z;   泛型指针
*/

/*
int Find_Max(int ar[], int n)
{
	int Max_Value = ar[0];
	for (int i = 1; i < n; i++)
	{
		if (Max_Value <ar[i])
		{
			Max_Value = ar[i];
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
	int ar[] = {1,34,54,12,77,67,45,89,23};
	int len = sizeof(ar) / sizeof(ar[0]);
	printf("%d \n", Find(ar,len,Find_Max));
}
*/