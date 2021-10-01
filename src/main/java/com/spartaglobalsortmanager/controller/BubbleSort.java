package com.spartaglobalsortmanager.controller;

import com.spartaglobalsortmanager.view.AllSortsInterface;
import com.spartaglobalsortmanager.view.NumberArrays;

import java.util.ArrayList;
import java.util.Random;
/*
    - Single responsibility principle applied, ensuring the only responsibility of this class is to randomly generate numbers using the Bubble Sort algorithm.
    - Open closed principle applied as this code will not be modified, instead it is the extension of the NumberArrays interface
    - Liskov substitution principle applied as the BubbleSort class logically syncs with the NumberArrays interface
    - Inheritance principle of Object-Oriented Programming implemented as the BubbleSort subclass inherits from the AllSorts superclass
    - Polymorphism principle of Object-Oriented Programming implemented as the abstract generateRandArrayOfNums(), implemented from NumberArrays, has its code block is filled in.
*/
public class BubbleSort extends AllSorts implements NumberArrays {
    // instance variable for generating random numbers
    private int anyNum;

    // how instance variable is accessed outside this class
    public int getAnyNum() {
        return anyNum;
    }

    // constructor
    public BubbleSort(int anyNum) {
        this.anyNum = anyNum;
    }

    // creates array of random numbers
    public void generateRandArrayOfNums(int userNum) {
        // empty arraylist of integers
        ArrayList<Integer> allNumbers = new ArrayList<>();
        // random numbers
        Random bubbleRandom = new Random();
        for(int i = 0; i < userNum; i++){
            BubbleSort bubbleSort = new BubbleSort(bubbleRandom.nextInt(101));
            allNumbers.add(bubbleSort.getAnyNum());
        }
        // calls the sorting method made to show the final (sorted) answer
        bubbleSorter(allNumbers);
    }

    // sort numbers using bubble algorithm
    public static void bubbleSorter(ArrayList<Integer> intArray) {
        // length of array
        int intArrayLength = intArray.size();
        // currently, empty int variable
        int tempHolder;

        // prints ints before sorting
        System.out.println("Before bubble sorting: ");
        for(int i = 0; i < intArray.size(); i++){
            System.out.print(intArray.get(i) + ", ");
        }
        System.out.println();

        // checking 2 ints at a time to put in ascending order
        for (int i = 0; i < intArrayLength; i++) {
            for (int j = 0; j < intArrayLength; j++) {
                if (intArray.get(i) < intArray.get(j)) {
                    tempHolder = intArray.get(i);
                    intArray.set(i, intArray.get(j));
                    intArray.set(j, tempHolder);
                }
            }
        }

        // prints ints after sorting
        System.out.println("After bubble sorting: ");
        for(int i = 0; i < intArray.size(); i++){
            System.out.print(intArray.get(i) + ", ");
        }
        System.out.println();

        AllSortsInterface.nanoEnd();
    }

    public BubbleSort() {

    }
}
