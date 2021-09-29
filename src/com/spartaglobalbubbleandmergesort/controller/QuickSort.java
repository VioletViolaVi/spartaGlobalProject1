package com.spartaglobalbubbleandmergesort.controller;

import java.util.Random;

public class QuickSort implements BothSortsInterface{

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high){
        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot){

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high){
        if (low < high){
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to print an array
    static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public void generateRandomQuickArrayOfInts(int userNum) {
        Random quickRand = new Random();
        int[] array = new int[userNum];

        for (int i = 0; i < array.length; i++) {
            array[i] = quickRand.nextInt(101);
        }

        // print before quick sorting
        System.out.println("Before quick sorting: ");
        printArray(array, userNum);

        quickSort(array, 0, userNum - 1);

        // print after quick sorting
        System.out.println("After quick sorting: ");
        printArray(array, userNum);

        BothSortsInterface.nanoEnd();
    }

}
