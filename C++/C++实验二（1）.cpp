#include <iostream>
using namespace std;
class Circle{

	private:
		float r;
	public:
		Circle():PI(3.1415927){
			r=0;
	}
	void aisle(float r)
	{
		float aisle;
		cout.precision(2);
		aisle=( PI*(r+3)*(r+3)-PI*r*r )*20;
		cout<<"过道造价:"<<fixed<<aisle<<"元"<<endl;
	}
	void fence(float r)
	{
		float fence;
		cout.precision(2);
		fence=PI*2*(r+3)*35;
		cout<<"栅栏造价:"<<fixed<<fence<<"元"<<endl;
	}
	const double PI;
};
int main()
{
	float r;
	cout<<"输入半径r："<<endl;
	cin>>r;
	Circle circle;
	circle.aisle(r);
	circle.fence(r);
} 
