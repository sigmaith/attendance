package attendance.model;

import java.time.LocalDateTime;

public class Attendance {
    private LocalDateTime date;
    private Status status;

    public LocalDateTime date() {
        return date;
    }

    public Attendance(LocalDateTime date) {
        this.date = date;
        //TODO: 출석, 지각, 결석 로직
    }
}
