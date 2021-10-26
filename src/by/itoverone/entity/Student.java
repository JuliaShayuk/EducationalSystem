package by.itoverone.entity;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student extends Human {
    private String NameOfStudent;
    private String subject;
    private Map<String, List<Integer>> marks;

    public Student(int id, String name, String gender, int age, String nameOfStudent, String subject, Map<String, List<Integer>> marks) {
        super(id, name, gender, age);
        NameOfStudent = nameOfStudent;
        this.subject = subject;
        this.marks = marks;
    }

    public Student(String nameOfStudent, Map<String, List<Integer>> subjectAndMarks) {

    }

    public String getNameOfStudent() {
        return NameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        NameOfStudent = nameOfStudent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Map<String, List<Integer>> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, List<Integer>> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return NameOfStudent.equals(student.NameOfStudent) && subject.equals(student.subject) && marks.equals(student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), NameOfStudent, subject, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "NameOfStudent='" + NameOfStudent + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
