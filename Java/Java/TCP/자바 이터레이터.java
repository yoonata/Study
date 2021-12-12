Iterator와 ListIterator
Iterator<E> 인터페이스
자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법을 Iterator 인터페이스로 표준화하고 있습니다.

Collection 인터페이스에서는 Iterator 인터페이스를 구현한 클래스의 인스턴스를 반환하는 iterator() 메소드를 정의하여 각 요소에 접근하도록 하고 있습니다.

따라서 Collection 인터페이스를 상속받는 List와 Set 인터페이스에서도 iterator() 메소드를 사용할 수 있습니다.

 

다음 예제는 연결 리스트를 반복자(iterator)를 사용하여 순회하는 예제입니다.

예제
LinkedList<Integer> lnkList = new LinkedList<Integer>();

 

lnkList.add(4);

lnkList.add(2);

lnkList.add(3);

lnkList.add(1);

 

Iterator<Integer> iter = lnkList.iterator();

while (iter.hasNext()) {

    System.out.print(iter.next() + " ");

}

코딩연습 ▶

실행 결과
4 2 3 1 

 

Iterator 인터페이스는 다음과 같은 메소드를 사용하여 컬렉션의 각 요소에 접근할 수 있습니다.

메소드	설명
boolean hasNext()	해당 이터레이션(iteration)이 다음 요소를 가지고 있으면 true를 반환하고, 더 이상 다음 요소를 가지고 있지 않으면 false를 반환함.
E next()	이터레이션(iteration)의 다음 요소를 반환함.
default void remove()	해당 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거함. (선택적 기능)
 

하지만 현재 자바에서는 될 수 있으면 JDK 1.5부터 추가된 Enhanced for 문을 사용하도록 권장하고 있습니다.

Enhanced for 문을 사용하면 같은 성능을 유지하면서도 코드의 명확성을 확보하고 발생할 수 있는 버그를 예방해 줍니다.

하지만 요소의 선택적 제거나 대체 등을 수행하기 위한 경우에는 반복자(iterator)를 사용해야만 합니다.

Enumeration<E> 인터페이스
Enumeration 인터페이스는 JDK 1.0부터 사용해 온 Iterator 인터페이스와 같은 동작을 하는 인터페이스입니다.

Enumeration 인터페이스는 hasMoreElements()와 nextElement() 메소드를 사용하여 Iterator와 같은 작업을 수행합니다.

하지만 현재에는 기존 코드와의 호환성을 위해서만 남아있으므로, Enumeration 인터페이스보다는 Iterator 인터페이스를 사용하는 것이 좋습니다.

ListIterator<E> 인터페이스
ListIterator 인터페이스는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스입니다.

Iterator 인터페이스는 컬렉션의 요소에 접근할 때 한 방향으로만 이동할 수 있습니다.

하지만 JDK 1.2부터 제공된 ListIterator 인터페이스는 컬렉션 요소의 대체, 추가 그리고 인덱스 검색 등을 위한 작업에서 양방향으로 이동하는 것을 지원합니다.

단, ListIterator 인터페이스는 List 인터페이스를 구현한 List 컬렉션 클래스에서만 listIterator() 메소드를 통해 사용할 수 있습니다.

 

다음 예제는 리스트 반복자를 사용하여 리스트의 모든 요소를 각각 순방향과 역방향으로 출력하는 예제입니다.

예제
LinkedList<Integer> lnkList = new LinkedList<Integer>();

 

lnkList.add(4);

lnkList.add(2);

lnkList.add(3);

lnkList.add(1);

 

ListIterator<Integer> iter = lnkList.listIterator();

while (iter.hasNext()) {

    System.out.print(iter.next() + " ");

}

 

while (iter.hasPrevious()) {

    System.out.print(iter.previous() + " ");

}

코딩연습 ▶

실행 결과
4 2 3 1 

1 3 2 4 

 

ListIterator 인터페이스는 다음과 같은 메소드를 사용하여 컬렉션의 각 요소에 접근할 수 있습니다.

메소드	설명
void add(E e)	해당 리스트(list)에 전달된 요소를 추가함. (선택적 기능)
boolean hasNext()	이 리스트 반복자가 해당 리스트를 순방향으로 순회할 때 다음 요소를 가지고 있으면 true를 반환하고, 더 이상 다음 요소를 가지고 있지 않으면 false를 반환함.
boolean hasPrevious()	이 리스트 반복자가 해당 리스트를 역방향으로 순회할 때 다음 요소를 가지고 있으면 true를 반환하고, 더 이상 다음 요소를 가지고 있지 않으면 false를 반환함.
E next()	리스트의 다음 요소를 반환하고, 커서(cursor)의 위치를 순방향으로 이동시킴.
int nextIndex()	다음 next() 메소드를 호출하면 반환될 요소의 인덱스를 반환함.
E previous()	리스트의 이전 요소를 반환하고, 커서(cursor)의 위치를 역방향으로 이동시킴.
int previousIndex()	다음 previous() 메소드를 호출하면 반환될 요소의 인덱스를 반환함.
void remove()	next()나 previous() 메소드에 의해 반환된 가장 마지막 요소를 리스트에서 제거함. (선택적 기능)
void set(E e)	next()나 previous() 메소드에 의해 반환된 가장 마지막 요소를 전달된 객체로 대체함. (선택적 기능)