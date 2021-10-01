package com.spartaglobalsortmanager.controller;

import com.spartaglobalsortmanager.view.UsersChoicesInterface;

/*
    - Single responsibility principle applied so AllSort class has 1 responsibility of creating new instances of the respective sort algorithms
    - Open closed principle applied as this code will not be modified, instead it is the extension of the UsersChoicesInterface interface
    - Liskov substitution principle applied as the AllSorts class logically syncs with the UsersChoicesInterface interface
*/
public class AllSorts implements UsersChoicesInterface {

    public static void bubbleInstanceOf(int userNumResponse){
        BubbleSort bubbleSort = new BubbleSort();
        try {
            bubbleSort.generateRandArrayOfNums(userNumResponse);
        } catch (ExceptionInInitializerError e){
            System.out.println("Not a number!");
        }
    }

    public static void mergeInstanceOf(int userNumResponse){
        MergeSort mergeSort = new MergeSort();
        try {
            mergeSort.generateRandArrayOfNums(userNumResponse);
        } catch (ExceptionInInitializerError e){
            System.out.println("Not a number!");
        }
    }

    public static void quickInstanceOf(int userNumResponse){
        QuickSort quickSort = new QuickSort();
        try {
            quickSort.generateRandArrayOfNums(userNumResponse);
        } catch (ExceptionInInitializerError e){
            System.out.println("Not a number!");
        }
    }
}
