# java-attendance

출석 미션 저장소

## 출석 기록 확인

- [ ] 출석 기록 확인

## 기능 선택

- [ ] 오늘 날짜와 기능 선택 요구
    - [ ] 옵션이 1,2,3,4,Q(기능 선택 항목) 중 아무것도 해당되지 않을 경우, 예외 처리

## 출석 확인
- [ ] 출석 하는 날짜(오늘)가 주말 혹은 공휴일일 경우, 예외 처리

- [ ] 닉네임을 입력받는다.
  - [ ] 등록 되지 않았을 경우 예외 처리 
  - [ ] 이미 오늘 날짜의 출석 기록이 있는 경우, 예외 처리

- [ ] 등교 시간을 입력받는다.
    - [ ] 시간을 잘못된 형식으로 입력한 경우, 예외 처리
    - [ ] 등교 시간이 캠퍼스 운영 시간( 08:00~23:00 )이 아닌경우, 예외 처리

- [ ] 출석 기록을 출력한다.

## 출석 수정

- [ ] 닉네임을 입력 받는다.
  - [ ] 등록 되지 않았을 경우 예외 처리
  
- [ ] 수정하려는 날짜를 입력 받는다.
  - [ ] 미래 날짜로 출석을 수정하는 경우, 예외처리
  - [ ] 주말 혹은 공휴일의 출석을 수정 하는 경우, 예외 처리
  - [ ] 수정하려는 날짜의 기록이 없는 경우, 예외처리

- [ ] 변경할 시간을 입력 받는다.
  - [ ] 시간을 잘못된 형식으로 입력한 경우, 예외 처리

- [ ] 수정 후 변경 전/후 출석 기록 확인

## 크루별 출석 기록 확인

- [ ] 닉네임을 입력 받는다.
    - [ ] 등록 되지 않았을 경우 예외 처리

- [ ] 전날까지의 크루 출석 기록 출력
- [ ] 출석, 지각, 결석 총계 출력
- [ ] 경고/면담/제적 대상자 출력

## 제적 위험자 확인

- [ ] 전날까지의 크루 출석 기록을 바탕으로 제적 위험자 출력
- [ ] 제적, 면담, 경고 대상자 순으로 출력 (지각을 결석으로 간주해 내림차순)
- [ ] 출석 상태가 같을 시 닉네임으로 오름차순