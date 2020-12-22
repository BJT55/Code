#include <iostream>
#include <cstring>
using namespace std; 

class MyString
{
	public:
		MyString(const char* p=""):_p(new char[strlen(p)]+1)
		{
			strcpy(_p,p);
		}
	MyString operator+(MyString& s)
	{
		int len1=strlen(_p);
		int len2=strlen(s._p);
		char* temp=new char[len1+len2+1];
		strcpy(temp,_p);
		strcpy(temp+len1,s._p);
		MyString ret (temp);
		delete[] temp;
		return ret;
	}
	friend ostream& operator<<(ostream&_cout,MyString& s);
	private:
		char*_p; 
};
ostream& operator<<(ostream&_cout,MyString& s)
{
	_cout << s._p;
	return _cout;
}
int main()
{
	MyString a("1234");
	MyString b("abcd");
	MyString c;
	c=a+b;
	cout<<c<<endl;
	return 0; 
}
