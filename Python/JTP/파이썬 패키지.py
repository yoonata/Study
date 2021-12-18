패키지란 무엇인가?
패키지(Packages)는 도트(.)를 사용하여 파이썬 모듈을 계층적(디렉터리 구조)으로 관리할 수 있게 해준다. 예를 들어 모듈 이름이 A.B인 경우에 A는 패키지 이름이 되고 B는 A 패키지의 B모듈이 된다.

※ 파이썬에서 모듈은 하나의 .py 파일이다.

파이썬 패키지는 디렉터리와 파이썬 모듈로 이루어지며 구조는 다음과 같다.

가상의 game 패키지 예

game/
    __init__.py
    sound/
        __init__.py
        echo.py
        wav.py
    graphic/
        __init__.py
        screen.py
        render.py
    play/
        __init__.py
        run.py
        test.py
game, sound, graphic, play는 디렉터리이고 확장자가 .py인 파일은 파이썬 모듈이다. game 디렉터리가 이 패키지의 루트 디렉터리이고 sound, graphic, play는 서브 디렉터리이다.

※ __init__.py 파일은 조금 특이한 용도로 사용하는데 뒤에서 자세하게 다룰 것이다.

간단한 파이썬 프로그램이 아니라면 이렇게 패키지 구조로 파이썬 프로그램을 만드는 것이 공동 작업이나 유지 보수 등 여러 면에서 유리하다. 또한 패키지 구조로 모듈을 만들면 다른 모듈과 이름이 겹치더라도 더 안전하게 사용할 수 있다.

패키지 만들기
이제 위 예와 비슷한 game 패키지를 직접 만들어 보며 패키지에 대해서 알아보자.

패키지 기본 구성 요소 준비하기

1. C:/doit 디렉터리 밑에 game 및 기타 서브 디렉터리를 생성하고 .py 파일들을 다음과 같이 만들어 보자(만약 C:/doit 디렉터리가 없다면 먼저 생성하고 진행하자).

C:/doit/game/__init__.py
C:/doit/game/sound/__init__.py
C:/doit/game/sound/echo.py
C:/doit/game/graphic/__init__.py
C:/doit/game/graphic/render.py
2. 각 디렉터리에 __init__.py 파일을 만들어 놓기만 하고 내용은 일단 비워 둔다.

3. echo.py 파일은 다음과 같이 만든다.

# echo.py
def echo_test():
    print("echo")
4. render.py 파일은 다음과 같이 만든다.

# render.py
def render_test():
    print("render")
5. 다음 예제를 수행하기 전에 우리가 만든 game 패키지를 참조할 수 있도록 명령 프롬프트 창에서 set 명령어로 PYTHONPATH 환경 변수에 C:/doit 디렉터리를 추가한다. 그리고 파이썬 인터프리터(Interactive shell)를 실행한다.

C:\> set PYTHONPATH=C:/doit
C:\> python
Type "help", "copyright", "credits" or "license" for more information.
>>> 
여기까지 준비가 되었다면 다음을 따라 해 보자.

중요 공지

아래의 실습은 반드시 명령 프롬프트에서 파이썬 인터프리터를 실행하여 진행해야 한다. 많은 분들이 IDLE 셸 또는 비주얼 스튜디오의 파이썬 셸에서 아래의 예제들을 실행하여 오류를 만난다.

패키지 안의 함수 실행하기
자, 이제 패키지를 사용하여 echo.py 파일의 echo_test 함수를 실행해 보자. 패키지 안의 함수를 실행하는 방법은 다음 3가지가 있다. 다음 예제는 import 예제이므로 하나의 예제를 실행하고 나서 다음 예제를 실행할 때에는 반드시 인터프리터를 종료하고 다시 실행해야 한다. 인터프리터를 다시 시작하지 않을 경우 이전에 import한 것들이 메모리에 남아 있어 엉뚱한 결과가 나올 수 있다(윈도우의 경우 인터프리터 종료는 Ctrl+Z).

첫 번째는 echo 모듈을 import하여 실행하는 방법으로, 다음과 같이 실행한다.

※ echo 모듈은 echo.py 파일이다.

>>> import game.sound.echo
>>> game.sound.echo.echo_test()
echo
두 번째는 echo 모듈이 있는 디렉터리까지를 from ... import하여 실행하는 방법이다.

>>> from game.sound import echo
>>> echo.echo_test()
echo
세 번째는 echo 모듈의 echo_test 함수를 직접 import하여 실행하는 방법이다.

