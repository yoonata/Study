기타 연산자
삼항 연산자(ternary operator)
삼항 연산자는 자바에서 유일하게 피연산자를 세 개나 가지는 조건 연산자입니다.

 

삼항 연산자의 문법은 다음과 같습니다.

문법
조건식 ? 반환값1 : 반환값2

 

물음표(?) 앞의 조건식에 따라 결괏값이 참(true)이면 반환값1을 반환하고, 결괏값이 거짓(false)이면 반환값2를 반환합니다.

 

예제
int num1 = 5, num2 = 7;

int result;

 

result = (num1 - num2 > 0) ? num1 : num2;

System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");

코딩연습 ▶

실행 결과
두 정수 중 더 큰 수는 7입니다.

instanceof 연산자
instanceof 연산자는 참조 변수가 참조하고 있는 인스턴스의 실제 타입을 반환해 줍니다.

즉, 해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지를 판별해 주는 역할을 합니다.

 

instanceof 연산자의 문법은 다음과 같습니다.

문법
인스턴스이름 instanceof 클래스또는인터페이스이름

 

instanceof 연산자는 왼쪽 피연산자인 인스턴스가 오른쪽 피연산자인 클래스나 인터페이스로부터 생성되었으면 true를 반환하고, 그렇지 않으면 false를 반환합니다.

 

예제
class A {}

class B extends A {}

public static void main(String[] args) {

    A a = new A();

    B b = new B();

    System.out.println(a instanceof A); // true

    System.out.println(b instanceof A); // true

    System.out.println(a instanceof B); // false

    System.out.println(b instanceof B); // true

}

 

위의 예제를 이해하기 위해서는 클래스와 상속에 관한 기본적인 이해가 필요합니다.

따라서 현재 자세한 내용을 이해할 수 없다면, 나중에 필요할 때 다시 찾아보는 것도 좋은 방법입니다.

 

클래스에 대한 더 자세한 사항은 자바 클래스 수업에서 확인할 수 있습니다.

자바 클래스 수업 확인 =>

 

상속에 대한 더 자세한 사항은 자바 상속 수업에서 확인할 수 있습니다.

자바 상속 수업 확인 =>