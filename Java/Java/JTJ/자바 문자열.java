문자열이란 문장을 뜻한다. 예를 들어 다음과 같은 것들이 문자열이다.

"Happy Java"  
"a"  
"123"
자바에서 문자열을 나타내는 자료형은 String 이다.

즉, 위의 문자열을 자바에서 표현하려면 다음과 같이 사용해야 한다.

String a = "Happy Java";
String b = "a";
String c = "123";
하지만 위의 예제는 다음과 같이 표현해도 된다.

String a = new String("Happy Java");
String b = new String("a");
String c = new String("123");
new 키워드는 객체를 만들 때 사용한다.

"객체"에 대해서는 나중에 자세하게 알아볼 것이다. 앞으로도 "객체"라는 용어가 계속해서 나올텐데 그때까지는 "새로 생성된 자료형" 정도의 의미라고만 알고 있도록 하자.

하지만 보통 문자열을 표현할 때는 가급적 첫번째 방식(리터럴 표기)을 사용하는 것이 좋다. 첫 번째 처럼 사용하면 가독성에 이점이 있고 컴파일 시 최적화에 도움을 주기 때문이다.

리터럴 표기

String a = "happy java" 와 String a = new String("happy java")는 같은 값을 갖게 되지만 완전히 동일하지는 않다. 첫번째 방식을 리터럴(literal) 표기라고 하는데 객체 생성없이 고정된 값을 그대로 대입하는 방법을 말한다. 위 예에서 리터럴 표기법은 "happy java" 라는 문자열을 intern pool 이라는 곳에 저장하고 다음에 다시 동일한 문자열이 선언될때는 cache 된 문자열을 리턴한다. 두번째 방식은 항상 새로운 String 객체를 만든다.

원시(primitive) 자료형
이전에 살펴보았던 int, long, double, float, boolean, char 등을 자바는 원시(primitive) 자료형 이라고 부른다. 이런 primitive 자료형은 new 키워드로 그 값을 생성할 수 없다.

primitive 자료형은 다음과 같이 리터럴(literal)로만 값을 세팅할 수 있다.

boolean result = true;
char capitalC = 'C';
int i = 100000;
여기서 잠깐, 하나 기억해 둘 것이 있다. String 은 "Happy Java"와 같이 리터럴로 표기가 가능하지만 primitive 자료형은 아니다. String은 리터럴 표현식을 사용할 수 있도록 자바에서 특별 대우 해 주는 자료형이다.

원시 자료형의 Wrapper 클래스

int, long, double, float, boolean, char 등의 원시 자료형은 다음처럼 각각에 대응하는 Wrapper 클래스들이 존재한다.

원시자료형	Wrapper 클래스
int	Integer
long	Long
double	Double
float	Float
boolean	Boolean
char	Char
앞으로 공부할 ArrayList, HashMap, HashSet 등은 데이터 저장시 원시 자료형 대신 그에 대응하는 Wrapper 클래스들을 사용한다. 원시 자료형 대신 Wrapper 클래스를 사용하면 값 대신 객체를 주고 받을 수 있어 코드를 객체 지향적으로 작성하는데 유리하다.

문자열 내장 메소드
String 자료형에는 유용한 메소드들이 있는데 자주 사용되는 것들에 대해서 알아보자.

equals
equals는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴한다.

다음의 예를 보자.

String a = "hello";
String b = "java";
String c = "hello";
System.out.println(a.equals(b)); // false
System.out.println(a.equals(c)); // true
문자열 a 와 문자열 b 는 "hello"와 "java"로 서로 같지 않다. 따라서 equals 메소드 호출 시 false 를 리턴한다. 문자열 a 와 문자열 c 는 "hello"와 "hello"로 서로 같다. 따라서 true 를 리턴한다.

문자열의 값을 비교할때는 반드시 equals 를 사용해야 한다. == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.

String a = "hello";
String b = new String("hello");
System.out.println(a.equals(b));  // true
System.out.println(a==b);  // false
문자열 a와 b는 모두 "hello"로 같은 값이지만 equals 를 호출했을 때는 true 를 == 연산자를 이용했을 때는 false를 리턴한다. a와 b는 값은 같지만 서로 다른 객체이다. == 은 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 false를 리턴한다.

※ 객체에 대해서는 "객체 지향 프로그래밍" 챕터에서 자세하게 다룬다.

indexOf
indexOf는 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다.

다음과 같은 문자열을 보자.

String a = "Hello Java";
위와 같은 a 문자열에서 "Java"라는 문자열이 시작되는 위치를 알고 싶은 경우 indexOf를 다음과 같이 사용할 수 있다.

System.out.println(a.indexOf("Java"));
결과값은 다음과 같을 것이다.

6
"Hello Java" 라는 문자열에서 "Java"라는 문자열은 일곱번째 문자('J')부터 시작이다. 결과값이 6으로 나온 이유는 자바는 숫자를 0부터 세기 때문이다.

replaceAll
replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.

String a = "Hello Java";
System.out.println(a.replaceAll("Java", "World"));
결과값은 다음과 같다.

Hello World
"Hello Java" 라는 문자열에서 "Java"가 "World"로 바뀌었다.

substring
substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.

다음의 예를 보자.

String a = "Hello Java";
System.out.println(a.substring(0, 4));
결과값은 다음과 같다.

Hell
위처럼 substring(시작위치, 끝위치)와 같이 사용하면 문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다. 단 끝위치는 포함이 안된다는 점에 주의하자. 이것은 다음과 같은 수학의 식과 비슷하다.

시작위치 <= a < 끝위치
toUpperCase
toUpperCase는 문자열을 모두 대문자로 변경할 때 사용한다. (모두 소문자로 변경할때는 toLowerCase를 사용한다.)

String a = "Hello Java";
System.out.println(a.toUpperCase());
결과값은 다음과 같다.

HELLO JAVA
테스트 코드
이상과 같이 문자열에서 가장 많이 사용되는 메소드들에서 간단하게 알아보았다. 다음은 테스트를 수행했던 코드이다.

public class Sample {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replaceAll("Java", "World"));
        System.out.println(a.substring(0, 4));
        System.out.println(a.toUpperCase());
    }
}