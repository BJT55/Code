#include <stdio.h>
const double PI = 3.141592654;
int pieRi[10001];
double precision = 1E-7;
 
int main()
{
	int nCase = 0;
	scanf("%d", &nCase);
	int nPizzaNum = 0;
	int nPersonNum = 0;
	
	while(nCase --)
	{
		scanf("%d%d", &nPizzaNum, &nPersonNum);
		int maxvalue = 0;		
		for(int i = 0; i < nPizzaNum; ++i)
		{
			scanf("%d", &pieRi[i]);
			pieRi[i] *= pieRi[i];
			maxvalue = maxvalue < pieRi[i] ? pieRi[i] : maxvalue;
		}
		double low = 0;
		double high = maxvalue;
		double mid = 0;
		while(high - low > precision)
		{
			int sum = 0;
			mid = low + (high - low) / 2;
			for(int i = 0; i < nPizzaNum; ++i)
			{
				if(pieRi[i] > mid)
				{
					sum += (int)(pieRi[i] / mid);
				}
			}
			if(sum >= nPersonNum + 1)
				low = mid;
			else
				high = mid;
		}
		printf("%.4lf\n", mid * PI);
	}
	return 0;
}

