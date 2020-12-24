#include <iostream>
#define PI 3.1415927
using namespace std;
class Circle
{
	protected:
		double radius;
	public:
		virtual double area()=0;
		virtual double volume()=0;
};
class Sphere:public Circle
{
	public:
		Sphere (double r)
		{
			radius = r;
		}
		virtual double area()
		{
			return 4*PI*radius*radius;
		}
		virtual double volume()
		{
			return 3.0/4*PI*radius*radius*radius;
		}
};
int main()
{
	double r = 4;
	Sphere sphere(r);
	cout<<sphere.area()<<endl;
	cout<<sphere.volume()<<endl;
}
