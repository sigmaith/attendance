package attendance.controller;

import attendance.model.AttendanceManager;

public class MainController {
    private AttendanceManager attendanceManager;

    public void run() {
        System.out.println(System.getProperty("user.dir"));
        attendanceManager = ConfigController.config();
    }
}
