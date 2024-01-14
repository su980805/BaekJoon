#include <stdio.h>

//프로토타입 선언부
void heap_sort(int arr[], int size);

//전역변수 선언부
int num[1000000];

main()
{
	int size;
	scanf("%d", &size);

	for (int i = 0; i < size; i++)
		scanf("%d", &num[i]);
	
	heap_sort(num, size);

	for (int i = 0; i < size; i++)
		printf("%d\n", num[i]);

	return 0;
}

void heap_sort(int arr[], int size)
{
	for (int i = 1; i < size; i++)
	{
		int child = i;
		do
		{
			int root = (child - 1) / 2;
			if (arr[root] < arr[child])
			{
				int temp = arr[root];
				arr[root] = arr[child];
				arr[child] = temp;
			}
			child = root;
		} while (child != 0);
	}

	for (int i = size - 1; i >= 0; i--)
	{
		int temp = arr[0];
		arr[0] = arr[i];
		arr[i] = temp;
		int root = 0;
		int child = 1;
		do
		{
			child = 2 * root + 1;

			if (child < i - 1 && arr[child] < arr[child + 1])
				child++;
			if (child < i && arr[root] < arr[child])
			{
				temp = arr[root];
				arr[root] = arr[child];
				arr[child] = temp;
			}
			root = child;
		} while (child < i);
	}
}