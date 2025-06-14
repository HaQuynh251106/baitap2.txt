package entity;


public class Result {
    private int id;
    private double mark;
    private int studentId;
    private int subjectId;

    // Constructor không tham số
    public Result() {
    }

    // Constructor đầy đủ
    public Result(int id, double mark, int studentId, int subjectId) {
        this.id = id;
        this.mark = mark;
        this.studentId = studentId;
        this.subjectId = subjectId;
    }

    // Constructor không có id (cho trường hợp insert mới)
    public Result(double mark, int studentId, int subjectId) {
        this.mark = mark;
        this.studentId = studentId;
        this.subjectId = subjectId;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", mark=" + mark +
                ", studentId=" + studentId +
                ", subjectId=" + subjectId +
                '}';
    }
}
