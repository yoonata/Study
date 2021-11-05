#include <stdio.h> 

int main(void){

	//이스케이프 시퀸드(escape sequence)
	printf("\'");//작은따옴표
	printf("\"");//큰따옴표
	printf("\?");//물음표
	printf("\\");//백슬래시
	printf("\a");//경고음 발생
	printf("\b");//백스페이스(backspace)
	printf("\n");//줄 바꿈(new line)
	printf("\r");//캐리지 리턴(carriage return)
	printf("\t");//수평 탭(tab)
	printf("\v");//수직 탭(tab)
	printf("\f");//폼 피드(form feed)
	//이스케이프 시퀸스 중에서 \f와 \v는 프린터로 출력할 때에만 의미를 가집니다.

	//서식 지정자
	printf("%c");//하나의 문자
	printf("%s");//문자열
	printf("%d");//부호 있는 10진 정수
	printf("%i");//부호 있는 10진 정수(%d와 동일)
	printf("%f");//고정 소수점으로 표현한 실수(소수점 이하 6자리 까지 표현)
	printf("%o");//부호 없는 8진 정수
	printf("%u");//부호 없는 10진 정수
	printf("%x");//부호 없는 16진 정수 (소문자 사용)
	printf("%X");//부호 없는 16진 정수 (대문자 사용)
	printf("%e");//부동 소수점으로 표현한 실수 (e-표기법)
	printf("%E");//부동 소수점으로 표현한 실수 (E-표기법)
	printf("%g");//값에 따라 %f나 %e를 사용함
	printf("%G");//값에 따라 %f나 %E를 사용함
	printf("%%");//퍼센트(%) 기호 출력
	
	//출력 필드의 폭 설정
	/*
	%☆★.○●
	☆-> +,-가 들어가며 +가 들어가면 오른쪽 정렬 -가 들어가면 왼쪽정렬
	★-> 숫자가 들어가며 필드의 폭을 정해주는 숫자
	○-> 소수점 몇자리 까지 나타내는지 정해주는 숫자
	●-> 서식 지정자 ex) d, f
	*/
	return 0;
}