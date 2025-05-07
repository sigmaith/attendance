package attendance.controller;

import attendance.model.AttendanceManager;
import attendance.view.InputView;

import static attendance.view.InputView.getFunctionKey;

public class MainController {
    private AttendanceManager attendanceManager;

    public void run() {

        attendanceManager = ConfigController.config();
        String function = getFunctionKey();
        while (!function.equalsIgnoreCase("Q")) {
            switch (function) {
                case "1" -> checkAttendance(attendanceManager);
                case "2" -> updateAttendance(attendanceManager);
                case "3" -> checkCrewAttendance(attendanceManager);
                case "4" -> checkAtRiskCrew(attendanceManager);
                default -> System.out.println("잘못된 입력입니다.");
            }
            function = getFunctionKey();
        }
    }

    private void checkAttendance(AttendanceManager attendanceManager) {
        // Implement the logic to check attendance
        String nickname = InputView.inputNickname();
        if (!attendanceManager.has(nickname)) {
            throw new IllegalArgumentException("[ERROR] 등록되지 않은 닉네임입니다.");
        }
    }

    private void updateAttendance(AttendanceManager attendanceManager) {
        // Implement the logic to update attendance
    }

    private void checkCrewAttendance(AttendanceManager attendanceManager) {
        // Implement the logic to check crew attendance
    }

    private void checkAtRiskCrew(AttendanceManager attendanceManager) {
        // Implement the logic to check at-risk crew
    }
}
