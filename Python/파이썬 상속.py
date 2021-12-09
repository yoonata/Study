"""
상속(Inheritance)

말, 개, 고양이, 닭 등의 공통점이 무엇일까요? 바로 동물이라는 점입니다.
즉, 말, 개, 고양이, 닭 등은 서로 다른 종이지만 ‘동물’이라는 공통점을 가지고 있는 것입니다.
이것을 프로그래밍 관점에서 살펴보면 말, 개, 고양이, 닭 등은 모두 ‘동물’이라는 공통점을 상속받았다고 이해할 수 있는 것입니다.

부모 클래스(superclass)와 자식 클래스(subclass)

자식은 부모의 형질을 유전적인 방법을 통해 물려받습니다.
앞서 살펴본 동물은 부모 클래스가 되고 말, 개, 고양이, 닭 등은 동물 클래스의 자식 클래스가 되는 것입니다.
"""

"""
예제
"""

import math

class Animal:

    def __init__(self, age, height, color, xpos, ypos):

        self.age = age

        self.height = height

        self.color = color

        self.xposition = xpos

        self.yposition = ypos

        self.velocity = 0

    def sound(self):

        pass

class Horse(Animal):

    def __init__(self, age, height, color, xpos, ypos):

        Animal.__init__(self, age, height, color, xpos, ypos)

    def sound(self):

        print('Neigh')

    def run(self, xdistance, ydistance, time):

        self.xposition += xdistance

        self.yposition += ydistance

        total_distance = math.sqrt((xdistance + xdistance) * (ydistance + ydistance))

        self.velocity = total_distance/time

class Dog(Animal):

    def __init__(self, age, height, color, xpos, ypos):

        Animal.__init__(self, age, height, color, xpos, ypos)

    def sound(self):

        print('Bow-Wow')

if __name__ == '__main__':

    danbi = Horse(5, 160, 'brown', 0, 0)

    choco = Dog(10, 100, 'black', 50, 30)

    danbi.sound()

    choco.sound()

"""
실행 결과
"""

#Neigh

#Bow-Wow

"""
위의 예제에서는 Animal이라는 이름의 클래스를 정의하면서 생성자를 정의합니다.
그 후에 Animal 클래스를 상속받은 Horse 클래스나 Dog 클래스를 정의할 때는 생성자를 따로 정의할 필요없이 부모 클래스의 생성자를 불러오면 됩니다.
이때 만약 자식 클래스가 다른 특성들을 더 가지게 하고 싶다면 부모 클래스의 생성자를 호출한 뒤 특성을 추가하면 됩니다.

오버라이딩(Overriding)

오버라이딩(Overriding)이란 부모 클래스로부터 상속받은 특성을 자식 클래스에서 재정의하는 것을 의미합니다.
위의 예제에서 자식 클래스의 생성자는 부모 클래스의 생성자를 오버라이딩하여 작성된 것입니다.

동적바인딩(Dynamic Binding)

앞서 살펴본 예제의 실행 결과는 다음과 같습니다.
"""

"""
예제
"""

if __name__ == '__main__':

    danbi = Horse(5, 160, 'brown', 0, 0)

    choco = Dog(10, 100, 'black', 50, 30)

    danbi.sound()

    choco.sound()

"""
실행 결과
"""

#Neigh

#Bow-Wow

"""
위의 예제에서는 두 개의 객체를 생성하고, 각각의 객체에서 sound() 함수를 호출합니다.
이때 실행 결과는 danbi 객체의 경우에는 말 울음소리(Neigh)가, choco 객체의 경우에는 강아지 울음소리(Bow-Wow)가 출력됩니다.
sound() 함수는 Horse 클래스에 존재하고 Dog 클래스에 존재하며 Animal 클래스에도 존재합니다.
따라서 sound() 함수를 호출할 때 어떤 클래스에 존재하는 sound() 함수를 호출해야 할지를 결정해야 합니다.
이처럼 프로그램의 실행 시간(runtime)에 그 성격이 결정되는 것을 동적 바인딩(Dynamic Binding)이라고 합니다.

다중 상속(Multiplex Inheritance)

다중 상속이란 여러 개의 부모 클래스로부터 동시에 특성을 물려받는 것을 의미합니다.
C++이나 JAVA 등 일반적인 프로그래밍 언어에서는 보통 다중상속을 허용하지 않고 있습니다.
하지만 파이썬에서는 이러한 다중 상속을 허용하며, 자식 클래스를 생성할 때 클래스명 뒤 괄호 안에 특성을 물려받고 싶은 부모 클래스들을 콤마(,)를 사용하여 나열하면 됩니다.
"""

"""
예제
"""

#class WolfDog(Wolf, Dog):