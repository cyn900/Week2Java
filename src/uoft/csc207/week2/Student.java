package uoft.csc207.week2;

public class Student extends Person {
    private final String studentid;
    // final means you cannot reasign the variable
    // only in the {} can use this name

    public Student(String[] name, String utorid, String studentid) {
        super(name, utorid);
        this.studentid = studentid;
    }
}
