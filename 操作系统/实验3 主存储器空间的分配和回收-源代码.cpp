#include <iostream>
using namespace std;
#include <cstdio>
#include <cmath>
#define COUNT 512

void put();  //输入数据
void init();  //初始化
void insert(int n,float st,float si);   //插入 
void dele(int n);   //删除 
void move(int n);  //移动交换
void show();   //打印输出 
int apply();  //申请或释放请求 
void merge(int n,float st,float si);  //合并空闲区 

int count;     //被分成的块数统计
int applyfree;   //申请或释放请求 
float numb;    //进程大小 
char c;    //进程名 

int main()
{
    init();   //初始化 
    show();   //打印 
    while(1)
    {
        put();   //输入数据 
        apply();   //申请释放请求 
        show();   //打印数据 
    }
    return 0;
}

//定义结构体 
typedef struct DATA
{
    char name;         //名称
    float start;       //起始位置
    float size;        //大小
    int flag;          //判断是否分配（1为未分配，0为已分配） 
}DATA ;
DATA a[COUNT];    //数组

//输入数据
void put() 
{
    printf("请输入申请或者释放的进程名称及资源数量：\n");
    rewind(stdin);
    printf("请输入进程名："); 
    scanf("%c",&c);
    printf("请选择申请（输入1）/ 释放（输入0）："); 
    scanf("%d",&applyfree);
    printf("请输入进程大小：");
    scanf("%f",&numb);
    
}

//初始化
void init()
{
    count=1;
    a[0].name='?';      //未分配时进程名为？ 
    a[0].start=0;       //起始地址为0 
    a[0].size=COUNT;      
    a[0].flag=1;       // 初始化“1 ”表示未分配
} 

//插入
void insert(int n,float st,float si)    // 标识，起始地址，大小 
{
    int i;
    count++;     //新插入，块数+1 
    for(i=count;i>n+1;i--)
    {
        a[i]=a[i-1];
    }
    a[n].start=st;
    a[n].size=si;
}

//删除
void dele(int n)
{
    int i;
    for(i=n;i<count-1;i++)   //删除的块号小于总块数 
    {
        a[i]=a[i+1];
    }
    count--;
}

//移动交换 
void move(int n)
{
	int i;
	for(i=count;i>n+1;i--)
	{
		a[i]=a[i-1];
	}
}

//合并空闲区 
void merge(int n,float st,float si)
{
    if( a[n-1].flag )   //前一个未分配 
    {
        a[n-1].size=a[n-1].size+si;
        dele(n);    //删除a[n] 
    }
    if( a[n+1].flag )   //后一个未分配 
    {
        a[n].size=a[n].size+a[n+1].size;
        a[n].name='?';
        a[n].flag=1;
        dele(n+1);    //删除a[n+1] 
    }
    if( !a[n-1].flag && !a[n+1].flag )    //前后都已分配 
    {
        a[n].name='?';
        a[n].flag=1;
    }
}


//打印输出
void show()
{
    int i,j=0;
    printf("名称   标识   起址   长度   状态\n");
    for(i=0;i<count;i++)
    {
    	if(a[i].name==a[i+1].name)  
		    continue;    //重复数据舍去 
        if( a[i].flag && a[i].size!=0 )   //如果未分配 
            printf("?      ");
        else
            printf("%c      ",a[i].name);
        printf("%d%8.0f%8.0f    ",j,a[i].start ,a[i].size);        
        if( a[i].flag )
            printf("未分配\n");
        else
        {
            if( a[i].size!=0 )
            {
        	    printf("已分配\n");
		    } 
			else  printf("\n"); 
		}
		j++;
    }
}

//  申请或释放 
int apply()   
{
    int i=0;
    int aflag=0;
    int fflag=0;
    if(applyfree)           //申请资源（输入1） 
    {
        while( !aflag && i<count )
        {
            if( a[i].size>=numb && a[i].flag )   //遍历，找到符合作业需要量小于等于空闲区，表明可装入 
            {
                if( a[i].size==numb )
                {
                    a[i].name =c;
                    a[i].flag =0;
                }
                else
                {
                	count++;
                    move(i);
                    insert( i+1, a[i].start+numb, a[i].size-numb );
                    a[i+1].flag=1;     //未分配 
                    a[i+1].name='?';
                    a[i].name=c;
                    a[i].size=numb;
                    a[i].flag=0;      //已分配 
                }
                aflag=1;   //申请完毕，aflag=1结束遍历 
            }
            i++;
        }
        if(aflag)
        {
            printf("\n申请成功！\n");
            return 1;
        }
        else
        {
            printf("\n申请失败！没有足够大的空闲空间。\n");
            return 0;
        }
    }
    else     //释放资源（输入0） 
    {
        while( !fflag && i<count )
        {
            if( a[i].name==c )
            {
                if( a[i].size==numb )
                {
                merge( i, a[i].start, a[i].size );
                }
                else
                {
                    if( a[i].size>numb ) 
                    {
                    	count++;
                        move(i);
                        insert( i+1, a[i].start+numb, a[i].size -numb );
                        a[i+1].name=c;
                        a[i+1].flag=0;     //已分配 
                        a[i].size=numb;
                        a[i].name='?';
                        a[i].flag=1;      //未分配 
                        if( a[i-1].flag )   //被释放的区域的前一个为空闲区 
                        {
                            merge(i,a[i].start ,a[i].size );   //合并空闲区 
                        }
                    }
                    else
                    {
                        printf("\n释放失败，使用的数量小于要求释放的数量。\n");
                        return 0;
                    }
                }
                fflag=1;
            }
            i++;
        }
        if( fflag )
        {
            printf("\n释放成功！\n");
            return 1;
        }
        else
        {
            printf("\n释放失败！未找到匹配的进程名称。\n");
            return 0;
        }
    }
}


