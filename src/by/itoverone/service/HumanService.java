package by.itoverone.service;

import by.itoverone.entity.Human;
import by.itoverone.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanService {
    public static List<Human> getHumans() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of humans");
        int num = sc.nextInt();
        List<Human> humanList = new ArrayList<>();


        for (int i = 0; i < num; i++) {
            System.out.println("Enter an id");
            int id = sc.nextInt();
            System.out.println("Enter a name");
            String name = sc.next();
            System.out.println("Enter a gender");
            String gender = sc.next();
            System.out.println("Enter an age");
            int age = sc.nextInt();
            Human newHuman = new Human(id, name, gender, age);
            humanList.add(newHuman);

        }

        return humanList;
    }

    public static List<Human> humanNameStartWithB(List<Human> humans) {
        List<Human> newHumans = new ArrayList<>();
        for (int j = 0; j < humans.size(); j++) {
            if (humans.get(j).getName().startsWith("B")) {
                newHumans.add(humans.get(j));
            }

        }
        return newHumans;
    }

    public static List<Human> filterByNameInAscendingOrder(List<Human> humans) {
        for (int i = 0; i < humans.size(); i++) {
            for (int j = 0; j < humans.size() - i - 1; j++) {
                if (humans.get(j).getName().compareTo(humans.get(j + 1).getName()) > 0) {
                    Human temp = humans.get(j);
                    humans.set(j, humans.get(j + 1));
                    humans.set(j + 1, temp);
                }

            }
        }
        return humans;
    }

    public static void printHuman(List<Human> humans) {
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(humans.get(i));
        }

    }
}




