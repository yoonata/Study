제네릭스(Generics)는 자바 J2SE 5.0 이후에 도입된 개념이다. 여기서는 제네릭스를 사용하는 방법에 대해서만 다룬다. 제네릭스를 만드는 방법은 입문서에 어울리지 않는 고급 주제이므로 이 책에서는 생략한다.

다음과 같은 것이 제네릭스이다.

ArrayList<String> aList = new ArrayList<String>();
하지만 보통 뒷 부분의 자료형은 굳이 적지 않아도 명확하기 때문에 다음의 표기법을 사용하는 것이 좋다.

ArrayList<String> aList = new ArrayList<>();  // 선호되는 방식
※ 만약 앞 뒤에 모두 자료형 타입을 적을 경우 인텔리제이와 같은 IDE에서는 경고메시지를 출력한다.

제네릭스가 도입되기 전인 J2SE 1.4 까지는 위의 코드를 다음과 같이 사용했다.

ArrayList aList = new ArrayList();
두 개 코드의 차이점은 ArrayList 라는 자료형 타입 바로 옆에 <String> 과 같은 문구가 있느냐 없느냐의 차이이다.

※ JSSE 5.0 이후 버전에서 두번째 방법으로 코드를 작성해도 오류는 나지 않는다. 다만 제네릭스 타입을 명확하게 지정하라는 Warning 메시지가 출력된다.

위에서 사용한 첫번째 코드의 <String> 이라는 제네릭스 표현식은 "ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다" 라는 것을 의미한다.

※ 여기서는 제네릭스의 타입으로 String 자료형만을 예로 들었지만 <Integer>, <Animal>, <Dog> 등 어떤 자료형도 사용할 수 있다.

즉, 제네릭스를 이용하면 좀 더 명확한 타입체크가 가능해 진다. 이것은 코드를 작성할 때도 몇가지 이득을 주게 된다.

우선 제네릭스를 사용하지 않은 경우를 생각해 보자.

ArrayList aList = new ArrayList();
aList.add("hello");
aList.add("java");

String hello = (String) aList.get(0);
String java = (String) aList.get(1);
위처럼 제네릭스를 사용하지 않을 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다. Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다. 따라서 ArrayList 객체인 aList에 값을 넣을 때는 문제가 안되지만 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 다음과 같이 형변환(casting)을 해 주어야만 한다.

String hello = (String) aList.get(0); // Object 자료형을 String 자료형으로 캐스팅한다.
또 한가지 주의할 점은 aList 안에는 String 객체 이외의 객체도 넣을 수 있기 때문에 형 변환 과정에서 잘못된 형변환으로 인한 오류가 발생할 소지가 있다는 점이다. 바로 이러한 점이 제네릭스의 탄생 이유이기도 하다.

위 코드를 제네릭스를 사용하여 변경하면 다음과 같이 된다.

ArrayList<String> aList = new ArrayList<>();
aList.add("hello");
aList.add("java");

String hello = aList.get(0);  // 형 변환이 필요없다.
String java = aList.get(1);  // 형 변환이 필요없다.
제네릭스로 자료형을 선언하기만 하면 그 이후로는 자료형에 대한 형변환 과정이 필요없다. 이미 컴파일러가 aList 에는 반드시 String 자료형만 추가 되어야 함을 알기 때문이다. 이렇게 제네릭스를 이용하면 형변환에 의한 불필요한 코딩과 잘못된 형변환에 의한 런타임 오류를 방지할 수 있다.