#define _CRT_SECURE_NO_WARNINGS //�̰��� ���������� ������ c4996 ���� �߻� ������ ���� scanf_s�� ��� ������ scanf_s����
#include <stdio.h>

int main(void) {

	int ret1, ret2, ret3, ret4, ret5;//���ϰ��� ��� ���������� �ԷµǾ����� ����
	int num1, num2;
	float num3;
	double num4;
	char a;
	char s1[10];

	ret4 = scanf("%c", &a); //�ڷ� ���� �۵��� �ȵ� �ֱ׷����� �� �𸣰���.
	ret1 = scanf("%d", &num1);
	ret2 = scanf("%d", &num2);
	ret3 = scanf("%f %lf", &num3, &num4);//�������� ���� ���� %lf�� �޾ƾ� �Ѵ�.
	scanf("%s", s1);//���ڿ� �ޱ�
	ret5 = scanf("%d %d %f %f", &num1, &num2, &num3, &num4);

	printf("%d %d %d %d \n", ret1, ret2, num1, num2);
	printf("%d %f %f\n", ret3, num3, num4);
	printf("%c\n", a);
	printf("%s\n", s1);
	printf("%d", ret5);

	return 0;
}