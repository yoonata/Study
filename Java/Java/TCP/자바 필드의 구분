필드의 구분
필드의 구분
클래스의 필드(field)란 클래스에 포함된 변수(variable)를 의미합니다.

클래스 내에서 필드는 선언된 위치에 따라 다음과 같이 구분됩니다.

 

1. 클래스 변수(static variable)

2. 인스턴스 변수(instance variable)

3. 지역 변수(local variable)

 

예제
class Car {

    static int modelOutput; // 클래스 변수

    String modelName;       // 인스턴스 변수

 

    void method() {

        int something = 10; // 지역 변수

    }

}

 

클래스 변수와 인스턴스 변수는 초기화를 하지 않아도 변수의 타입에 맞게 자동으로 초기화될 것입니다.

하지만 지역 변수는 사용하기 전에 초기화하지 않으면, 자바 컴파일러가 오류를 발생시킵니다.

 

자바에서 클래스 변수와 인스턴스 변수의 초깃값은 다음과 같습니다.

변수의 타입	초깃값
char	'\u0000'
byte, short, int	0
long	0L
float	0.0F
double	0.0 또는 0.0D
boolean	false
배열, 인스턴스 등	null
클래스 변수와 인스턴스 변수
클래스 영역에 위치한 변수 중에서 static 키워드를 가지는 변수를 클래스 변수(static variable)라고 합니다.

그리고 클래스 영역에 위치한 변수 중 static 키워드를 가지지 않는 변수는 인스턴스 변수(instance variable)라고 합니다.

또한, 메소드나 생성자, 초기화 블록 내에 위치한 변수를 지역 변수(local variable)라고 합니다.

 

이렇게 선언된 위치에 따라 구분되는 변수는 생성 및 소멸 시기, 저장되는 메모리 공간과 사용 방법까지도 서로 다릅니다.

변수	생성 시기	소멸 시기	저장 메모리	사용 방법
클래스 변수	클래스가 메모리에 올라갈 때	프로그램이 종료될 때	메소드 영역	클래스이름.변수이름
인스턴스 변수	인스턴스가 생성될 때	인스턴스가 소멸할 때	힙 영역	인스턴스이름.변수이름
지역 변수	블록 내에서 변수의 선언문이 실행될 때	블록을 벗어날 때	스택 영역	변수이름
 

클래스 변수는 인스턴스를 생성하지 않고도 바로 사용할 수 있습니다.

따라서 이러한 클래스 변수를 공유 변수(shared variable)라고도 합니다.

 

이러한 클래스 변수는 해당 클래스의 모든 인스턴스가 공유해야 하는 값을 유지하기 위해 사용됩니다.

반면에 인스턴스 변수는 인스턴스마다 가져야 하는 고유한 값을 유지하기 위해 사용됩니다.

 

다음 예제는 클래스에 여러 가지 종류의 변수를 생성하고 참조하는 예제입니다.

예제
class Field {

    static int classVar = 10; // 클래스 변수 선언

    int instanceVar = 20;     // 인스턴스 변수 선언

}

 

public class Member01 {

    public static void main(String[] args) {

        int var = 30;                   // 지역 변수 선언

        System.out.println(var + "\n"); // 지역 변수 참조

 

        Field myField1 = new Field();   // 인스턴스 생성

        Field myField2 = new Field();   // 인스턴스 생성

 

        System.out.println(Field.classVar); // 클래스 변수 참조

        System.out.println(myField1.classVar);

        System.out.println(myField2.classVar + "\n");

 

        myField1.classVar = 100;            // 클래스 변수의 값을 변경

 

        System.out.println(Field.classVar); // 클래스 변수 참조

        System.out.println(myField1.classVar);

        System.out.println(myField2.classVar + "\n");

 

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조

        System.out.println(myField2.instanceVar + "\n");

 

        myField1.instanceVar = 200;               // 인스턴스 변수의 값을 변경

 

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조

        System.out.println(myField2.instanceVar);

    }

}

코딩연습 ▶

실행 결과
30

 

10

10

10

 

100

100

100

 

20

20

 

200

20

 

위의 예제를 통해 클래스 변수는 생성된 모든 인스턴스가 같은 값을 공유하는 것을 확인할 수 있습니다.

하지만 인스턴스 변수는 각 인스턴스마다 고유한 값을 가지는 것을 확인할 수 있습니다.