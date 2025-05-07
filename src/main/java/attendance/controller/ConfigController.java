package attendance.controller;

import attendance.model.Attendance;
import attendance.model.AttendanceManager;
import attendance.util.CsvReader;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ConfigController {
    public static AttendanceManager config() {
        List<String[]> inputs = CsvReader.readFile(System.getProperty("user.dir") + "/src/main/resources/attendances.csv");
        AttendanceManager manager = new AttendanceManager();
        for (String[] input : inputs) {
            LocalDateTime date = LocalDateTime.parse(input[1], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            manager.put(input[0], new Attendance(date));
        }
        return manager;
    }
}
