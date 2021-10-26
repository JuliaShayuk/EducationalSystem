package by.itoverone;

import by.itoverone.entity.Human;
import by.itoverone.entity.Programmer;
import by.itoverone.entity.Student;
import by.itoverone.service.HumanService;
import by.itoverone.service.ProgrammerService;
import by.itoverone.service.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = StudentService.getStudents();
        System.out.println("List of all students: " + " ");
       StudentService.printStudent(students);


       List<Student> studentsWithAverageGrade = StudentService.getAverageGrade(students);
        System.out.println("Average grade student list: " + " ");
        StudentService.printStudent(studentsWithAverageGrade);

        List<Human> humans = HumanService.getHumans();
        System.out.println("List of humans: " + " ");
        HumanService.printHuman(humans);

        List<Human> humansStartWithB = HumanService.humanNameStartWithB(humans);
        System.out.println("Humans which names start with 'B' :" + " ");
        HumanService.printHuman(humansStartWithB);

        List<Human> namesInAscendingOrder = HumanService.filterByNameInAscendingOrder(humans);
        System.out.println("List of human's names in ascending order: " + " ");
       HumanService.printHuman(namesInAscendingOrder);

        List<Programmer> programmers = ProgrammerService.getProgrammers();
        System.out.println("List of all programmers:" + " ");
        ProgrammerService.printProgrammer(programmers);

        List<Programmer> javaProgrammers = ProgrammerService.javaLanguageProgrammers(programmers);
        System.out.println("List of programmers writing in Java language: " + " ");
        ProgrammerService.printProgrammer(javaProgrammers);


    }
}
