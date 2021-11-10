#include <stdio.h>

void increaseNumber()
{
    int num1 = 0;    // 변수 선언 및 값 초기화

    printf("%d\n", num1);    // 변수 num1의 값을 출력

    num1++;    // 변수의 값을 1씩 증가
}
void increaseNumber1()
{
    static int num1 = 0;     // 정적 변수 선언 및 값 초기화

    printf("%d\n", num1);    // 정적 변수 num1의 값을 출력

    num1++;    // 정적 변수 num1의 값을 1 증가시킴
}

int main()
{
    increaseNumber();    // 0
    increaseNumber();    // 0
    increaseNumber();    // 0
    increaseNumber();    // 0: 변수가 매번 생성되고 사라지므로 0이 출력됨

    increaseNumber1();    // 0
    increaseNumber1();    // 1
    increaseNumber1();    // 2
    increaseNumber1();    // 3: 정적 변수가 사라지지 않고 유지되므로 값이 계속 증가함

    return 0;
}