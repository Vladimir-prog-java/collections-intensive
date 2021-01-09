package ru.itsjava.exercises.collection;

import ru.itsjava.model.Man;

import java.util.Comparator;

public class ComparatorPractice {
    public static void main(String[] args) {
        Man v = new Man("V", "N");
        Man r = new Man("R", "K");

        Comparator<Man> comparator = new ManComparator();
        System.out.println("comparator.compare(v,r) = " + comparator.compare(v, r));
    }
}
