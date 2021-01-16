#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
#define STU_NUM		40	  			/* 最多的学生人数 */
#include<windows.h>

struct student
{
	long	number;		//学生学号			
	char	name[10];          //学生姓名    	
	long    phone;	    // 学生电话号码 
	char    point[20];		           //学生特点      	
    char    role[15];  //学生职务 
	char    gender[5];   //学生性别 
	int     age;               //学生年龄 
};

typedef struct student STU;   //定义结构体类型 

void Appendrole(STU *head, int n)          //添加新成员 
{
	int		j;
	STU		*p;
	for (p=head; p<head+n; p++)
	{
		printf("\n输入学号:");
		scanf("%d", &p->number);
		printf("输入姓名:");
		scanf("%s", p->name);		
		printf("输入手机号:");
		scanf("%d", &p->phone);	
		printf("输入特长:");
		scanf("%s", p->point);	
		printf("输入职务:");
		scanf("%s", p->role);	
		printf("输入性别:");
		scanf("%s", p->gender);	
		printf("输入年龄:");
		scanf("%d", &p->age);	
	}
}


void Printrole(STU *head, int n)//打印n个社团成员的信息 
{
	STU  *p;
	int  i;
	char str[100] = {'\0'};
	strcat(str, "学号    姓名  ");
	strcat(str,"     手机号      特长       职务     性别     年龄");
	printf("%s", str);           		/* 打印表头 */	
	for (p=head; p<head+n; p++)  	/* 打印n个学生的信息 */
	{
		printf("\n%3d %8s %11d %10s %10s %6s %7d\n", p->number, p->name,p->phone,p->point,p->role,p->gender,p->age);		
	
	}
}

int Searchrole(STU *head,char a[],int n)   //查找学生的职务 
{

	int i;
	for (i=0; i<n; i++)
	{
		if (strcmp((head+i)->role,a)==0)	
		return i;
	}
	return -1;
}

void Searchperson(STU *head, int n)
{
	char zhiwu[15];
	 int findNo;
	printf("\n请输入要查找的职务:"); 	
	scanf("%s", zhiwu);
	findNo = Searchrole(head,zhiwu,n);
	if (findNo == -1)
	{
		printf("\n没有找到!\n");
	}
	else
	{
		Printrole(head+findNo, 1);
	}
}

char Menu(void)   //显示菜单并且可以让用户输入选项 
{ 
	char ch;
	printf("\n社团管理\n");
	printf(" 1.新成员添加\n");
	printf(" 2.按职位查找\n");
	printf(" 3.成员显示\n");	
	printf(" 0.退出系统\n");
	printf("请输入您的选择:");
	scanf(" %c", &ch); /*在%c前面加一个空格，将存于缓冲区中的回车符读入*/
	return ch;
}
int main()                           				
{
	char	ch;
	int	    n;
	STU 	stu[STU_NUM]; 
	printf("请输入学生数n(n<40):");
	scanf("%d", &n);
	while (1)
	{
		ch = Menu();					    /* 显示菜单，并读取用户输入 */
		switch (ch)
		{
			case'1':Appendrole(stu, n);/* 调用新成员添加模块 */
						break;
			case'2':Searchperson(stu, n );/* 调用按职位查找模块 */
						break;
			case'3':Printrole(stu, n);	/* 成员显示模块 */
						break;			
			case'0':exit(0);                  /* 退出程序 */
						printf("程序结束!");
			       	break;
			default:printf("输入错误!");
						break;
		}		
	}
}

