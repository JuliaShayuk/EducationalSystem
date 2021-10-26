package by.itoverone.service;

import by.itoverone.entity.Programmer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammerService {
    public static List<Programmer> getProgrammers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of programmers");
        int num = sc.nextInt();
        List<Programmer> programmersList = new ArrayList<>();
        sc.nextLine();


        for (int i = 0; i < num; i++) {
            System.out.println("Enter a language");
            String language = sc.next();
            System.out.println("Enter a name");
            String NameOfProgrammer = sc.next();
            Programmer newProgrammer = new Programmer(language, NameOfProgrammer);
            programmersList.add(newProgrammer);

        }

        return programmersList;
    }

    public static List<Programmer> javaLanguageProgrammers(List<Programmer> programmers) {
        List<Programmer> newProgrammers = new ArrayList<>();
        for (int i = 0; i < programmers.size(); i++) {
            if (programmers.get(i).getLanguage().equalsIgnoreCase("Java")) {
                newProgrammers.add(programmers.get(i));
            }

        }
        return newProgrammers;
    }

    public static void printProgrammer(List<Programmer> programmers) {
        for (int i = 0; i < programmers.size(); i++) {
            System.out.println(programmers.get(i));
        }

    }

}



