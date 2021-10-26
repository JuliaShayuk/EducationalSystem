package by.itoverone.entity;

import java.util.Objects;

public class Teacher extends Human {
    private String subject;

    public Teacher(int id, String name, String gender, int age) {
        super(id, name, gender, age);
    }

    public Teacher(int id, String name, String gender, int age, String subject) {
        super(id, name, gender, age);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return subject.equals(teacher.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
