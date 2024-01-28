#include <stdio.h>

//전역변수 선언부
char cmd[200005];
int R_pre_skill = 0, K_pre_skill = 0;

main()
{
	int len, result = 0;
	scanf("%d", &len);
	scanf("%s", cmd);

	for (int i = 0; i < len; i++)
	{
		if (cmd[i] >= '0' && cmd[i] <= '9')
			result++;
		if (cmd[i] == 'L')
			R_pre_skill++;
		if (cmd[i] == 'S')
			K_pre_skill++;
		if (cmd[i] == 'R')
		{
			if (R_pre_skill)
			{
				result++;
				R_pre_skill--;
			}
			else
				break;
		}
		if (cmd[i] == 'K')
		{
			if (K_pre_skill)
			{
				result++;
				K_pre_skill--;
			}
			else
				break;
		}
	}
	printf("%d", result);
	
	return 0;
}