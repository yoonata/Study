예외 클래스
Exception 클래스
자바에서 모든 예외의 조상 클래스가 되는 Exception 클래스는 크게 다음과 같이 구분할 수 있습니다.

 

1. RuntimeException 클래스

2. 그 외의 Exception 클래스의 자식 클래스

 

예외 클래스 계층도

 

RuntimeException 클래스를 상속받는 자식 클래스들은 주로 치명적인 예외 상황을 발생시키지 않는 예외들로 구성됩니다.

따라서 try / catch 문을 사용하기보다는 프로그램을 작성하면서 예외가 발생하지 않도록 주의를 기울이는 편이 좋습니다.

 

하지만 그 외의 Exception 클래스에 속하는 자식 클래스들은 치명적인 예외 상황을 발생시키므로, 반드시 try / catch 문을 사용하여 예외를 처리해야만 합니다.

따라서 자바 컴파일러는 RuntimeException 클래스 이외의 Exception 클래스의 자식 클래스에 속하는 예외가 발생할 가능성이 있는 구문에는 반드시 예외를 처리하도록 강제하고 있습니다.

만약 이러한 예외가 발생할 가능성이 있는 구문을 예외 처리하지 않았을 때는 컴파일 시 오류를 발생시킵니다.

 

다음 예제는 PrintStream 클래스의 write() 메소드를 사용하여 byte 타입 배열의 모든 요소를 출력하는 예제입니다.

예제
public class Exception01 {

    public static void main(String[] args) {

        byte[] list = {'a', 'b', 'c'};

        System.out.write(list);

    }

}

 

하지만 위의 예제에서는 write() 메소드에서 발생할 수 있는 IOException에 대한 예외를 처리하지 않았으므로, 컴파일 시 오류가 발생합니다.

 

따라서 다음 예제와 같이 try / catch 문을 사용하여 IOException에 대한 예외 처리까지 해 주어야만 컴파일 할 수 있습니다.

예제
byte[] list = {'a', 'b', 'c'};

 

try {

    System.out.write(list);

} catch (IOException e) {

    e.printStackTrace();

}

코딩연습 ▶

실행 결과
abc

예외 처리의 계층 관계
자바에서는 예외가 발생하면, try 블록과 가장 가까운 catch 블록부터 순서대로 검사합니다.

따라서 여러 개의 catch 블록을 사용할 때는 Exception 클래스의 계층 관계에도 주의를 기울여야만 합니다.

 

예제
try {

    System.out.write(list);

} catch (Exception e) {

    e.printStackTrace();

} catch (IOException e) {

    e.printStackTrace();

}

 

위의 예제에서 IOException이 발생하면, 자바는 첫 번째 catch 블록부터 순서대로 해당 예외를 처리할 수 있는지를 검사합니다.

그런데 IOException은 Exception의 자식 클래스이므로, 첫 번째 catch 블록에서도 IOException을 처리할 수 있습니다.

따라서 IOException을 비롯한 Exception 클래스의 자식 클래스에 해당하는 예외가 발생하면, 언제나 첫 번째 catch 블록에서만 처리될 것입니다.

즉, catch 블록의 순서를 위의 예제처럼 작성하면, 두 번째 catch 블록은 영원히 실행되지 못할 것입니다.

 

따라서 IOException만을 따로 처리하고자 한다면, 다음 예제처럼 catch 블록의 순서를 변경해야 합니다.

예제
try {

    System.out.write(list);

} catch (IOException e) {

    e.printStackTrace();

} catch (Exception e) {

    e.printStackTrace();

}

 

위의 예제에서 IOException이 발생하면, 첫 번째 catch 블록에서 해당 예외를 처리할 것입니다.

또한, IOException 외의 Exception 클래스의 자식 클래스에 해당하는 예외가 발생하면, 두 번째 catch 블록에서 처리될 것입니다.

이처럼 범위가 더 좁은 예외를 처리하는 catch 블록을 먼저 명시하고, 범위가 더 넓은 예외를 처리하는 catch 블록은 나중에 명시해야만 정상적으로 해당 예외를 처리할 수 있습니다.

여러 예외 타입의 동시 처리
Java SE 7부터는 '|' 기호를 사용하여 하나의 catch 블록에서 여러 타입의 예외를 동시에 처리할 수 있습니다.

예제
try {

    this.db.commit();

} catch (IOException e) {

    e.printStackTrace();

} catch (SQLException e) {

    e.printStackTrace();

}

 

즉, Java SE 7부터는 위의 예제를 다음 예제처럼 표현할 수 있게 되었습니다.

예제
try {

    this.db.commit();

} catch (IOException | SQLException e) {

    e.printStackTrace();

}

 

하지만 둘 이상의 예외 타입를 동시에 처리하는 catch 블록에서 매개변수로 전달받은 예외 객체는 묵시적으로 final 제어자를 가지게 됩니다.

따라서 catch 블록 내에서 해당 매개변수에는 어떠한 값도 대입할 수 없습니다.

Throwable 클래스
자바에서 Throwable 클래스는 모든 예외의 조상이 되는 Exception 클래스와 모든 오류의 조상이 되는 Error 클래스의 부모 클래스입니다.

Throwable 타입과 이 클래스를 상속받은 서브 타입만이 자바 가상 머신(JVM)이나 throw 키워드에 의해 던져질 수 있습니다.

 

이 클래스에는 예외나 오류에 관한 다양한 정보를 확인할 수 있는 다음과 같은 메소드가 포함되어 있습니다.

메소드	설명
String getMessage()	해당 throwable 객체에 대한 자세한 내용을 문자열로 반환함.
void printStackTrace()	해당 throwable 객체와 표준 오류 스트림(standard error stream)에서 해당 객체의 스택 트레이스(stack trace)를 출력함.
String toString()	해당 throwable 객체에 대한 간략한 내용을 문자열로 반환함.
 

다음 예제는 일부러 숫자를 0으로 나눠 ArithmeticException 오류를 발생시키는 예제입니다.

이렇게 발생한 오류에 대해 Throwable 메소드를 사용하여 발생한 오류에 대한 정보를 출력합니다.

예제
try {

    System.out.println(5 / 0);

} catch (ArithmeticException e) {

    System.out.println("현재 발생한 예외 정보 : " + e.getMessage());

}

코딩연습 ▶

실행 결과
현재 발생한 예외 정보 : / by zero

자주 사용되는 예외 클래스
자바에서 자주 사용되는 예외 클래스는 다음과 같습니다.

클래스	설명
ClassCastException	수행할 수 없는 타입 변환이 진행될 경우
ArrayIndexOutOfBoundsException	배열에 잘못된 인덱스를 사용하여 접근할 경우
NullPointerException	null 객체의 인스턴스 메소드를 호출하는 등의 경우
ArithmeticException	산술 연산에서 정수를 0으로 나누는 등 연산을 수행할 수 없는 경우