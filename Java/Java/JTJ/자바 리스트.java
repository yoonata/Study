리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.

리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고 동적으로 변한다는 점이다. 배열은 크기가 정해져 있다. 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을 수는 없다. 하지만 리스트는 크기가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있다.

박찬호 선수의 투구스피드를 저장해야 한다고 가정해 보자. 배열을 이용하여 투구수를 저장할 수 있을까? 1회에 투구수가 3개도 될 수 있고 100개도 될 수 있지 않은가? 프로그래밍 시 크기를 알 수 있는 상황도 있지만 명확한 크기를 알 수 없는 경우가 더 많다. 이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 것이 유리하다.

ArrayList
List 자료형 중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자.

List 자료형

List 자료형에는 ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형이 있다. 여기서 말하는 List 자료형은 인터페이스인데 인터페이스에 대해서는 뒤에서 자세히 다루도록 한다.

add
박찬호 선수가 총 3번의 투구를 138, 129, 142(km) 의 속도록 던졌다면 다음과 같이 코드를 작성할 수 있다.

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
    }
}
※ ArrayList를 사용하기 위해서는 import java.util.ArrayList와 같이 ArrayList를 먼저 import해야 한다.

ArrayList 객체인 pitches에 add 라는 메소드를 이용하여 투구 스피드를 저장했다. 만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 삽입할 위치를 파라미터로 넘겨주어야 한다.

pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
만약 2번 째 위치에 133을 삽일 할 경우에는 다음과 같이 코딩하면 된다.

pitches.add(1, "133");
제네릭스

자바는 J2SE 5.0 버전 이후부터 ArrayList<String> pitches = new ArrayList<>(); 처럼 객체를 포함하는 자료형도 어떤 객체를 포함하는지에 대해서 명확하게 표현할 것을 권고하고 있다. 인텔리제이에서 위와 같이 코딩하면 명확한 타입을 명시하라는 warning이 표시될 것이다. 이 부분에 대한 자세한 내용은 다음 장인 제네릭스에서 자세하게 설명한다.

get
박찬호 선수의 2번째 투구 스피드를 출력하고 싶다면 다음과 같이 한다.

System.out.println(pitches.get(1));
ArrayList의 get 메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.

size
size 메소드는 ArrayList의 갯수를 리턴한다.

System.out.println(pitches.size());
위 코드를 실행하면 pitches에 담긴 갯수가 출력된다.

contains
contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.

System.out.println(pitches.contains("142"));
pitches 객체는 142 값을 포함하고 있으므로 true가 출력된다.

remove
remove 메소드에는 2가지 방식이 있다. (이름은 같지만 입력파라미터가 다르다)

remove(객체)
remove(인덱스)
첫번째 remove(객체)의 경우는 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과(true, false)를 리턴한다.

System.out.println(pitches.remove("129"));
수행결과는 다음과 같다.

true
"129"라는 항목이 성공적으로 삭제되고 true를 리턴한다.

두 번째 remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다.

System.out.println(pitches.remove(0));
수행결과는 다음과 같다.

138
pitches의 첫번째 항목은 "138"이므로 "138"이 삭제된 후 "138"을 리턴한다.

다양한 방법으로 ArrayList 만들기
ArrayList의 add 메소드를 사용하면 다음처럼 ArrayList 객체에 요소를 추가할 수 있다.

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();  // 제네릭스를 사용한 표현
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);  // [138, 129, 142] 출력
    }
}
하지만 다음처럼 이미 데이터가 존재할 경우에는 보다 편하게 ArrayList를 생성할 수 있다.

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);  // [138, 129, 142] 출력
    }
}
java.util.Arrays 클래스의 asList 메소드를 사용하면 이미 존재하는 문자열 배열로 ArrayList를 생성할 수 있다.

또는 다음과 같이 String 배열 대신 String 자료형을 여러개 전달하여 생성할 수도 있다.

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);
    }
}
String.join
앞에서 "138", "129", "142" 의 요소로 이루어진 ArrayList를 만들어 보았다. 그렇다면 이렇게 만들어진 ArrayList의 각 요소를 콤마(",")로 구분하여 다음과 같은 하나의 문자열로 만들 수 있는 방법이 있을까?

138,129,142
콤마를 각 요소 중간에 삽입하려면 다음과 같이 코드를 작성해야 한다.

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches.size(); i++) {
            result += pitches.get(i);
            result += ",";  // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println(result);  // 138,129,142 출력
    }
}
위 예는 pitches를 갯수만큼 루프를 돌면서 뒤에 콤마를 더하고 최종적으로 마지막 콤마를 제거하는 방법이다. 위 예에서도 볼 수 있듯이 리스트의 각각의 요소 사이에 구분자를 끼워넣어 하나의 문자열로 만드는 것은 꽤 까다로운 일이다.

하지만 String.join을 사용하면 다음처럼 매우 간단하게 처리할 수 있다.

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
String.join("구분자", 리스트객체)와 같이 사용하여 리스트의 각 요소에 "구분자"를 삽입하여 하나의 문자열로 만들 수 있다.

String.join은 다음처럼 문자열 배열에도 사용할 수 있다.

public class Sample {
    public static void main(String[] args) {
        String[] pitches = new String[]{"138", "129", "142"};
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
※ String.join 메소드는 Java 8 버전부터 사용할 수 있다.

리스트 정렬하기
이번에는 "138", "129", "142"의 요소로 이루어진 ArrayList를 순서대로 정렬해 보자. 순서대로 정렬하기 위해서는 다음처럼 리스트의 sort 메소드를 사용해야 한다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
    }
}
sort 메소드에는 정렬기준을 파라미터로 전달해야 한다. 정렬기준에는 다음처럼 오름차순, 내림차순이 있다.

오름차순(순방향) 정렬 - Comparator.naturalOrder()
내림차순(역방향) 정렬 - Comparator.reverseOrder()
sort 메소드로 정렬후에 pitches를 출력하면 [129, 138, 142] 처럼 오름차순으로 정렬되어 출력되는 것을 확인할수 있다.

※ List.sort 메소드는 Java 8 버전부터 사용할 수 있다.