>>> from game.sound.echo import echo_test
>>> echo_test()
echo
하지만 다음과 같이 echo_test 함수를 사용하는 것은 불가능하다.

※ 다음 예제는 반드시 파이썬 인터프리터를 종료하고 다시 실행해야 한다.

>>> import game
>>> game.sound.echo.echo_test()
Traceback (most recent call last):
    File "<stdin>", line 1, in <module>
AttributeError: 'module' object has no attribute 'sound'
import game을 수행하면 game 디렉터리의 __init__.py에 정의한 것만 참조할 수 있다.

또 다음처럼 echo_test 함수를 사용하는 것도 불가능하다.

>>> import game.sound.echo.echo_test
Traceback (most recent call last):
    File "<stdin>", line 1, in <module>
ImportError: No module named echo_test
도트 연산자(.)를 사용해서 import a.b.c처럼 import할 때 가장 마지막 항목인 c는 반드시 모듈 또는 패키지여야만 한다.

__init__.py 의 용도
__init__.py 파일은 해당 디렉터리가 패키지의 일부임을 알려주는 역할을 한다. 만약 game, sound, graphic 등 패키지에 포함된 디렉터리에 __init__.py 파일이 없다면 패키지로 인식되지 않는다.

※ python3.3 버전부터는 __init__.py 파일이 없어도 패키지로 인식한다(PEP 420). 하지만 하위 버전 호환을 위해 __init__.py 파일을 생성하는 것이 안전한 방법이다.

다음을 따라 해 보자.

>>> from game.sound import *
>>> echo.echo_test()
Traceback (most recent call last):
    File "<stdin>", line 1, in <module>
NameError: name 'echo' is not defined
뭔가 이상하지 않은가? 분명 game.sound 패키지에서 모든 것(*)을 import하였으므로 echo 모듈을 사용할 수 있어야 할 것 같은데 echo라는 이름이 정의되지 않았다는 이름 오류(NameError)가 발생했다.

이렇게 특정 디렉터리의 모듈을 *를 사용하여 import할 때에는 다음과 같이 해당 디렉터리의 __init__.py 파일에 __all__ 변수를 설정하고 import할 수 있는 모듈을 정의해 주어야 한다.

# C:/doit/game/sound/__init__.py
__all__ = ['echo']
여기에서 __all__이 의미하는 것은 sound 디렉터리에서 * 기호를 사용하여 import할 경우 이곳에 정의된 echo 모듈만 import된다는 의미이다.

※ 착각하기 쉬운데 from game.sound.echo import * 는 __all__과 상관없이 무조건 import된다. 이렇게 __all__과 상관없이 무조건 import되는 경우는 from a.b.c import * 에서 from의 마지막 항목인 c가 모듈인 경우이다.

위와 같이 __init__.py 파일을 변경한 후 위 예제를 수행하면 원하던 결과가 출력되는 것을 확인할 수 있다.

>>> from game.sound import *
>>> echo.echo_test()
echo
relative 패키지
만약 graphic 디렉터리의 render.py 모듈이 sound 디렉터리의 echo.py 모듈을 사용하고 싶다면 어떻게 해야 할까? 다음과 같이 render.py를 수정하면 가능하다.

# render.py
from game.sound.echo import echo_test
def render_test():
    print("render")
    echo_test()
from game.sound.echo import echo_test 문장을 추가하여 echo_test 함수를 사용할 수 있도록 수정했다.

이렇게 수정한 후 다음과 같이 수행해 보자.

>>> from game.graphic.render import render_test
>>> render_test()
render
echo
이상 없이 잘 수행된다.

위 예제처럼 from game.sound.echo import echo_test를 입력해 전체 경로를 사용하여 import할 수도 있지만 다음과 같이 relative하게 import하는 것도 가능하다.

# render.py
from ..sound.echo import echo_test

def render_test():
    print("render")
    echo_test()
from game.sound.echo import echo_test가 from ..sound.echo import echo_test로 변경되었다. 여기에서 ..은 render.py 파일의 부모 디렉터리를 의미한다. 따라서 render.py 파일의 부모 디렉터리는 game이므로 위와 같은 import가 가능한 것이다.

※ render.py 파일의 현재 디렉터리는 graphic이고 부모 디렉터리는 game이다.

relative한 접근자에는 다음과 같은 것이 있다.

.. – 부모 디렉터리
. – 현재 디렉터리