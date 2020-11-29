#include <string.h>
#include <stdio.h>
#include <iostream>
using namespace std;

#define false 0   //没有足够资源分配给进程
#define true 1   //有足够资源分配给进程
#define A 10
#define B 50

void put();   //打印资源信息 
void bank();   //银行家算法
void distribute(int k);   //分配资源 
void restore(int k);   //恢复分配资源
int release(int k);   //释放资源
int safecheck() ;  //安全性检查

int i=0,j=0;
int f=0;  //是否执行完毕标志 
int m;  //总进程数
int n;   //资源种类
int resource[B];    //各种资源的数目总和
int maxrequest[A][B];   //各进程对各类资源最大资源需求量
int available[B];    //系统可用资源数
int allocation[A][B];   //各进程已分配各类资源的资源数目 
int need[A][B];    //各进程还需要各类资源的资源数目 
int request[B];   //请求资源数目

//打印资源信息
void put()    
{
    cout<<endl<<"-------------------------------------------"<<endl;
    cout<<"初始时各种资源的总数量:"<<endl;
	for (j=0;j<n;j++)
	    cout<<" 资源"<<j<<": "<<resource[j];
		cout<<endl;
		cout<<"-------------------------------------------"<<endl;
		cout<<"目前各种资源可利用的数量为:"<<endl;
    for (j=0;j<n;j++)
	    cout<<" 资源"<<j<<": "<<available[j];
        cout<<endl;
        cout<<"-------------------------------------------"<<endl;
        cout<<"各进程还需要的资源数量:"<<endl<<endl;
    for(i=0;i<n;i++)    
	    cout<<"        资源"<<i;cout<<endl;
    for (i=0;i<m;i++)
	{
	    cout<<"进程"<<i<<":   ";
        for (j=0;j<n;j++)
		    cout<<need[i][j]<<"         ";
        cout<<endl;
	}
	cout<<endl;
	cout<<"-------------------------------------------"<<endl;
    cout<<"各进程已经得到的资源量: "<<endl<<endl;
    for(i=0;i<n;i++)
	    cout<<"        资源"<<i;cout<<endl;
    for (i=0;i<m;i++)
	{
	    cout<<"进程"<<i<<":    ";
        for (j=0;j<n;j++)
		    cout<<allocation[i][j]<<"         ";
        cout<<endl;
	}
	cout<<endl;
}

//银行家算法
void bank()   
{
    int flag=1;
    while(flag==1)
    {
        i=-1;
        while(i<0||i>=m)
        {
            cout<<"-------------------------------------------"<<endl;
            cout<<endl<<" 输入需申请资源的进程号:";
            cin>>i;
            if(i<0||i>=m)      
			    cout<<" 输入的进程号不存在，重新输入"<<endl;
        }
        cout<<" 请输入进程"<<i<<"申请各类资源的数量:"<<endl;
        for (j=0;j<n;j++)
        {
		    cout<<" 资源"<<j<<": ";
			cin>>request[j];
            if(request[j]>need[i][j])    //请求的资源数大于进程需要i类资源的资源量j
            {
                cout<<endl<<" 进程"<<i<<"申请的资源数大于进程"<<i<<"还需要"<<j<<"类资源的数量!";
                cout<<" ！系统将处于不安全状态!"<<endl;
            flag=0;
            break;
            }
            else
            {
                if(request[j]>available[j])    //请求的资源数大于可用资源数
                    {
                        cout<<endl<<" 进程"<<i<<"申请的资源数大于系统可用"<<j<<"类资源的数量!";
                        cout<<" ！系统将处于不安全状态!"<<endl;flag='n';
						break;
                    }
            }
        }
        if(flag==1)
        {
            distribute(i);   //分配资源
			release(i);
            if( safecheck()==0 )    //系统不安全 
            {
                restore(i);   //恢复资源数
                put();   // 输出资源分配情况
            }
            else       //系统安全
                put(); // 输出资源分配情况
        }
        else      
            cout<<endl;
            cout<<" 是否继续银行家算法演示,按1继续,按0退出演示: ";
        cin>>flag;
    }
}

