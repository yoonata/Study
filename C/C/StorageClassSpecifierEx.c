#include <stdio.h>

void increaseNumber()
{
    int num1 = 0;    // ���� ���� �� �� �ʱ�ȭ

    printf("%d\n", num1);    // ���� num1�� ���� ���

    num1++;    // ������ ���� 1�� ����
}
void increaseNumber1()
{
    static int num1 = 0;     // ���� ���� ���� �� �� �ʱ�ȭ

    printf("%d\n", num1);    // ���� ���� num1�� ���� ���

    num1++;    // ���� ���� num1�� ���� 1 ������Ŵ
}

int main()
{
    increaseNumber();    // 0
    increaseNumber();    // 0
    increaseNumber();    // 0
    increaseNumber();    // 0: ������ �Ź� �����ǰ� ������Ƿ� 0�� ��µ�

    increaseNumber1();    // 0
    increaseNumber1();    // 1
    increaseNumber1();    // 2
    increaseNumber1();    // 3: ���� ������ ������� �ʰ� �����ǹǷ� ���� ��� ������

    return 0;
}