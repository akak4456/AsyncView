## AsyncView

만약에 onDraw 에 매우 많은 연산을 하게 된다면 view 가 그리는데 시간이 걸려서 사용성을 해친다.

그렇다면 매우 많은 연산을 background thread 에서 처리하게 되면 어떻게 될까? 이를 알아보기 위한 연습 프로젝트다.

## AsyncViewSimple

무거운 연산은 Thread 에 옮기고 만약에 무거운 연산이 모두 끝났을 경우 invalidate 를 호출해서 redraw 하는 빙식
