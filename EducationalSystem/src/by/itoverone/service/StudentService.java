package by.itoverone.service;


import by.itoverone.entity.Student;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    public static List<Student> getStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: " + " ");
        int size = sc.nextInt();
        List<Student> studentsList = new ArrayList<>();

        sc.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a name: " + " ");
            String nameOfStudent = sc.nextLine();
            System.out.println("Enter number of subjects: " + " ");
            int numSubject = sc.nextInt();
            Map<String, List<Integer>> subjectAndMarks = new HashMap<>();

            for (int j = 0; i < numSubject; i++) {
                System.out.println("Enter a subject: " + " ");
                String subject = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter number of subject's marks: " + " ");
                int numMarks = sc.nextInt();
                sc.nextLine();
                List<Integer> studentsMarks = new ArrayList<>();
                for (int k = 0; k < numMarks; k++) {
                    System.out.println("Enter a mark: " + " ");
                    int mark = sc.nextInt();
                    sc.nextLine();
                    studentsMarks.add(mark);
                }
                subjectAndMarks.put(subject, studentsMarks);
            }
            studentsList.add(new Student(nameOfStudent, subjectAndMarks));

        }
        return studentsList;
    }

    public static List<Student> getAverageGrade(List<Student> students) {
        List<Student> averageMarks = new ArrayList<>();

        for (Student st : students) {
            Map<String, List<Integer>> marks = st.getMarks();
            for (Map.Entry<String, List<Integer>> pair : marks.entrySet()) {
                String subject = pair.getKey();
                List<Integer> subjectMarks = pair.getValue();
                int sum = 0;
                for (int i = 0; i < subjectMarks.size(); i++) {
                    sum = sum + subjectMarks.get(i);
                }
                int avg = sum / subjectMarks.size();

            }

        }
        return averageMarks;
    }

    public static void printStudent(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


    }
}




