package ru.itsjava.exercises.collection.sets.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {
        NavigableSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("5");
        treeSet.add("7");
        treeSet.add("9");
        treeSet.add("3");


        System.out.println(treeSet);
        System.out.println("treeSet.lower(\"3\") = " + treeSet.lower("1"));
        System.out.println("treeSet.higher(\"3\") = " + treeSet.higher("3"));
        System.out.println("treeSet.descendingSet() = " + treeSet.descendingSet());
        System.out.println("treeSet.tailSet(\"5\") = " + treeSet.tailSet("5"));

//Создать TreeSet
//Добавить элементы  "1" , "4", "5", "7", "9", "3"
//Вывести множество на экран
//Вывести элемент больше 3 на экран
//Вывести элемент меньше 3 на экран
//создать множество в обратном порядке
//возвращаем множество в котором все элементы больше или равны текущего

    }
}