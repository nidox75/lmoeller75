package com.techelevator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lecture {

    public static void main(String[] args) {


        System.out.println("####################");
        System.out.println("       LISTS");
        System.out.println("####################");
        List<String> animals = new ArrayList<String>();
        animals.add("dog");
        animals.add("cat");
        System.out.println(animals.size());
        System.out.println(animals.get(0));

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(63);
        Integer indexZero = numbers.get(0);
        int indexOne = numbers.get(1);


        System.out.println("####################");
        System.out.println("Lists are ordered");
        System.out.println("####################");

        animals.add(1, "lizard");
        System.out.println(animals);
        System.out.println("####################");
        System.out.println("Lists allow duplicates");
        System.out.println("####################");
        animals.add(0, "lizard");
        System.out.println(animals);
        animals.add("gerbil");

        System.out.println("####################");
        System.out.println("Lists allow elements to be inserted in the middle");
        System.out.println("####################");


        System.out.println("####################");
        System.out.println("Lists allow elements to be removed by index");
        System.out.println("####################");
        System.out.printf("Before remove: " + animals);
        animals.remove(2);
        System.out.println("After remove: " + animals);

        boolean catRemoved = animals.remove("cat");
        System.out.println("catRemoved " + catRemoved);
        System.out.println(animals);

        System.out.println("####################");
        System.out.println("Find out if something is already in the List");
        System.out.println("####################");

        boolean raptorFound = animals.contains("raptor");
        System.out.println("raptorFound = " + raptorFound);


        System.out.println("####################");
        System.out.println("Find index of item in List");
        System.out.println("####################");
        int indexOfDog = animals.indexOf("dog");
        System.out.println("index of dog is " + indexOfDog);


        System.out.println("####################");
        System.out.println("Lists can be turned into an array");
        System.out.println("####################");
        String[] animalsArray = (animals.toArray(animals.toArray(new String[0])));
        System.out.println(animalsArray.length);

        System.out.println("####################");
        System.out.println("Lists can be sorted");
        System.out.println("####################");
        Collections.sort(animals);
        System.out.println("After sorting: " + animals);

        System.out.println("####################");
        System.out.println("Lists can be reversed too");
        System.out.println("####################");
        Collections.reverse(animals);
        System.out.println("After reverse: " + animals);

        System.out.println("####################");
        System.out.println("       FOREACH");
        System.out.println("####################");
        System.out.println();
        for (int i = 0; i < animals.size(); i++) {
            String currentAnimal = animals.get(i);
            System.out.println(currentAnimal);
        }
          for (String animal : animals) {
              System.out.println(animal);
          }
    }
}
