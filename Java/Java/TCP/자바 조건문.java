조건문
제어문(control flow statements)
자바 프로그램이 원하는 결과를 얻기 위해서는 프로그램의 순차적인 흐름을 제어해야만 할 경우가 생깁니다.

이때 사용하는 명령문을 제어문이라고 하며, 이러한 제어문에는 조건문, 반복문 등이 있습니다.

 

이러한 제어문에 속하는 명령문들은 중괄호({})로 둘러싸여 있으며, 이러한 중괄호 영역을 블록(block)이라고 합니다.

조건문(conditional statements)
조건문은 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문입니다.

조건문 중에서도 가장 기본이 되는 명령문은 바로 if 문입니다.

 

자바에서 사용하는 대표적인 조건문의 형태는 다음과 같습니다.

 

1. if 문
2. if / else 문
3. if / else if / else 문
4. switch 문

if 문
if 문은 조건식의 결과가 참(true)이면 주어진 명령문을 실행하며, 거짓(false)이면 아무것도 실행하지 않습니다.

 

if 문을 순서도로 표현하면 다음 그림과 같습니다.

 

if 문

 

자바에서 if 문의 문법은 다음과 같습니다.

문법
if (조건식) {

    조건식의 결과가 참일 때 실행하고자 하는 명령문;

}

 

위의 코드에서 블록에 속한 명령문은 중괄호({})를 기준으로 오른쪽으로 들여쓰기가 되어 있는 것을 볼 수 있습니다.

이처럼 들여쓰기를 통해 코드의 가독성을 높이는 것을 인덴트(indent)라고 하며, 될 수 있으면 모든 코드를 인덴트하는 것이 좋습니다.

 

다음 예제는 if 문을 사용하여, 해당 문자가 영문 소문자인지를 확인하는 예제입니다.

예제
if (ch >= 'a' && ch <= 'z') {

    System.out.println("해당 문자는 영문 소문자입니다.");

}

코딩연습 ▶

실행 결과
해당 문자는 영문 소문자입니다.

 

if 문에서 실행될 명령문이 한 줄 뿐이라면 중괄호({})를 생략할 수 있습니다.
if / else 문
if 문과 함께 사용하는 else 문은 if 문과는 반대로 주어진 조건식의 결과가 거짓(false)이면 주어진 명령문을 실행합니다.

 

if / else 문을 순서도로 표현하면 다음 그림과 같습니다.

 

else 문

 

자바에서 if / else 문의 문법은 다음과 같습니다.

문법
if (조건식) {

    조건식의 결과가 참일 때 실행하고자 하는 명령문;

} else {

    조건식의 결과가 거짓일 때 실행하고자 하는 명령문;

}

 

다음 예제는 if / else 문을 사용하여, 해당 문자가 영문 소문자인지 아닌지를 확인하는 예제입니다.

예제
if (ch >= 'a' && ch <= 'z') {

    System.out.println("해당 문자는 영문 소문자입니다.");

} else {

    System.out.println("해당 문자는 영문 소문자가 아닙니다.");

}

코딩연습 ▶

실행 결과
해당 문자는 영문 소문자가 아닙니다.

 

if / else 문에서도 실행될 명령문이 한 줄뿐이라면 중괄호({})를 생략할 수 있습니다.
if / else if / else 문
if / else if / else 문은 마치 새로운 구문처럼 보이지만, 사실은 두 개의 if / else 문이 연달아 나온 것뿐입니다.

이러한 if / else if / else 문은 조건식을 여러 개 명시할 수 있으므로 중첩된 if 문을 좀 더 간결하게 표현할 수 있습니다.

 

if / else if / else 문을 순서도로 표현하면 다음 그림과 같습니다.

 

else if 문

 

자바에서 if / else if / else 문의 문법은 다음과 같습니다.

문법
if (조건식1) {

    조건식1의 결과가 참일 때 실행하고자 하는 명령문;

} else if (조건식2) {

    조건식2의 결과가 참일 때 실행하고자 하는 명령문;

} else {

    조건식1의 결과도 거짓이고, 조건식2의 결과도 거짓일 때 실행하고자 하는 명령문;

}

 

이때 else if 문은 여러 번 나와도 상관없지만, if 문과 else 문은 단 한 번만 나올 수 있습니다.

 

다음 예제는 if / else if / else 문을 사용하여, 해당 문자가 영문 소문자나 영문 대문자인지, 아니면 영문자가 아닌지를 확인하는 예제입니다.

예제
if (ch >= 'a' && ch <= 'z') {

    System.out.println("해당 문자는 영문 소문자입니다.");

} else if (ch >= 'A' && ch <= 'Z') {

    System.out.println("해당 문자는 영문 대문자입니다.");

} else {

    System.out.println("해당 문자는 영문자가 아닙니다.");

}

코딩연습 ▶

실행 결과
해당 문자는 영문 대문자입니다.

 

if / else if / else 문에서도 실행될 명령문이 한 줄뿐이라면 중괄호({})를 생략할 수 있습니다.
삼항 연산자에 의한 조건문
자바에서는 간단한 if / else 문은 삼항 연산자를 이용하여 간결하게 표현할 수 있습니다.

