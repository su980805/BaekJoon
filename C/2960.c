#include <stdio.h>
#include <stdbool.h>

//전역변수 선언부
bool prime[1005];

main()
{
	int num, target, cnt = 0;
	scanf("%d %d", &num, &target);

	for (int i = 2; i <= num; i++)
		prime[i] = true;

	for (int i = 2; i <= num; i++)
	{
		if (prime[i])
		{
			cnt++;
			if (cnt == target)
			{
				printf("%d", i);
				break;
			}
			for (int j = i * i; j <= num; j += i)
			{
				if (prime[j])
				{
					prime[j] = !prime[j];
					cnt++;
					if (cnt == target)
					{
						printf("%d", j);
						break;
					}
						
				}
			}
		}
	}
	return 0;
}