#include <stdio.h>
#include <assert.h>



/*
int main()
{
	int a = 20;
	int b = -10;
}
*/

//基本数据类型有一个对齐值
//自定义类型有一个对齐值
//程序指定对齐值
//程序有效对齐值    #pragma pack（2） 按2字节对齐 


/*
void main(int argc,char *argv[])  //argc:argument count   argv:argument value
{}
*/

//    atoi()  将字符串型转换为整数型

//   strtok

/*
//   strstr
char *my_strstr(const char *str1, const char *str2)
{
	assert(str1 != NULL);
	assert(str2 != NULL);
	if (*str2 == '\0')
	{
		return (char*)str1;
	}
	while (*str1 != '\0')
	{
		const char*p1 = str1;
		const char*p2 = str2;
		while (*p2 != '\0')
		{
			if (*p1 != *p2)
			{
				break;
			}
			else
			{
				*p1++;
				*p2++;
			}
		}
		if (*p2 == '\0')
		{
			return (char*)str1;
		}
		str1++;
	}
}
int main()
{
	char *str1 = "pineapple";
	char *str2 = "apple";
	printf("%s\n", my_strstr(str1, str2));
	return 0;
}
*/


//内存操作函数
/*
	memset();	内存设置——初始化函数
	memcpy();	拷贝  （考虑内存覆盖问题，内存重叠问题）
	memcmp();	比较大小
	memmove();	  内存移动
*/

//memcpy
/*
void *my_memcpy(void *dst, const void *src, size_t count)
{
	assert(dst);
	assert(src);
	char* pdst = (char*)dst;
	const char*psrc = (const char*)src;
	while (count--)
	{
		*pdst++ = *psrc++;
	}
	return dst;
}
int main()
{
	char a1[10] = "abcdefghi";
	char a2[10] = "abcdefghi";
	char a3[10] = { 0 };
	my_memcpy(a1 + 2, a1, 6);
	my_memcpy(a3, a1, 6);
	printf("内存覆盖：%s\n", a1 + 2);
	printf("正常：%s\n", a3);
	return 0;
}
*/



/*
//memmove
void *my_memmove(void *dst, const void *src, size_t count)
{
	void *ret = dst;
	void *psrc =(void*) src;
	void *pdst =(void*)dst;
	if (pdst <= psrc || (char *)psrc + count)
	{
		while (count--)
		{
			*(char*)pdst = *(char*)psrc;
			pdst = (char*)pdst + 1;
			psrc = (char*)psrc + 1;
		}
	}
	else
	{
		pdst = (char*)pdst + count - 1;
		psrc = (char*)psrc + count - 1;
		while (count--)
		{
			*(char*)pdst = *(char*)psrc;
			pdst = (char*)pdst - 1;
			psrc = (char*)psrc - 1;
		}
	}
	return ret;
}
int main()
{
	char a1[10] = "abcdefg";
	char a2[10] = "abcdefg";
	char a3[10] = { 0 };
	my_memmove(a1 + 2, a1, 3);
	my_memmove(a3, a1, 3);
	printf("内存覆盖：%s\n", a1 + 2);
	printf("正常：%s\n", a3);
	return 0;
}
*/

//模式匹配
// char *strstr(const char* str1, const char* str2);


//返回错误码,所对应的错误信息
//包含头文件  #include <error.h>
//char *strerror(int errnum);



/*
//比较ascii大小
int my_strcmp(char *str1, const char *str2)
{
	assert(str1 != NULL && str2!= NULL);
	char *p1= str1;
	char *p2 = str2;
	int ret = 0;
	while (*p1!='\0' || *p2!='\0')
	{
		if (*p1 - *p2 != 0)
			break;
		*p1++;
		*p2++;
	}
	ret = *p1 - *p2;
	return ret;
}


int main()
{
	char *a = "hi ";
	char *b = "world";
	int temp=my_strcmp(a, b);
	if (temp == 0)
		printf("a == b\n");
	else if (temp > 0)
		printf(" a > b \n");
	else if (temp < 0)
		printf(" a < b \n");

}
*/

/*
char *my_strcat(char *strDes, const char *strSou)
{
	assert(strDes != NULL && strSou != NULL);
	char *pD = strDes;
	char *pS = strSou;
	while (*pD != '\0')   //找到末尾
	{
		*pD++;
	}
	while (*pS != '\0')    //拷贝
	{
		*pD++ = *pS++;
	}
	*pD = '\0';     //添加末尾\0
	return strDes;
}

int main()
{
	char a[20] = "hello ";
	char *b= "world";
	my_strcat(a, b);
	printf("%s\n", a);
}
*/


/*

char *my_strcpy(char *strDestination, const char *strSource)
{
	assert(strDestination != NULL && strSource != NULL);   //检查参数
	char *pD = strDestination;    //保护参数
	char *pS = strSource;
	while ( *pS!='\0')
	{
		*pD++= *pS++;
	}
	*pD = '\0';
	return strDestination;
}
int main()
{
	char a[] = "abcd";
	char *b = "123";
	my_strcpy(a, b);
	printf("%s\n",a );
	system("pause");

}
*/

//不用第三方变量
/*
size_t my_strlen(const char *string)
{
	if (*string == '\0')
		return 0;
	else
		return my_strlen(string+1) + 1;
}
int main()
{
	char *string= "abcdef";
	printf("%d\n", my_strlen(string));
	system("pause");
}
*/

/*
	传指针时，先判断是否为NULL，再对指针进行参数保护
	assert（string !=NULL)
	const char *p_str=string;
*/


//    \0 == 0    \0 != '0'   
//    "\"转义  ——>   int 5 = char '\5'   

/*
int main()
{
	char str[] = "  ";
	printf("%d\n", strlen(str));   //字符串末尾有\0
	system("pause");
}
*/