//M个同学N门课成绩处理，对学生成绩进行输入，查找，排序，输出等功能 

#include <iostream>
#include <string.h>
using namespace std;

const int M=3;  //人数 
const int N=3;  //课数 
char name[M][20];
int score[M][N];

void menu()
{
	cout<<"*********学生信息管理系统*********"<<endl; 
	cout<<"      1.输入          2.查找      "<<endl; 
	cout<<"      3.排序          4.输出      "<<endl; 
	cout<<"      5.退出   "<<endl; 
	cout<<"**********************************"<<endl;
} 

class Student
{
public:
	void Input();      //输入
	void Output();     //输出
	void Search();     //搜索
	void Sort();		 //排序
public:
	char name[M][20];
	int score[M][N];
};
 
void Student::Input()
{
	for (int i = 0; i < M;	i++) {
		cout << "输入学生姓名" << endl;
		cin>>name[i];
		cout << "请分别输入" <<N<<"门课程的成绩" << endl;
		for (int j = 0; j < N; j++)
		{
			cin >> score[i][j];
		}
	}	
}
 
 
void Student::Search()     
{
	int flag=1;
	char Find_name[20] = {0};
	cout << "输入你要查询的学生姓名：" << endl;
	cin >> Find_name;
	for (int i = 0; i < M; i++)
	{ 
		if (strcmp(Find_name, name[i]) == 0)     
		{
			cout << "查询成功：" << endl;
			flag=0;
			cout << "姓名"<<"  "<<"高数" << "  " << "英语" << "  " << "计算机" << endl;
			for (int j = 0; j < N; j++)
			{
				if (j == 0)
				{
					cout << name[i] <<"    "<<score[i][j]<< "    ";
				}
				else {
					cout << score[i][j] << "    ";
				}
			}
			cout <<"\n"<< endl;
			break;
		}
	}
	if(flag)     cout << "查询失败........\n"<< endl;
}

void Student::Sort()
{
	int num,temp,choose;
	cout<<"请输入需要排序成绩的科目：1.高数    2.英语     3.计算机     "<<endl;
	cin>>num;
	choose=num-1;
	for(int i=0;i<N ;i++)
	{
		for(int j=i+1;j<N;j++)
		{
			if(score[i][choose]<score[j][choose])
			{
				temp=score[i][choose];
				score[i][choose]=score[j][choose];
				score[j][choose]=temp;
			}
		}
	}
	cout<<"成绩排序结果为:"<<endl;
	for(int j=0;j<M;j++)
	{
		cout<<name[j]<<"--"<<score[j][choose]<<"   ";
	} 
	cout<<"\n"<<endl;
}

void Student::Output()
{
	for (int i = 0; i < M;	i++)
	{
		cout << "姓名"<<"  "<<"高数"<<"  "<<"英语"<<"  "<<"计算机"<<"  "<< endl;
		cout<<name[i]<<"    ";
		for (int j = 0; j < N; j++)
		{
			cout<<score[i][j]<<"    ";
		}
		cout<<"\n"<<endl;
	}
}


int main()
{
	int choose=1;
	Student stu;
	while(choose)
	{	
		menu();
		cout<<endl;
		cout<<"请输入菜单选项："<<endl;
		cin>>choose;
		switch(choose)
		{
			case 1:
				stu.Input();
				break;
			case 2:
				stu.Search();
				break;
			case 3:
				stu.Sort();	
				break;
			case 4:
				stu.Output();
				break;	
			case 5:
				cout<<"退出成功..........\n"<<endl; 
				choose=0;
				break;
			default:
				cout<<"菜单选择有误，请重新选择.......\n"<<endl;		
		} 
	}
}
