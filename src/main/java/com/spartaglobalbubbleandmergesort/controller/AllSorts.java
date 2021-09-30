package com.spartaglobalbubbleandmergesort.controller;

import com.spartaglobalbubbleandmergesort.view.UsersChoicesInterface;

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
