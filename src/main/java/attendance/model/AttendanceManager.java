package attendance.model;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AttendanceManager {
    private Map<String, TreeSet<Attendance>> manager = new HashMap<>();

    public void put(String name, Attendance attendance) {
        manager.putIfAbsent(name, new TreeSet<>((a, b) -> a.date().compareTo(b.date())));
        manager.get(name).add(attendance);
    }

    public boolean has(String name) {
        return manager.containsKey(name);
    }
}
