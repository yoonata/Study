Map 컬렉션 클래스
Map 컬렉션 클래스
Map 인터페이스는 Collection 인터페이스와는 다른 저장 방식을 가집니다.

Map 인터페이스를 구현한 Map 컬렉션 클래스들은 키와 값을 하나의 쌍으로 저장하는 방식(key-value 방식)을 사용합니다.

여기서 키(key)란 실질적인 값(value)을 찾기 위한 이름의 역할을 합니다.

 

Map 인터페이스를 구현한 모든 Map 컬렉션 클래스는 다음과 같은 특징을 가집니다.

 

1. 요소의 저장 순서를 유지하지 않습니다.

2. 키는 중복을 허용하지 않지만, 값의 중복은 허용합니다. 

 

대표적인 Map 컬렉션 클래스에 속하는 클래스는 다음과 같습니다.

 

1. HashMap<K, V>

2. Hashtable<K, V>

3. TreeMap<K, V>

HashMap<K, V> 클래스
HashMap 클래스는 Map 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나입니다.

JDK 1.2부터 제공된 HashMap 클래스는 해시 알고리즘(hash algorithm)을 사용하여 검색 속도가 매우 빠릅니다.

 

HashMap 클래스는 Map 인터페이스를 구현하므로, 중복된 키로는 값을 저장할 수 없습니다.

하지만 같은 값을 다른 키로 저장하는 것은 가능합니다.

 

다음 예제는 여러 HashMap 메소드를 이용하여 맵을 생성하고 조작하는 예제입니다.

예제
HashMap<String, Integer> hm = new HashMap<String, Integer>();

 

// put() 메소드를 이용한 요소의 저장

hm.put("삼십", 30);

hm.put("십", 10);

hm.put("사십", 40);

hm.put("이십", 20);

 

// Enhanced for 문과 get() 메소드를 이용한 요소의 출력

System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());

for (String key : hm.keySet()) {

    System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));

}

 

// remove() 메소드를 이용한 요소의 제거

hm.remove("사십");

 

// iterator() 메소드와 get() 메소드를 이용한 요소의 출력

Iterator<String> keys = hm.keySet().iterator();

while (keys.hasNext()) {

    String key = keys.next();

    System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));

}

 

// replace() 메소드를 이용한 요소의 수정

hm.replace("이십", 200);

 

for (String key : hm.keySet()) {

    System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));

}

 

// size() 메소드를 이용한 요소의 총 개수

System.out.println("맵의 크기 : " + hm.size());

코딩연습 ▶

실행 결과
맵에 저장된 키들의 집합 : [이십, 삼십, 사십, 십]

키 : 이십, 값 : 20

키 : 삼십, 값 : 30

키 : 사십, 값 : 40

키 : 십, 값 : 10

 

키 : 이십, 값 : 20

키 : 삼십, 값 : 30

키 : 십, 값 : 10

 

키 : 이십, 값 : 200

키 : 삼십, 값 : 30

키 : 십, 값 : 10

 

맵의 크기 : 3

 

위의 예제에서 사용된 keySet() 메소드는 해당 맵에 포함된 모든 키 값들을 하나의 집합(Set)으로 반환해 줍니다.

 

위의 예제에서 사용한 for 문은 JDK 1.5부터 추가된 Enhanced for 문입니다.
이 반복문은 배열과 컬렉션 프레임워크에서 해당 인스턴스에 저장된 모든 요소를 순회해야할 경우에 자주 사용됩니다.
Hashtable<K, V> 클래스
Hashtable 클래스는 JDK 1.0부터 사용해 온 HashMap 클래스와 같은 동작을 하는 클래스입니다.

현재의 Hashtable 클래스는 HashMap 클래스와 마찬가지로 Map 인터페이스를 상속받습니다.

따라서 Hashtable 클래스에서 사용할 수 있는 메소드는 HashMap 클래스에서 사용할 수 있는 메소드와 거의 같습니다.

하지만 현재에는 기존 코드와의 호환성을 위해서만 남아있으므로, Hashtable 클래스보다는 HashMap 클래스를 사용하는 것이 좋습니다.

TreeMap<K, V> 클래스
TreeMap 클래스는 키와 값을 한 쌍으로 하는 데이터를 이진 검색 트리(binary search tree)의 형태로 저장합니다.

이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠릅니다.

