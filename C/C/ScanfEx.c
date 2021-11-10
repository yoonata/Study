#define _CRT_SECURE_NO_WARNINGS //이것을 선언해주지 않으면 c4996 에러 발생 보안을 위해 scanf_s를 사용 사용법은 scanf_s에서
#include <stdio.h>

int main(void) {

	int ret1, ret2, ret3, ret4, ret5;//리턴값은 몇개가 정상적으로 입력되었는지 갯수
	int num1, num2;
	float num3;
	double num4;
	char a;
	char s1[10];

	ret4 = scanf("%c", &a); //뒤로 가면 작동이 안됨 왜그런지는 잘 모르겠음.
	ret1 = scanf("%d", &num1);
	ret2 = scanf("%d", &num2);
	ret3 = scanf("%f %lf", &num3, &num4);//더블형을 받을 때는 %lf로 받아야 한다.
	scanf("%s", s1);//문자열 받기
	ret5 = scanf("%d %d %f %f", &num1, &num2, &num3, &num4);

	printf("%d %d %d %d \n", ret1, ret2, num1, num2);
	printf("%d %f %f\n", ret3, num3, num4);
	printf("%c\n", a);
	printf("%s\n", s1);
	printf("%d", ret5);

	return 0;
}