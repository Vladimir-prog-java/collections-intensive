package ru.itsjava.exercises.collection;

import ru.itsjava.model.Man;

import java.util.Comparator;

public class ManComparator implements Comparator<Man> {
    @Override
    public int compare(Man o1, Man o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
