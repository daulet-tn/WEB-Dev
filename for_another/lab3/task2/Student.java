public class Student {

    // ===== ENUM =====
    public enum Status {
        ENROLLED,
        SUSPENDED,
        GRADUATED
    }

    // ===== STATIC NON-FINAL =====
    // общее количество созданных студентов
    private static int studentCount;

    // ===== STATIC FINAL =====
    // константа — максимальная оценка
    public static final int MAX_GRADE = 100;

    // ===== FINAL NON-STATIC =====
    // уникальный ID студента (нельзя изменить)
    private final int studentId;

    // ===== READ-ONLY FIELD =====
    // имя нельзя изменить после создания
    private final String name;

    private int grade;
    private Status status;

    // ===== INITIALIZATION BLOCK =====
    {
        studentCount++;          // увеличиваем счётчик студентов
        status = Status.ENROLLED; // каждый студент по умолчанию зачислен
    }

    // ===== CONSTRUCTOR 1 =====
    public Student(int studentId, String name) {
        this.studentId = studentId; // this №1
        this.name = name;
        this.grade = 0;
    }

    // ===== CONSTRUCTOR 2 (OVERLOADING + this) =====
    public Student(int studentId, String name, int grade) {
        this(studentId, name);   // this №2
        this.grade = grade;
    }

    // ===== METHOD OVERLOADING =====
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= MAX_GRADE) {
            this.grade = grade;
        }
    }

    public void setGrade(double grade) {
        setGrade((int) grade);
    }

    // ===== GETTERS (READ-ONLY ACCESS) =====
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Status getStatus() {
        return status;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}