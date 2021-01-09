#include<stdio.h>
#define MAX 500000
void printfAnswer(int a[],int lenth){
    for(int i=0;i<lenth;i++)
    printf("%d  ",a[i]);
} 
int max(int *s, int n) 
{
    int x=1; //保存最大的位数
    int y=10;
    for(int i=0;i<n;i++)
    {
        while(s[i]>=y)
        {
            y*=10;
            x++;
        }
    }
    return x;
}
 
void radixsort(int *s, int n) //基数排序
{
    int x=max(s,n);
    int temp[n];
    int count[10]; //计数器
    int i,j,k;
    int radix = 1;
    for(i =1;i<=x; i++) //进行x次排序
    {
        for(j=0;j<10;j++)
            count[j]=0; //每次分配前清空计数器
        for(j=0;j<n;j++)
        {
            k = (s[j]/radix)%10; //统计每个桶中的记录数
            count[k]++;
        }
        for(j=1;j<10;j++)
            count[j]=count[j-1]+count[j]; //将tmp中的位置依次分配给每个桶
        for(j=n-1;j>=0;j--) //将所有桶中记录依次收集到tmp中
        {
            k = (s[j]/radix)%10;
            temp[count[k]-1]=s[j];
            count[k]--;
        }
        for(j=0;j<n;j++) //将临时数组的内容复制到data中
            s[j]=temp[j];
        radix=radix*10;
    }
    printfAnswer(s,n);} 
 
int main()
{
    int N,a[MAX];
    scanf("%d",&N);
    for(int i=0;i<N;i++)
    {
        scanf("%d",&a[i]);
    }
    radixsort(a,N);
}

