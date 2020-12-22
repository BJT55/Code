#include <iostream>
#include <string> 
using namespace std;
class Student{
	private:
		string num[20];
		string name[20];
	public:
		int id_grade;
		int tm_grade;
		void InputStu();
		void OutputStu();		
};
void Student::InputStu(){
	cout<<"请依次输入准考证，姓名，个人成绩："<<endl;
	for(int i=0;i<3;i++)
	{
		cout<<"第"<<i+1<<"位学生准考证号："<<endl;
		cin>>num[i];
		cout<<"第"<<i+1<<"位学生姓名："<<endl;
		cin>>name[i];
		cout<<"第"<<i+1<<"位学生个人成绩："<<endl; 
		cin>>id_grade;
	}
	cout<<"请输入团队成绩："<<endl; 
	cin>>tm_grade; 
	cout<<"\n"<<endl;
}
void Student::OutputStu(){
	for(int i=0;i<3;i++){
		cout<<i+1<<"."<<"准考证号："<<num[i]<<"  "<<"姓名："<<name[i]<<"  "<<"个人成绩："<<id_grade<<"  "<<endl; 
	}
	cout<<"团队成绩："<<tm_grade<<endl; 
}
int main(){
	Student stu;
	stu.InputStu();
	stu.OutputStu();
	return 0;
}
