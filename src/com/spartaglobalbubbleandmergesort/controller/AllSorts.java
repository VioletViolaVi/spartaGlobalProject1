package com.spartaglobalbubbleandmergesort.controller;

import com.spartaglobalbubbleandmergesort.view.UsersChoicesInterface;

public class AllSorts implements UsersChoicesInterface {

    public static void bubbleInstanceOf(int userNumResponse){
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.generateRandArrayOfNums(userNumResponse);
    }

    public static void mergeInstanceOf(int userNumResponse){
        MergeSort mergeSort = new MergeSort();
        mergeSort.generateRandArrayOfNums(userNumResponse);
    }

    public static void quickInstanceOf(int userNumResponse){
        QuickSort quickSort = new QuickSort();
        quickSort.generateRandArrayOfNums(userNumResponse);
    }
}
