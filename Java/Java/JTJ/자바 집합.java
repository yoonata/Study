집합 자료형은 어떻게 만들까?
집합 자료형은 다음과 같이 HashSet을 사용하여 만들 수 있다.

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
    }
}
Set 자료형

Set 자료형에는 HashSet, TreeSet, LinkedHashSet 등의 Set 인터페이스를 구현한 자료형이 있다. 여기서 말하는 Set 자료형은 인터페이스인데 인터페이스에 대해서는 뒤에서 자세히 다루도록 한다.

집합 자료형의 특징
자, 그런데 위에서 살펴본 출력 결과가 좀 이상하지 않은가? 분명 "H", "e", "l", "l", "o" 라는 문자열 배열로 HashSet 자료형을 만들었는데 출력된 자료형에는 l 문자가 하나 빠져 있고 순서도 뒤죽박죽이다. 그 이유는 집합 자료형에는 다음과 같은 2가지 큰 특징이 있기 때문이다.

중복을 허용하지 않는다.
순서가 없다(Unordered).
리스트나 배열은 순서가 있기(ordered) 때문에 인덱싱을 통해 자료형의 값을 얻을 수 있지만 집합 자료형은 순서가 없기(unordered) 때문에 인덱싱으로 값을 얻을 수 없다. 이는 마치 맵 자료형과 비슷하다. 맵 자료형 역시 순서가 없는 자료형이라 인덱싱을 지원하지 않는다.

※ 중복을 허용하지 않는 집합 자료형의 특징은 자료형의 중복을 제거하기 위한 필터 역할로 종종 사용하기도 한다.

교집합, 합집합, 차집합 구하기
집합 자료형을 정말 유용하게 사용하는 경우는 교집합, 합집합, 차집합을 구할 때이다.

우선 다음과 같이 2개의 집합 자료형을 만든 후 따라 해 보자. s1은 1부터 6까지의 값을 가지게 되었고, s2는 4부터 9까지의 값을 가지게 되었다.

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
    }
}
※ 제네릭스로 int를 사용할 경우에는 int의 Wrapper 클래스인 Integer를 대신 사용한다.

1. 교집합

s1과 s2의 교집합을 구해 보자.

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력
    }
}
retainAll 메소드를 이용하면 교집합을 간단히 구할 수 있다. s1의 데이터를 유지하기 위해 s1으로 intersection이라는 HashSet 객체를 Copy하여 생성하였다. 만약 intersection 대신 s1에 retainAll 메소드를 사용하면 s1의 내용이 변경될 것이다.

retainAll 메소드로 교집합을 수행한 후 intersection을 출력하니 교집합에 해당되는 [4, 5, 6]이 출력되었다.

2. 합집합

합집합은 다음과 같이 구할 수 있다. 이때 4, 5, 6처럼 중복해서 포함된 값은 한 개씩만 표현된다.

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
    }
}
합집합은 addAll 메소드를 사용하여 구할 수 있다. 합집합의 결과로 [1, 2, 3, 4, 5, 6, 7, 8, 9]을 출력한다.

3. 차집합

차집합은 다음과 같이 구할 수 있다.

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력
    }
}
차집합은 removeAll 메소드를 사용하여 구할수 있다. 차집합의 결과로 [1, 2, 3]을 출력한다.

집합 자료형 관련 함수들
값 추가하기(add)
집합 자료형에 값을 추가할 때에는 add 메소드를 사용한다.

import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
값 여러 개 추가하기(addAll)
여러 개의 값을 한꺼번에 추가할 때는 다음과 같이 addAll 메소드를 사용한다.

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.addAll(Arrays.asList("To", "Java"));
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
※ 합집합을 구할 때도 addAll을 사용했다.

특정 값 제거하기(remove)
특정 값을 제거하고 싶을 때는 다음과 같이 remove 메소드를 사용한다.

import java.util.Arrays;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set.remove("To");
        System.out.println(set);  // [Java, Jump] 출력
    }
}
TreeSet과 LinkedHashSet

Set 자료형은 순서가 없다는 특징이 있다. 하지만 가끔은 Set에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 오름차순으로 정렬된 데이터를 가져오고 싶을 수도 있을 것이다. 이런경우에는 TreeSet과 LinkedHashSet을 사용하는 것이 유리하다.

TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다.
LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.