//分配资源 
void distribute(int k)    
{
    for (j=0;j<n;j++)
    {
        available[j]=available[j]-request[j];
        allocation[k][j]=allocation[k][j]+request[j];
        need[k][j]=need[k][j]-request[j];
    }
}

//恢复分配资源
void restore(int k)    
{
    for (j=0;j<n;j++)
    {
        available[j]=available[j]+request[j];
        allocation[k][j]=allocation[k][j]-request[j];
        need[k][j]=need[k][j]+request[j];
    }
}

//执行完毕后释放资源 
int release(int k)
{
	for(j=0;j<n;j++)
	{
		if(need[k][j]==0)
		{
			available[j]=available[j]+maxrequest[k][j];
		}
	} 
} 

//安全性检查 
int safecheck()   //不安全返回0，安全返回1 
{
    int work[B],finish[A];   //工作向量 
    for(j=0;j<n;j++) 
        work[j]=available[j];     //初始化 
    for(i=0;i<m;i++) 
        finish[i]=false;    //初始化 
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            if( finish[i]==false && need[i][j]<=work[j] )    
            {
                work[j]=work[j]+allocation[i][j];    
            }
        }
        finish[i]=true;    
    }
    for(i=0;i<m;i++)
    {
        if(finish[i]==false)
        {
            cout<<endl;cout<<" 系统不安全!   申请失败!  "<<endl;
            cout<<endl;
			return 0;
        }
        else
		{
		    cout<<endl;
            cout<<" 系统安全！   分配成功！"<<endl;
			cout<<endl;
			
			return 1;
        }
    }
}


int main() //主函数
{
    int p;
    cout<<endl;
    cout<<"\t****************************************************"<<endl;
    cout<<"\t                    银 行 家 算 法                   "<<endl;
    cout<<"\t****************************************************"<<endl;
    cout<<endl<<"请输入总进程数:";
    cin>>m;
    cout<<endl<<"-------------------------------------------"<<endl;
    cout<<"请输入总资源种类:";
    cin>>n;
    cout<<endl<<"-------------------------------------------"<<endl;
    cout<<"请输入各类资源总数:";
    for(i=0;i<n;i++)
        cin>>resource[i];
        cout<<endl<<"-------------------------------------------"<<endl;
        cout<<"输入各进程所需要的各类资源的最大数量:("<<m<<" * "<<n<<"矩阵)\n";
    for (i=0;i<m;i++)
    {
        for (j=0;j<n;j++)
        {
            do
            {
			    cin>>maxrequest[i][j];
                if (maxrequest[i][j]>resource[j])
				    cout<<endl<<"已分配资源超过了该资源总数,请重新输入"<<endl;
            }while (maxrequest[i][j]>resource[j]);
        }
    }
    cout<<endl<<"-------------------------------------------"<<endl;
    cout<<"输入各进程已分配各类资源的数量:("<<m<<" * "<<n<<"矩阵)\n";
    for (i=0;i<m;i++)
    {
        for (j=0;j<n;j++)
        {
            do
            {
			    cin>>allocation[i][j];
                if (allocation[i][j]>maxrequest[i][j])
				    cout<<endl<<"已分配资源超过了最大资源,请重新输入"<<endl;
            }while (allocation[i][j]>maxrequest[i][j]);
        }
    }
    for (j=0;j<n;j++)   //初始化资源数量
    {
        p=resource[j];
        for (i=0;i<m;i++)
        {
            p=p-allocation[i][j];  //减去已经被占据的资源
            available[j]=p;
            if(available[j]<0)
                available[j]=0;
        }
    }
    for (i=0;i<m;i++)
        for(j=0;j<n;j++)
            need[i][j]=maxrequest[i][j]-allocation[i][j];   //还需资源数为最大需求资源数减去已分配资源数 
    put();    //输出 
    bank();    //银行家算法 
}

