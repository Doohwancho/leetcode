#include <stdio.h>

int main()
{
    int a,b;
    while(scanf("%d %d", &a, &b) == 2 && a+b != 0)
    {
        printf("%d\n", a+b);
    }
    return 0;
}
