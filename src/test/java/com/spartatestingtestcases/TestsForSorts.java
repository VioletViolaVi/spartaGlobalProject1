package com.spartatestingtestcases;

import com.spartaglobalsortmanager.controller.BubbleSort;
import com.spartaglobalsortmanager.controller.QuickSort;
import org.junit.jupiter.api.Test;
import java.util.InputMismatchException;

public class TestsForSorts {
    // tests random array of numbers
    @Test
    public void testingGenerateRandArrayOfNums(){
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.generateRandArrayOfNums(5);
        throw new ArithmeticException(("Arithmetic Exception Error"));
    }

    // tests to see if responses are numbers
    @Test
    public void testingPrintArray(){
        QuickSort quickSort = new QuickSort();
        quickSort.generateRandArrayOfNums(5);
        throw new InputMismatchException(("InputMismatch Exception Error"));
    }
}
