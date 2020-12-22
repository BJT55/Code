#include <iostream>
#define PI 3.1416
using namespace std;

//求球体和圆柱体的体积及表面积
class Circle
{
	protected:
		double radius;
	public:
		virtual double area()=0;
		virtual double volume()=0;
};
//球体 
class Sphere:public Circle
{
	public:
		Sphere(double r=0){radius=r;}
		virtual double area()
		{
			return 4.0*PI*radius*radius;
		}
		virtual double volume()
		{
			return (4.0/3.0)*PI*radius*radius*radius; 
		}
};
//圆柱体 
class Column:public Circle
{
	private:
		double height;
	public:
		Column(double r=0,double h=0){radius=r;height=h;}
		virtual double area()
		{
			return 2*PI*radius*radius+2*PI*radius*height;
		}
		virtual double volume()
		{
			return PI*radius*radius*height; 
		}
};

int main()
{
	double rs,rc,h;
	cout<<"请输入球体的半径："<<endl;
	cin>>rs;
	cout<<"请输入圆柱体的半径："<<endl;
	cin>>rc;
	cout<<"请输入圆柱体的高："<<endl;
	cin>>h;
	if(rs<=0||rc<=0||h<=0)   cout<<"输入有误，请输入大于零的数...."<<endl;
	Sphere sphere(rs);
	Column column(rc,h);
	cout<<"\n球体："<<endl;
	cout<<"面积为："<<sphere.area()<<"   体积为："<<sphere.volume()<<endl;
	cout<<"\n圆柱体："<<endl;
	cout<<"面积为："<<column.area()<<"   体积为："<<column.volume()<<endl;
}
