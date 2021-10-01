package com.spartaglobalsortmanager.controller;

import com.spartaglobalsortmanager.view.AllSortsInterface;
import com.spartaglobalsortmanager.view.NumberArrays;

import java.util.Random;
/*
    - Single responsibility principle applied, ensuring the only responsibility of this class is to randomly generate numbers using the Merge Sort algorithm.
    - Open closed principle applied as this code will not be modified, instead it is the extension of the NumberArrays interface
    - Liskov substitution principle applied as the MergeSort class logically syncs with the NumberArrays interface
    - Inheritance principle of Object-Oriented Programming implemented as the MergeSort subclass inherits from the AllSorts superclass
    - Polymorphism principle of Object-Oriented Programming implemented as the abstract generateRandArrayOfNums(), implemented from NumberArrays, has its code block is filled in.
*/
public class MergeSort extends AllSorts implements NumberArrays {
    // merge 2 sub arrays from array[]: 1st sub array is array[firstNum...middleNum], 2nd sub array is array[middleNum+1...rightNum]
    public static void mergeSorter(int array[], int firstNum, int middleNum, int rightNum) {
        // find sizes of 2 sub arrays to be merged
        int arraySize1 = middleNum - firstNum + 1;
        int arraySize2 = rightNum - middleNum;

        // create temporary arrays
        int leftSideTempArray[] = new int[arraySize1];
        int rightSideTempArray[] = new int[arraySize2];

        // copy data to temporary arrays
        for (int i = 0; i < arraySize1; ++i)
            leftSideTempArray[i] = array[firstNum + i];
        for (int j = 0; j < arraySize2; ++j)
            rightSideTempArray[j] = array[middleNum + 1 + j];

        // merging the temp arrays

        // Initial indexes of first and second sub arrays
        int indexOfFirstArray = 0;
        int indexOfSecondArray = 0;

        // Initial index of merged sub arrays
        int indexOfFirstSubArray = firstNum;
        while (indexOfFirstArray < arraySize1 && indexOfSecondArray < arraySize2) {
            if (leftSideTempArray[indexOfFirstArray] <= rightSideTempArray[indexOfSecondArray]) {
                array[indexOfFirstSubArray] = leftSideTempArray[indexOfFirstArray];
                indexOfFirstArray++;
            }
            else {
                array[indexOfFirstSubArray] = rightSideTempArray[indexOfSecondArray];
                indexOfSecondArray++;
            }
            indexOfFirstSubArray++;
        }

        // copy remaining elements of leftSideTempArray[] if any
        while (indexOfFirstArray < arraySize1) {
            array[indexOfFirstSubArray] = leftSideTempArray[indexOfFirstArray];
            indexOfFirstArray++;
            indexOfFirstSubArray++;
        }

        // copy remaining elements of rightSideTempArray[] if any
        while (indexOfSecondArray < arraySize2) {
            array[indexOfFirstSubArray] = rightSideTempArray[indexOfSecondArray];
            indexOfSecondArray++;
            indexOfFirstSubArray++;
        }
    }

    // main function that sorts array[firstNum...rightNum] using mergeSorter()
    public static void sort(int array[], int firstNum, int rightNum) {
        if (firstNum < rightNum) {
            // find middle point
            int middlePoint = firstNum + (rightNum - firstNum) / 2;

            // first and second halves
            sort(array, firstNum, middlePoint);
            sort(array, middlePoint + 1, rightNum);

            // merge sorted halves
            mergeSorter(array, firstNum, middlePoint, rightNum);
        }
    }

    // utility function to print array of its size
    public static void printArray(int array[]) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    // creates array of random numbers
    public void generateRandArrayOfNums(int userNum){
        // generate 10 random ints for merge sorting
        Random mergeRand = new Random();
        int[] array = new int[userNum];
        for (int i = 0; i < array.length; i++) {
            array[i] = mergeRand.nextInt(101);
        }

        // print before merge sorting
        System.out.println("Before merge sorting: ");
        printArray(array);

        // invoke merge sorting
        sort(array, 0, array.length - 1);

        // print after merge sorting
        System.out.println("\nAfter merge sorting: ");
        printArray(array);
        System.out.println();

        AllSortsInterface.nanoEnd();
    }
}
