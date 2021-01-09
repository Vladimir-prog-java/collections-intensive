package ru.itsjava.exercises.collection.sets.hashset;

import ru.itsjava.model.Man;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        Set<Man> set1 = new HashSet<>();
        Man man1  = new Man("V", "N");
        Man man2  = new Man("Z", "M");
        Man man3  = new Man("F", "K");
        Man man4  = new Man("G", "P");
        Man man5  = new Man("Q", "T");


        Set<Man> set2 = new HashSet<>();
        set1.add(man1);
        set1.add(man2);
        set1.add(man3);

        set2.add(man1);
        set2.add(man2);
        set2.add(man3);

        System.out.println("set1.equals(set2) = " + set1.equals(set2));

//        Создать 2 множества от Man, добавить несколько Man
//        и сравнить множества через equals

    }
}