JDK 1.2부터 제공된 TreeMap 클래스는 NavigableMap 인터페이스를 기존의 이진 검색 트리의 성능을 향상시킨 레드-블랙 트리(Red-Black tree)로 구현합니다.

 

TreeMap 클래스는 Map 인터페이스를 구현하므로, 중복된 키로는 값을 저장할 수 없습니다.

하지만 같은 값을 다른 키로 저장하는 것은 가능합니다.

 

다음 예제는 여러 TreeMap 메소드를 이용하여 맵을 생성하고 조작하는 예제입니다.

예제
TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

 

// put() 메소드를 이용한 요소의 저장

tm.put(30, "삼십");

tm.put(10, "십");

tm.put(40, "사십");

tm.put(20, "이십");

 

// Enhanced for 문과 get() 메소드를 이용한 요소의 출력

System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());

for (Integer key : tm.keySet()) {

    System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));

}

 

// remove() 메소드를 이용한 요소의 제거

tm.remove(40);

 

// iterator() 메소드와 get() 메소드를 이용한 요소의 출력

Iterator<Integer> keys = tm.keySet().iterator();

while (keys.hasNext()) {

    Integer key = keys.next();

    System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));

}

 

// replace() 메소드를 이용한 요소의 수정

tm.replace(20, "twenty");

 

for (Integer key : tm.keySet()) {

    System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));

}

 

// size() 메소드를 이용한 요소의 총 개수

System.out.println("맵의 크기 : " + tm.size());

코딩연습 ▶

실행 결과
맵에 저장된 키들의 집합 : [10, 20, 30, 40]

키 : 10, 값 : 십

키 : 20, 값 : 이십

키 : 30, 값 : 삼십

키 : 40, 값 : 사십

 

키 : 10, 값 : 십

키 : 20, 값 : 이십

키 : 30, 값 : 삼십

 

키 : 10, 값 : 십

키 : 20, 값 : twenty

키 : 30, 값 : 삼십

 

맵의 크기 : 3

HashMap<K, V> 메소드
HashMap<K, V> 클래스에서 제공하는 주요 메소드는 다음과 같습니다.

메소드	설명
void clear()	해당 맵(map)의 모든 매핑(mapping)을 제거함.
boolean containsKey(Object key)	해당 맵이 전달된 키를 포함하고 있는지를 확인함.
boolean containsValue(Object value)	해당 맵이 전달된 값에 해당하는 하나 이상의 키를 포함하고 있는지를 확인함.
V get(Object key)	
해당 맵에서 전달된 키에 대응하는 값을 반환함.

만약 해당 맵이 전달된 키를 포함한 매핑을 포함하고 있지 않으면 null을 반환함.

boolean isEmpty()	해당 맵이 비어있는지를 확인함.
Set<K> keySet()	해당 맵에 포함되어 있는 모든 키로 만들어진 Set 객체를 반환함.
V put(K key, V value)	해당 맵에 전달된 키에 대응하는 값으로 특정 값을 매핑함.
V remove(Object key)	해당 맵에서 전달된 키에 대응하는 매핑을 제거함.
boolean remove(Object key, Object value)	해당 맵에서 특정 값에 대응하는 특정 키의 매핑을 제거함.
V replace(K key, V value)	해당 맵에서 전달된 키에 대응하는 값을 특정 값으로 대체함.
boolean replace(K key, V oldValue, V newValue)	해당 맵에서 특정 값에 대응하는 전달된 키의 값을 새로운 값으로 대체함.
int size()	해당 맵의 매핑의 총 개수를 반환함.
 

자바 공식 문서에서는 키와 값으로 구성되는 데이터를 매핑(mapping) 또는 엔트리(entry)라고 기술하고 있습니다.
TreeMap<K, V> 메소드
TreeMap<K, V> 클래스에서 제공하는 주요 메소드는 다음과 같습니다.

메소드	설명
Map.Entry<K, V> ceilingEntry(K key)	
해당 맵에서 전달된 키와 같거나, 전달된 키보다 큰 키 중에서 가장 작은 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.

K ceilingKey(K key)	
해당 맵에서 전달된 키와 같거나, 전달된 키보다 큰 키 중에서 가장 작은 키를 반환함.

만약 해당하는 키가 없으면 null을 반환함.

