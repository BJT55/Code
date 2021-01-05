#include <stdio.h>
#define SIZE 1000000
long long fi(int n)
{
	if(n==1)  return 1;
	else{
		if(n==2)  return 2;
		else{
			if(n==3)  return 3;
			else return fi(n-1)+fi(n-2)+fi(n-3);
		}		
	}
}
int main(){
	int n;
	scanf("%d",&n);
	printf("%ld",fi(n));
} 
