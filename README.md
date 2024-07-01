# roadrunner

애니메이션 RoadRunner 에서 영감을 얻었습니다.

Paper 플러그인을 이용해 마인 카트만큼 빠른 속도로 달리면서도 배고픔이 줄어들지 않는 플러그인을 만들 예정입니다.

Paper 이벤트 핸들러를 통해 달리는 중일 때 속도 보정을 하였습니다. 이유는 모르겠지만 걷기 속도를 조정하는 방식으로 해야했습니다.

배고픔 수치가 Hunger 아닌 exhaustion 이었습니다. 정확하게 측정하기 어려워 동작마다 피로도를 출력하게 함으로써 동작을 검증했습니다.

# 참고자료

paper 프로젝트 셋팅 자료 및 참고자료

https://docs.papermc.io/paper/dev/project-setup

Paper Java doc
https://jd.papermc.io/paper/1.21/

https://jd.papermc.io/paper/1.21/org/bukkit/event/player/PlayerMoveEvent.html

https://jd.papermc.io/paper/1.21/org/bukkit/event/entity/EntityExhaustionEvent.html

https://jd.papermc.io/paper/1.21/org/bukkit/entity/Player.html

페이퍼 테스트 자료

https://github.com/jpenilla/run-task