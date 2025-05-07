package attendance.model;

public enum Subject {
    WARNING(2, "경고 대상자입니다."), // 2회 이상
    INTERVIEW(3, "경고 대상자입니다."), // 3회 이상
    EXPULSION(5, "제적 대상자입니다."), // 5회 초과
    ;

    private Subject(final int number, final String description) {
        this.number = number;
        this.description = description;
    }

    private int number;
    private String description;
}
