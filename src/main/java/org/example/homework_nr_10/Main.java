package org.example.homework_nr_10;

//С помощью метода .replaceAll() замените все элементы из списка которые имеют под-строку “al” на “replaced String”

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void replaceAll(List<String> myJobs){
        myJobs.replaceAll(s -> s.replaceAll("et","replaced String"));
        System.out.println(myJobs);
    }
    public static void removeIf(List<String> myJobs){
        myJobs.removeIf(s -> s.startsWith("e"));
        System.out.println(myJobs);
    }
    public static void printMyJobs(List<String> myJobs) {
        for (String job:
                myJobs) {
            System.out.println(job);
        }
    }

    public static void printMyJobsRemoveDuplicates(List<String> myJobs) {
        HashSet<String> MyJobsRemoveDuplicates = new HashSet<>(myJobs);
        for (String job:
                MyJobsRemoveDuplicates) {
            System.out.println(job);
        }
    }

    public static void printDictionary(Map<String,String> dictionary){
        dictionary.forEach((s, s2) -> System.out.println(s + " = " + s2));
    }

    public static void main(String[] args) {
        List<String> myJobs = new ArrayList<>();
        myJobs.add("wake up");
        myJobs.add("brush your teeth");
        myJobs.add("take a shower");
        myJobs.add("get dressed");
        myJobs.add("eat");
        myJobs.add("walk the dog");
        myJobs.add("go to the shop");
        myJobs.add("do homework");
        myJobs.add("meet a friend");
        myJobs.add("participation in courses");
        myJobs.add("eat");
        myJobs.add("brush your teeth");
        printMyJobs(myJobs);

        System.out.println("---------------------------------");

        replaceAll(myJobs);

        System.out.println("---------------------------------");

        removeIf(myJobs);

        System.out.println("---------------------------------");

        printMyJobsRemoveDuplicates(myJobs);

        System.out.println("---------------------------------");

        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("яблоко","apple");
        dictionary.put("груша", "pear");
        dictionary.put("банан","banana");
        dictionary.put("арбуз","watermelon");
        dictionary.put("дыня","melon");
        dictionary.put("персик","peach");
        dictionary.put("слива","plum");
        dictionary.put("абрикос","apricot");
        dictionary.put("виноград","grape");
        dictionary.put("черешня","cherries");
        printDictionary(dictionary);

        System.out.println("---------------------------------");

        Deque<String> queueJobs = new ArrayDeque<>(5);
        queueJobs.offer("wake up");
        queueJobs.offer("brush your teeth");
        queueJobs.offer("take a shower");
        queueJobs.offer("get dressed");
        queueJobs.offer("eat");

        queueJobs.pop();
        queueJobs.pop();
        queueJobs.pop();
        System.out.println(queueJobs);
        System.out.println(queueJobs.peekLast());
    }
}


