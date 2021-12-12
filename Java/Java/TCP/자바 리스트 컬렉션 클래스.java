List 컬렉션 클래스
List 컬렉션 클래스
List 인터페이스를 구현한 모든 List 컬렉션 클래스는 다음과 같은 특징을 가집니다.

 

1. 요소의 저장 순서가 유지됩니다.

2. 같은 요소의 중복 저장을 허용합니다. 

 

대표적인 List 컬렉션 클래스에 속하는 클래스는 다음과 같습니다.

 

1. ArrayList<E>

2. LinkedList<E>

3. Vector<E>

4. Stack<E>

ArrayList<E> 클래스
ArrayList 클래스는 가장 많이 사용되는 컬렉션 클래스 중 하나입니다.

JDK 1.2부터 제공된 ArrayList 클래스는 내부적으로 배열을 이용하여 요소를 저장합니다.

 

ArrayList 클래스는 배열을 이용하기 때문에 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있습니다.

하지만 배열은 크기를 변경할 수 없는 인스턴스이므로, 크기를 늘리기 위해서는 새로운 배열을 생성하고 기존의 요소들을 옮겨야 하는 복잡한 과정을 거쳐야 합니다.

물론 이 과정은 자동으로 수행되지만, 요소의 추가 및 삭제 작업에 걸리는 시간이 매우 길어지는 단점을 가지게 됩니다.

 

다음 예제는 여러 ArrayList 메소드를 이용하여 리스트를 생성하고 조작하는 예제입니다.

예제
ArrayList<Integer> arrList = new ArrayList<Integer>();

 

// add() 메소드를 이용한 요소의 저장

arrList.add(40);

arrList.add(20);

arrList.add(30);

arrList.add(10);

 

// for 문과 get() 메소드를 이용한 요소의 출력

for (int i = 0; i < arrList.size(); i++) {

    System.out.print(arrList.get(i) + " ");

}

 

// remove() 메소드를 이용한 요소의 제거

arrList.remove(1);

 

// Enhanced for 문과 get() 메소드를 이용한 요소의 출력

for (int e : arrList) {

    System.out.print(e + " ");

}

 

// Collections.sort() 메소드를 이용한 요소의 정렬

Collections.sort(arrList);

 

// iterator() 메소드와 get() 메소드를 이용한 요소의 출력

Iterator<Integer> iter = arrList.iterator();

while (iter.hasNext()) {

    System.out.print(iter.next() + " ");

}

 

// set() 메소드를 이용한 요소의 변경

arrList.set(0, 20);

 

for (int e : arrList) {

    System.out.print(e + " ");

}

 

// size() 메소드를 이용한 요소의 총 개수

System.out.println("리스트의 크기 : " + arrList.size());

코딩연습 ▶

실행 결과
40 20 30 10 

40 30 10

10 30 40 

20 30 40

리스트의 크기 : 3

 

위 예제처럼 컬렉션 클래스의 요소를 출력하는 방법에는 for 문과 enhanced for 문, iterator() 메소드를 이용한 방법 등 다양한 방법을 사용할 수 있습니다.

 

자바의 Collections 클래스는 JDK 1.2부터 제공되는 컬렉션에서 동작하거나 컬렉션을 반환하는 클래스 메소드(static method)만으로 구성된 클래스입니다.
자바의 Collection은 인터페이스이며, Collections는 클래스임을 주의해야 합니다.
LinkedList<E> 클래스
LinkedList 클래스는 ArrayList 클래스가 배열을 이용하여 요소를 저장함으로써 발생하는 단점을 극복하기 위해 고안되었습니다.

JDK 1.2부터 제공된 LinkedList 클래스는 내부적으로 연결 리스트(linked list)를 이용하여 요소를 저장합니다.

 

배열은 저장된 요소가 순차적으로 저장됩니다.

하지만 연결 리스트는 저장된 요소가 비순차적으로 분포되며, 이러한 요소들 사이를 링크(link)로 연결하여 구성합니다.

다음 요소를 가리키는 참조만을 가지는 연결 리스트를 단일 연결 리스트(singly linked list)라고 합니다.

 

단일 연결 리스트

 

이러한 단일 연결 리스트는 요소의 저장과 삭제 작업이 다음 요소를 가리키는 참조만 변경하면 되므로, 아주 빠르게 처리될 수 있습니다.

