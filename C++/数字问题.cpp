#include<stdio.h>
#define N 9
void fun(char op[], int sum, int prevadd, int a[], int i) 
{
	if (i == N)
	{
		if (sum == 100)
		{
			printf("%d", a[0]);
			for (int j = 1; j < N; j++)
			{
				if (op[j] != ' ')
					printf("%c", op[j]);
				printf("%d", a[j]);
			}
			printf("=100\n");
			printf("\n");
		}

		return;
	}
	op[i] = '+'; 
	sum += a[i];   
	fun(op, sum, a[i], a, i + 1);  
	sum -= a[i];   
	op[i] = '-';   
	sum -= a[i];  
	fun(op, sum, -a[i], a, i + 1);  
	sum += a[i]; 
	op[i] = ' ';    
	sum -= prevadd; 
	int tmp;   
	if (prevadd > 0)
		tmp = prevadd * 10 + a[i];  
	else
		tmp = prevadd * 10 - a[i];  
	sum += tmp;   
	fun(op, sum, tmp, a, i + 1);  
	sum -= tmp;  
	sum += prevadd;
}
int main() 
{
	int a[N];
	char op[N];  
	for (int i = 0; i < N; i++)   
		a[i] = i + 1;
	fun(op, a[0], a[0], a, 1); 
}
