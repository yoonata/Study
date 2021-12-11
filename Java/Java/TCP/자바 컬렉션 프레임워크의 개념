컬렉션 프레임워크의 개념
컬렉션 프레임워크(collection framework)란?
자바에서 컬렉션 프레임워크(collection framework)란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미합니다

즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것입니다.

 

이러한 컬렉션 프레임워크는 자바의 인터페이스(interface)를 사용하여 구현됩니다.

컬렉션 프레임워크 주요 인터페이스
컬렉션 프레임워크에서는 데이터를 저장하는 자료 구조에 따라 다음과 같은 핵심이 되는 주요 인터페이스를 정의하고 있습니다.

 

1. List 인터페이스

2. Set 인터페이스

3. Map 인터페이스

 

이 중에서 List와 Set 인터페이스는 모두 Collection 인터페이스를 상속받지만, 구조상의 차이로 인해 Map 인터페이스는 별도로 정의됩니다.

따라서 List 인터페이스와 Set 인터페이스의 공통된 부분을 Collection 인터페이스에서 정의하고 있습니다. 

 

자바 컬렉션 프레임워크의 주요 인터페이스에 대한 더 자세한 사항은 다음 페이지를 참고하면 됩니다.

 

Java Documentation : The Collections Framework =>

주요 인터페이스 간의 상속 관계
자바에서 컬렉션 프레임워크를 구성하고 있는 인터페이스 간의 상속 관계는 다음 그림과 같습니다.

 

컬렉션 프레임워크 인터페이스 다이어그램

 

위의 그림에서 <E>나 <K, V>라는 것은 컬렉션 프레임워크를 구성하는 모든 클래스가 제네릭으로 표현되어 있음을 알려줍니다.

제네릭의 개념에 대한 더 자세한 사항은 자바 제네릭 수업에서 확인할 수 있습니다.

 

자바 제네릭 수업 확인 =>

주요 인터페이스의 간략한 특징
자바에서 컬렉션 프레임워크를 구성하고 있는 주요 인터페이스의 간략한 특징은 다음과 같습니다.

인터페이스	설명	구현 클래스
List<E>	순서가 있는 데이터의 집합으로, 데이터의 중복을 허용함.	Vector, ArrayList, LinkedList, Stack, Queue
Set<E>	순서가 없는 데이터의 집합으로, 데이터의 중복을 허용하지 않음.	HashSet, TreeSet
Map<K, V>	
키와 값의 한 쌍으로 이루어지는 데이터의 집합으로, 순서가 없음.

이때 키는 중복을 허용하지 않지만, 값은 중복될 수 있음.

HashMap, TreeMap, Hashtable, Properties
컬렉션 클래스(collection class)
컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스를 컬렉션 클래스(collection class)라고 합니다.

 

컬렉션 프레임워크의 모든 컬렉션 클래스는 List와 Set, Map 인터페이스 중 하나의 인터페이스를 구현하고 있습니다.

또한, 클래스 이름에도 구현한 인터페이스의 이름이 포함되므로 바로 구분할 수 있습니다.

 

Vector나 Hashtable과 같은 컬렉션 클래스는 예전부터 사용해 왔으므로, 기존 코드와의 호환을 위해 아직도 남아 있습니다.

하지만 기존에 사용하던 컬렉션 클래스를 사용하는 것보다는 새로 추가된 ArrayList나 HashMap 클래스를 사용하는 것이 성능 면에서도 더 나은 결과를 얻을 수 있습니다.

 

다음 예제는 ArrayList 클래스를 이용하여 리스트를 생성하고 조작하는 예제입니다.

예제
import java.util.*;

 

public class Collection01 {

    public static void main(String[] args) {

        // 리스트 생성

        ArrayList<String> arrList = new ArrayList<String>();

 

        // 리스트에 요소의 저장

        arrList.add("넷");

        arrList.add("둘");

        arrList.add("셋");

        arrList.add("하나");

 

        // 리스트 요소의 출력

        for(int i = 0; i < arrList.size(); i++) {

            System.out.println(arrList.get(i));

        }

    }

}

코딩연습 ▶

실행 결과
넷

둘

셋

하나

Collection 인터페이스
List와 Set 인터페이스의 많은 공통된 부분을 Collection 인터페이스에서 정의하고, 두 인터페이스는 그것을 상속받습니다.

따라서 Collection 인터페이스는 컬렉션을 다루는데 가장 기본적인 동작들을 정의하고, 그것을 메소드로 제공하고 있습니다.

 

Collection 인터페이스에서 제공하는 주요 메소드는 다음과 같습니다.

메소드	설명
boolean add(E e)	해당 컬렉션(collection)에 전달된 요소를 추가함. (선택적 기능)
void clear()	해당 컬렉션의 모든 요소를 제거함. (선택적 기능)
boolean contains(Object o)	해당 컬렉션이 전달된 객체를 포함하고 있는지를 확인함.
boolean equals(Object o)	해당 컬렉션과 전달된 객체가 같은지를 확인함.
boolean isEmpty()	해당 컬렉션이 비어있는지를 확인함.
Iterator<E> iterator()	해당 컬렉션의 반복자(iterator)를 반환함.
boolean remove(Object o)	해당 컬렉션에서 전달된 객체를 제거함. (선택적 기능)
int size()	해당 컬렉션의 요소의 총 개수를 반환함.
Object[] toArray()	해당 컬렉션의 모든 요소를 Object 타입의 배열로 반환함.