하지만 단일 연결 리스트는 현재 요소에서 이전 요소로 접근하기가 매우 어렵습니다.

 

따라서 이전 요소를 가리키는 참조도 가지는 이중 연결 리스트(doubly linked list)가 좀 더 많이 사용됩니다.

 

이중 연결 리스트

 

LinkedList 클래스도 위와 같은 이중 연결 리스트를 내부적으로 구현한 것입니다.

또한, LinkedList 클래스 역시 List 인터페이스를 구현하므로, ArrayList 클래스와 사용할 수 있는 메소드가 거의 같습니다.

 

다음 예제는 여러 LinkedList 메소드를 이용하여 리스트를 생성하고 조작하는 예제입니다.

예제
LinkedList<String> lnkList = new LinkedList<String>();

 

// add() 메소드를 이용한 요소의 저장

lnkList.add("넷");

lnkList.add("둘");

lnkList.add("셋");

lnkList.add("하나");

 

// for 문과 get() 메소드를 이용한 요소의 출력

for (int i = 0; i < lnkList.size(); i++) {

    System.out.print(lnkList.get(i) + " ");

}

 

// remove() 메소드를 이용한 요소의 제거

lnkList.remove(1);

 

// Enhanced for 문과 get() 메소드를 이용한 요소의 출력

for (String e : lnkList) {

    System.out.print(e + " ");

}

 

// set() 메소드를 이용한 요소의 변경

lnkList.set(2, "둘");

 

for (String e : lnkList) {

    System.out.print(e + " ");

}

 

// size() 메소드를 이용한 요소의 총 개수

System.out.println("리스트의 크기 : " + lnkList.size());

코딩연습 ▶

실행 결과
넷 둘 셋 하나

넷 셋 하나

넷 셋 둘

리스트의 크기 : 3

 

위의 예제를 살펴보면 앞선 예제와 연결 리스트를 생성하는 한 줄의 코드만이 다른 것을 확인할 수 있습니다.

이처럼 ArrayList와 LinkedList의 차이는 사용 방법이 아닌, 내부적으로 요소를 저장하는 방법에 있습니다.

Vector<E> 클래스
Vector 클래스는 JDK 1.0부터 사용해 온 ArrayList 클래스와 같은 동작을 수행하는 클래스입니다.

현재의 Vector 클래스는 ArrayList 클래스와 마찬가지로 List 인터페이스를 상속받습니다.

따라서 Vector 클래스에서 사용할 수 있는 메소드는 ArrayList 클래스에서 사용할 수 있는 메소드와 거의 같습니다.

하지만 현재에는 기존 코드와의 호환성을 위해서만 남아있으므로, Vector 클래스보다는 ArrayList 클래스를 사용하는 것이 좋습니다.

List 인터페이스 메소드
List 인터페이스는 Collection 인터페이스를 상속받으므로, Collection 인터페이스에서 정의한 메소드도 모두 사용할 수 있습니다.

List 인터페이스에서 제공하는 주요 메소드는 다음과 같습니다.

메소드	설명
boolean add(E e)	해당 리스트(list)에 전달된 요소를 추가함. (선택적 기능)
void add(int index, E e)	해당 리스트의 특정 위치에 전달된 요소를 추가함. (선택적 기능)
void clear()	해당 리스트의 모든 요소를 제거함. (선택적 기능)
boolean contains(Object o)	해당 리스트가 전달된 객체를 포함하고 있는지를 확인함.
boolean equals(Object o)	해당 리스트와 전달된 객체가 같은지를 확인함.
E get(int index)	해당 리스트의 특정 위치에 존재하는 요소를 반환함.
boolean isEmpty()	해당 리스트가 비어있는지를 확인함.
Iterator<E> iterator()	해당 리스트의 반복자(iterator)를 반환함.
boolean remove(Object o)	해당 리스트에서 전달된 객체를 제거함. (선택적 기능)
boolean remove(int index)	해당 리스트의 특정 위치에 존재하는 요소를 제거함. (선택적 기능)
E set(int index, E e)	해당 리스트의 특정 위치에 존재하는 요소를 전달받은 객체로 대체함. (선택적 기능)
int size()	해당 리스트의 요소의 총 개수를 반환함.
Object[] toArray()	해당 리스트의 모든 요소를 Object 타입의 배열로 반환함.