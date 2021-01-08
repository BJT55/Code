#include<stdio.h>
#include<stdlib.h>
#define MAX 200000

void shellSort(int array[], int n);
void printArr(int* arr,int length);

int main()
{
	int i,a[MAX],n;
	scanf("%d\n",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	shellSort(a, n);
	printArr(a,n);
	return 0;
} 
void printArr(int* arr,int length)
{
    int i;
	for(i=0;i<length;i++)
	{
        printf("%d ",arr[i]);
    }
}
void shellSort(int array[], int n)
{
    //定义中间变量，做为临时交换变量
    int temp;
    //遍历数组（进行排序）
    //定义初始增量值
    int gap = n;
    do
	{        //初始增量变化规律
        gap = gap / 3 + 1;
        for (int i = gap; i < n; i++)
        {
            for (int j = i; j >= gap; j-=gap)
            {
               if (array[j] < array[j - gap])
               {
                   temp = array[j];
                   array[j] = array[j - gap];
                   array[j - gap] = temp;
               }
               else
               {
                   break;
               }
           }
       }
   } while (gap>1);
}
