package attendance.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String getFunctionKey() {
        System.out.printf("오늘은 %d월 %d일입니다. 기능을 선택해 주세요.\n", java.time.LocalDate.now().getMonthValue(), java.time.LocalDate.now().getDayOfMonth());
        System.out.println("""
                1. 출석 확인
                2. 출석 수정
                3. 크루별 출석 기록 확인
                4. 제적 위험자 확인
                Q. 종료
                """);
        return readLine();
    }

    public static String inputNickname() {
        System.out.println("닉네임을 입력해주세요.");
        return readLine();
    }
}
