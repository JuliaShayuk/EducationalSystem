package by.itoverone.entity;

import by.itoverone.entity.Human;

import java.util.Objects;

public class Programmer extends Human {
    private String language;
    private String nameOfProgrammer;


    public Programmer(int id, String name, String gender, int age) {
        super(id, name, gender, age);
    }

    public Programmer(String language, String nameOfProgrammer) {
        this.language = language;
        this.nameOfProgrammer = nameOfProgrammer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNameOfProgrammer() {
        return nameOfProgrammer;
    }

    public void setNameOfProgrammer(String nameOfProgrammer) {
        this.nameOfProgrammer = nameOfProgrammer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return language.equals(that.language) && nameOfProgrammer.equals(that.nameOfProgrammer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, nameOfProgrammer);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language='" + language + '\'' +
                ", nameOfProgrammer='" + nameOfProgrammer + '\'' +
                '}';
    }
}
