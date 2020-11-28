#include <stdio.h>

//结构体内存对齐
//   #pragma pack(2)  按照2字节对齐   ---不一定按照指定字节
/*
typedef struct Text
{
	char a;   //1
	double b;   //8
	int c;    //4
}Text;
// 若将b，c的位置调换，则输出的值为16

void main()
{
	printf("%d\n",sizeof(Text));   //24
}
*/

//按照最大的补齐
/*
typedef struct Text
{
	short a;    // 2 + （补6）
	struct
	{
		int b;
		double c;    // struct为24
		char d;
	};
	int e;   // 4 +(补 4）
}Text;

void main()
{
	printf("%d\n", sizeof(Text));    //结果为40
}
*/


/*
typedef struct Text
{
	short a;    // 2 + （补6）
	struct
	{
		int b;    // 4 +(补4)
		double c[10];    // 80
		char d;    // 1 +(补7)
	};
	int e;   // 4 +(补 4）
}Text;

void main()   //  8+96+8=112
{
	printf("%d\n", sizeof(Text));    //结果为112
}

*/

/*
#pragma pack(2)
typedef struct Text
{
	short a;    // 2 
	struct
	{
		int b;   //  4
		double c;    // 8
		char d;   // 1+(补1)
	};
	int e;   // 4 
}Text;

void main()
{
	printf("%d\n", sizeof(Text));    //结果为20
}
*/

/*
typedef struct Text
{
	short a;    // 2 + （补6）
	struct t  //若有名字t，即为类型，不占内存，cpp格式下为8，c格式下新定义struct相当于不存在
	{
		double c;   // 8
		int b;   // 4 
		char d;  // 1 +( 3 )
	};
	int e;   // 4 +(补 4）
}Text;

void main()
{
	printf("%d\n", sizeof(Text));    //结果为32
}
*/

//华为面试题1：
/*
#pragma pack(4)
unsigned short *pCharArr[10][10];
typedef struct unRec
{
	unsigned long a;   // 4
	unsigned short b[7];   // 2 * 7
	unsigned char c;   // 1 + ( 1 )
}Rec_c;
Rec_c stMax, *pstMax;

void main()
{
	printf("%d\n", sizeof(pCharArr));    //  4 * 10 * 10
	printf("%d\n", sizeof(stMax));   //  20
	printf("%d\n", sizeof(pstMax));  //  4
	printf("%d\n", sizeof(*pstMax));   //20
}
*/

/*
//位域（节省空间）
typedef struct text
{
	char a : 1;   // 0 1 开关值   
	char n : 1;
	char c : 1;
}text;
void main()
{
	printf("%d\n", sizeof(text));
}
//开辟空间最小单位按照字节，“ ：1 ”代表占用1位（从bit位角度）
//1.位域不能跨字节存储
//2.位域不能跨类型存储
*/
/*
typedef struct text
{
	char a : 1;    // 位域不能跨类型存储
	int b : 1;
}text;
void main()
{
	printf("%d\n", sizeof(text));   //  8
}
*/

//位段

/*
struct S
{
	char a : 3;
	char b : 4;
	char c : 5;
	char d : 4;
};
void main()
{
	struct S s = { 0 };
	s.a = 10;
	s.b = 12;
	s.c = 3;
	s.d = 4;
}
*/

/*
//枚举
enum Color
{
	red,   //枚举用“ ， ”分隔
	green,
	blue
};
void main()
{				// 默认从零开始，依次加1,只能是整数
	printf("%d %d %d\n", red, green, blue);   //结果： 0 1 2  //若有赋值，则赋值后依次加1
	printf("size = %d \n", sizeof(enum Color));    //  4  (每次只能传送一个）
}                                            

*/


//联合（共用体）
/*
union Un
{
	char c;
	int i;
};
void main()
{
	union Un un;
	printf("%d\n", sizeof(un));   //  4 (最大成员的大小）
}

*/

//判断大小端
/*
union Un
{
	int a;
	char c;
};
void main()
{
	union Un un;
	un.a = 1;
	if (un.c == 1)
	{
		printf("little\n");
	}
	else printf("big\n");
}
*/

//联合体存在字节对齐
/*
union Un1  // 5+(3)
{
	char c[5];   // 5
	int i;   //4
};
union Un2    // 14 + (2)
{
	short c[7];  //  14
	int i;       //  4
};
*/