void clear()	해당 맵(map)의 모든 매핑(mapping)을 제거함.
boolean containsKey(Object key)	해당 맵이 전달된 키를 포함하고 있는지를 확인함.
boolean containsValue(Object value)	해당 맵이 전달된 값에 해당하는 하나 이상의 키를 포함하고 있는지를 확인함.
NavigableMap<K, V> descendingMap()	해당 맵에 포함된 모든 매핑을 역순으로 반환함.
Set<Map.Entry<K, V>> entrySet()	해당 맵에 포함된 모든 매핑을 Set 객체로 반환함.
Map.Entry<K, V> firstEntry()	해당 맵에서 현재 가장 작은(첫 번째) 키와 그에 대응하는 값의 엔트리를 반환함.
K firstKey()	해당 맵에서 현재 가장 작은(첫 번째) 키를 반환함.
Map.Entry<K, V> floorEntry(K key)	
해당 맵에서 전달된 키와 같거나, 전달된 키보다 작은 키 중에서 가장 큰 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.

K floorKey(K key)	
해당 맵에서 전달된 키와 같거나, 전달된 키보다 작은 키 중에서 가장 큰 키를 반환함.

만약 해당하는 키가 없으면 null을 반환함.

V get(Object key)	
해당 맵에서 전달된 키에 대응하는 값을 반환함.

만약 해당 맵이 전달된 키를 포함한 매핑을 포함하고 있지 않으면 null을 반환함.

SortedMap<K, V> headMap(K toKey)	해당 맵에서 전달된 키보다 작은 키로 구성된 부분만을 반환함.
Map.Entry<K, V> higherEntry(K key)	
해당 맵에서 전달된 키보다 작은 키 중에서 가장 큰 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.

K higherKey(K key)	
해당 맵에서 전달된 키보다 작은 키 중에서 가장 큰 키를 반환함.

만약 해당하는 키가 없으면 null을 반환함.

Set<K> keySet()	해당 맵에 포함되어 있는 모든 키로 만들어진 Set 객체를 반환함.
Map.Entry<K, V> lastEntry()	해당 맵에서 현재 가장 큰(마지막) 키와 그에 대응하는 값의 엔트리를 반환함.
K lastKey()	해당 맵에서 현재 가장 큰(마지막) 키를 반환함.
Map.Entry<K, V> lowerEntry(K key)	
해당 맵에서 전달된 키보다 큰 키 중에서 가장 작은 키와 그에 대응하는 값의 엔트리를 반환함. 만약 해당하는 키가 없으면 null을 반환함.

K lowerKey(K key)	
해당 맵에서 전달된 키보다 큰 키 중에서 가장 작은 키를 반환함.

만약 해당하는 키가 없으면 null을 반환함.

Map.Entry<K, V> pollFirstEntry()	해당 맵에서 현재 가장 작은(첫 번째) 키와 그에 대응하는 값의 엔트리를 반환하고, 해당 엔트리를 맵에서 제거함.
Map.Entry<K, V> pollLastEntry()	해당 맵에서 현재 가장 큰(마지막) 키와 그에 대응하는 값의 엔트리를 반환하고, 해당 엔트리를 맵에서 제거함.
V put(K key, V value)	해당 맵에 전달된 키에 대응하는 값으로 특정 값을 매핑함.
V remove(Object key)	해당 맵에서 전달된 키에 대응하는 매핑을 제거함.
boolean remove(K key, V value)	해당 맵에서 특정 값에 대응하는 특정 키의 매핑을 제거함.
V replace(K key, V value)	해당 맵에서 전달된 키에 대응하는 값을 특정 값으로 대체함.
boolean replace(K key, V oldValue, V newValue)	해당 맵에서 특정 값에 대응하는 전달된 키의 값을 새로운 값으로 대체함.
int size()	해당 맵의 매핑의 총 개수를 반환함.
SortedMap<K, V> subMap(K fromKey, K toKey)	
해당 맵에서 fromKey부터 toKey까지로 구성된 부분만을 반환함.

이때 fromKey는 포함되나, toKey는 포함되지 않음.

SortedMap<K, V> tailMap(K fromKey)	해당 맵에서 fromKey와 같거나, fromKey보다 큰 키로 구성된 부분만을 반환함.
 

Map.Entry 인터페이스는 Map 인터페이스의 내부 인터페이스로 맵에 저장되는 엔트리의 조작을 위한 메소드가 정의되어 있습니다.