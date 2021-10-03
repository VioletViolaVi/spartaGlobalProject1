package com.spartaglobalsortmanager.main;

import com.spartaglobalsortmanager.controller.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RandomNumTest extends MergeSort{
    // tests random numbers are the same when arranged in ascending order
    private final int[] numArr = {34, 5, 67, 1, 0, 347, 2};
    @Test
    public void numArrInOrder(){
        MergeSort mergeSort = new MergeSort();
        int[] orderedArr = {34, 5, 67, 1, 0, 347, 2};
        Arrays.sort(orderedArr);

        Assertions.assertArrayEquals(mergeSort.mergeSorter(numArr), orderedArr);
    }
}