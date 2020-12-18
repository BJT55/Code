#include <stdio.h>
//跳台阶  
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法？ 
int jumpFloor(int number ) 
{
	int count=0;
    while(number>2){
    	count=jumpFloor(number-1)+jumpFloor(number-2);
    	return count;
	}
	if ( number == 1 || number == 2)
	{
		return number;
	}
}
int main()
{
	int num;
    scanf("%d",&num);
    printf("%d",jumpFloor(num));
}
