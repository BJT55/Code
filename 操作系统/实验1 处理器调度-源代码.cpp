#include<stdio.h> 
#include<stdlib.h>  
#include<time.h> 

int num = 5;     //假定进程数为5
int count;    //运行次数 
struct PCB*line(struct PCB *q);    //建立链表 
struct PCB*input(struct PCB *p,int i);    //进程数据输入 
void sort(PCB *head);   //冒泡排序 
void run(struct PCB *p);    //运行
void show(struct PCB *head);    //打印进程信息
void check(struct PCB *p);     //判断运行时间是否为0

//进程控制块结构体
struct PCB 
{       
    char name[5];  //进程名      
    int time;  //运行时间       
	int prior;  //优先数       
	char status;  //进程状态：R为就绪,E为结束       
	struct PCB *pre;  //前一进程的指针        
	struct PCB *next;  //后一进程的指针
};
struct PCB*head;    //头指针
struct PCB*tail;    //尾指针

//输入进程数据			
struct PCB*input(struct PCB *p, int i)    
{              
    p->name[0]='P';        //初始化进程名 
	p->name[1]='C';        
	p->name[2]='B';        
	p->name[3]=i+49;                
	printf("进程 %s\n",p->name);        
	printf("进程的运行时间：");        
	scanf("%d",&p->time);     
	printf("进程的优先数：");        
	scanf("%d",&p->prior);  
	printf("\n"); 	  
	p->status='R';      	//进程初始状态为就绪              
	p->next=NULL;        //初始指向后一进程的指针为空       
	return p;     //返回进程 
}           

//建立进程链表 
struct PCB*line(struct PCB *q)
{       
    int i;        
    struct PCB*p=NULL;  //p为待运行队列PCB指针        
	head=tail=NULL;     //初始化头尾指针       
	for( i=0; i<num; i++ )
	{               
		p=(struct PCB*)malloc(sizeof(struct PCB));  //分配空间，让p指向这个PCB               
		input(p,i);         //输入进程信息               
		p->next=NULL;               
		if( head==NULL )    //头指针为空 
		{                      
			tail=head=p;                      
			p->pre=NULL;               
		}
		else
		{                      
			p->pre=tail;                      
			tail->next=p;                      
			tail=p;               
		}        
	}        
	return p; 
}


//冒泡排序 
void sort(struct PCB *phead)
{     
    struct PCB *a,*b;  //定义进程a,b        
	int i;        
	for( i=0; i<num; i++ )
	{               
	    a=head;     //初始化进程a为head               
		b=head->next;     //初始化进程b为head->next               
		while( b!=NULL )    //b非空 
		{                       
		    if( a->prior < b->prior )     //a的优先级小于b的优先数  
			{   
			    if( a->pre!= NULL)       //p指向前一进程的指针不为空 
		        {               
		            a->pre->next=b;  //将p的前一进程的后指针指向max           
		        }
		        else   //p的前一进程指针为空,即为头指针 
		        {                 
		            head=b;    //将头指针指向max          
		        }           
		        if( b->next!=NULL )   //max的下一进程指针不为空 
		        {                
		            b->next->pre=a;  //将max的下一进程的前指针指向p           
		        }
				b->pre = a->pre;    
		        a->next = b->next;       
		        b->next = a;       
		        a->pre = b;    
				a=a->pre;                              
				b=b->next;                                                                             
			} 
			a=a->next;                 
			b=b->next;                               
		} 
	} 
}



//打印进程信息 
void show(struct PCB *head)
{    
    printf("进程信息表：\n");    
    struct PCB *p;        
	for(p = head; p!=NULL; p =p->next)
	{               
	    printf("进程 %s\t 优先数 %d\t 运行时间 %d\t 状态 %c\n",p->name,p->prior,p->time,p->status);        
	} 
}

//运行 
void run(struct PCB *p)   
{             
    count++;  //运行次数+1    
	p->time--;  //运行时间减1 
	if(p->prior>0)            	
	p->prior--;   //优先数减1 
	printf("\n第 %d 次运行:\n",count);      
	printf("运行后结果: %s\t 优先数 %d\t 运行时间:%d\n\n", p->name, p->prior, p->time);        
}

//判断运行时间是否为0 
void check(struct PCB *p)
{        
    if(p->time <= 0)   //当运行时间为0，结束进程 
	{                       
	    p->status = 'E';  //修改进程状态                      
		printf("进程 %s 已结束\n\n",p->name);                                                               
		show(head);       //显示进程信息 
		printf("**********************************************************");                                                             
		printf("\n\n请按回车键进行下一进程\n\n");                                   
		getchar();     //接收回车键 
		head = p->next;                      
		free(p);    //释放p                     		            
	} 
}

int main()
{        
    struct PCB *p = NULL;  //p为待运行队列PCB指针              
	line(p);     	//建立进程链表               
	sort(head);          //按照优先数递减进行排序        
	show(head);  //显示进程信息 
	printf("**********************************************************");	       
	printf("\n");                  
	while(head != NULL)   //若链表中还有PCB是执行循环语句
	{               
	    p = head;  //p指向第一个进程  		              
		run(p);   //进行调度 
		check(p); 
		sort(head);
		show(head);
		printf("**********************************************************");	            	       
	} 
}
