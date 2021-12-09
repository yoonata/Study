"""
turtle 모듈

turtle 모듈은 파이썬에서 기본적으로 제공하는 기본 모듈로 코드에 따라 그림을 그려주는 모듈입니다.
math 모듈과 마찬가지로 turtle 모듈도 기본 모듈이므로, 별도의 설치과정 없이 import 만으로 바로 사용할 수 있습니다.
"""

"""
사용 방법
"""

#import turtle

#또는

#from turtle import *

"""
다음 예제는 turtle 모듈을 사용하여 간단한 사각형을 그리는 예제입니다.
"""

"""
예제
"""

from turtle import *

forward(100)

right(90)

forward(100)

right(90)

forward(100)

right(90)

forward(100)

mainloop()

"""
다음 예제는 turtle 모듈을 사용하여 기하학적인 그림을 그리는 예제입니다.
"""

"""
예제
"""

from turtle import *

for i in range (20):

    forward(100)

    right(90)

    forward(100)

    right(90)

    forward(100)

    right(90)

    forward(100)

    right(72)

mainloop()

"""
이처럼 turtle 모듈을 사용하면 코드에 따라 멋진 기하학적인 그림도 출력할 수 있습니다.
만약 그림이 생성되고 나서 바로 창이 닫혀서 확인하기가 힘들다면 코드의 맨 마지막에 mainloop() 를 추가하면 창이 닫히지 않습니다.
"""