문법
조건식 ? 반환값1 : 반환값2

 

삼항 연산자에 대한 더 자세한 사항은 자바 기타 연산자 수업에서 확인할 수 있습니다.

 

자바 기타 연산자 수업 확인 =>

switch 문
switch 문은 if / else 문과 마찬가지로 주어진 조건 값의 결과에 따라 프로그램이 다른 명령을 수행하도록 하는 조건문입니다.

이러한 switch 문은 if / else 문보다 가독성이 더 좋으며, 컴파일러가 최적화를 쉽게 할 수 있어 속도 또한 빠른 편입니다.

 

하지만 switch 문의 조건 값으로는 int형으로 승격할 수 있는(integer promotion) 값만이 사용될 수 있습니다.

 

즉, 자바에서는 swich 문의 조건 값으로 byte형, short형, char형, int형의 변수나 리터럴을 사용할 수 있습니다.

또한, 이러한 기본 타입에 해당하는 데이터를 객체로 포장해 주는 래퍼 클래스(Wrapper class) 중에서 위에 해당하는 Byte, Short, Character, Integer 클래스의 객체도 사용할 수 있습니다.

그리고 enum 키워드를 사용한 열거체(enumeration type)와 String 클래스의 객체도 사용할 수 있습니다.

따라서 switch 문은 if / else 문보다는 사용할 수 있는 상황이 적습니다.

 

자바에서 switch 문의 문법은 다음과 같습니다.

문법
switch (조건 값) {

    case 값1:

        조건 값이 값1일 때 실행하고자 하는 명령문;

        break;

    case 값2:

        조건 값이 값2일 때 실행하고자 하는 명령문;

        break;

    ...

    default:

        조건 값이 어떠한 case 절에도 해당하지 않을 때 실행하고자 하는 명령문;

        break;

}

 

default 절은 조건 값이 위에 나열된 어떠한 case 절에도 해당하지 않을 때만 실행됩니다.

이 절은 반드시 존재해야 하는 것은 아니며 필요할 때만 선언할 수 있습니다.

 

다음 예제는 switch 문을 사용하여, 해당 문자가 영문자 모음인지를 확인하는 예제입니다. 

예제
switch (ch) {

    case 'a':

        System.out.println("해당 문자는 'A'입니다.");

        break;

    case 'e':

        System.out.println("해당 문자는 'E'입니다.");

        break;

    case 'i':

        System.out.println("해당 문자는 'I'입니다.");

        break;

    case 'o':

        System.out.println("해당 문자는 'O'입니다.");

        break;

    case 'u':

        System.out.println("해당 문자는 'U'입니다.");

        break;

    default:

        System.out.println("해당 문자는 모음이 아닙니다.");

        break;

}

코딩연습 ▶

실행 결과
해당 문자는 'I'입니다.

 

default 절은 위의 예제와 같이 맨 마지막에 위치하는 것이 일반적이지만, case 절 사이에 위치해도 상관없습니다.

 

각 case 절 및 default 절은 반드시 break 키워드를 포함하고 있어야 합니다.

break 키워드는 조건 값에 해당하는 case 절이나 default 절이 실행된 뒤에 전체 switch 문을 빠져나가게 해줍니다.

만약에 break 키워드가 없다면, 조건에 해당하는 switch 문의 case 절 이후의 모든 case 절이 전부 실행될 것입니다.

 

다음 예제는 앞서 살펴본 예제에서 break 키워드를 모두 삭제한 예제입니다.

예제
switch (ch) {

    case 'a':

        System.out.println("해당 문자는 'A'입니다.");

    case 'e':

        System.out.println("해당 문자는 'E'입니다.");

    case 'i':

        System.out.println("해당 문자는 'I'입니다.");

    case 'o':

        System.out.println("해당 문자는 'O'입니다.");

    case 'u':

        System.out.println("해당 문자는 'U'입니다.");

    default:

        System.out.println("해당 문자는 모음이 아닙니다.");

}

코딩연습 ▶

실행 결과
해당 문자는 'I'입니다.

해당 문자는 'O'입니다.

해당 문자는 'U'입니다.

해당 문자는 모음이 아닙니다.

 

위의 예제처럼 break 키워드가 없으면, 조건 값에 해당하는 case 절뿐만 아니라 그 이후에 등장하는 모든 case 절과 default 절이 전부 실행됩니다.

 

다음 예제는 조건 값으로 여러 개의 char형 문자를 확인하는 예제입니다.

이렇게 switch 문의 조건으로 여러 개의 case 절을 사용하여 여러 개의 조건 값을 한 번에 검사할 수 있습니다.

예제
switch (ch) {

    case 'a':

    case 'e':

    case 'i':

    case 'o':

    case 'u':

        System.out.println("해당 문자는 소문자 모음입니다.");

        break;

    case 'A':

    case 'E':

    case 'I':

    case 'O':

    case 'U':

        System.out.println("해당 문자는 대문자 모음입니다.");

        break;

    default:

        System.out.println("해당 문자는 모음이 아닙니다.");

        break;

}

코딩연습 ▶

실행 결과
해당 문자는 대문자 모음입니다.