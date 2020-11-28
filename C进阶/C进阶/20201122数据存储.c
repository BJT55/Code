#include <stdio.h>
#include <stdbool.h>


/*
//32位小字节序处理器
void main()
{
	union
	{
		short k;
		char i[2];
	}*s,a;
	s = &a;
	s->i[0] = 0x39;
	s->i[1] = 0x38;
	printf("%x\n", a.k);
}

*/



/*
int main()
{
	float f = 10.125;     //(-1)^s*m*2^e  
	                      //  s=0  m=1.0125  e=3
	                     //  s:1位     e：8位    m：23位
}

*/



/*
int main()
{
	char a[1000];
	for (int i = 0; i < 1000; i++)
	{
		a[i] = -1 - i;     //-1,-2.....-128,127,126......1   一共255
	}
	printf("%d\n", strlen(a));
	return 0;
}
*/


/*
void main()
{
	unsigned int i;     //死循环
	for (i = 9; i >= 0; i--)
	{
		printf("%d\n", i);
	}
}
*/


/*
int main()
{
	char a = -128;      //  1000 0000 0000 0000 0000 0000 1000 0000
	printf("%u\n", a);  //  1111 1111 1111 1111 1111 1111 0111 1111
	system("pause");   //   1111 1111 1111 1111 1111 1111 1000 0000
}
*/

/*
void main()
{
	union
	{
		short k;
		char i[2];
	}*s,a;

	s = &a;
	s->i[0] = 0x39;
	s->i[1] = 0x38;
	printf("%x\n", a, k);
}


*/