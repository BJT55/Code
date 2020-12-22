#include <iostream>
#include <string>
using namespace std;
 
class Building
{
	protected:
		string address;
		int number;	
	public:
		Building(string add,int n)
		{
			address=add;
			number=n;
		}
};

class House:public Building
{
	public:
		House(string add,int n,int hnum,float are):Building(add,n),house_number(hnum),house_are(are)
		{
			house_number=hnum;
			house_are=are;
		}
		void init_House()
		{
			cout<<"住宅地址:"<<address<<endl;
			cout<<"住宅楼号:"<<number<<endl;
			cout<<"住宅房号:"<<house_number<<endl;
			cout<<"住宅面积(平方米):"<<house_are<<endl;			
		}
	private:
		int house_number;
		float house_are;
};

class Office:public Building
{
	public:
		Office(string add,int n,string oname,string phone):Building(add,n),office_name(oname),office_phone(phone)
		{
			office_name=oname;
			office_phone=phone;
		}
		void init_Office()
		{
			cout<<"办公室地址:"<<address<<endl;
			cout<<"办公室楼号:"<<number<<endl;
			cout<<"办公室名称:"<<office_name<<endl;
			cout<<"办公室电话号码:"<<office_phone<<endl;	
		}
	private:
		string office_name;
		string office_phone;
};

int main()
{
	House house("幸福路1944号",21,3,170.3);
	house.init_House();
	Office office("中兴路1466号",22,"研发部","6500927");
	office.init_Office();
}
