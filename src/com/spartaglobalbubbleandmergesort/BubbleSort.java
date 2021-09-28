package com.spartaglobalbubbleandmergesort;

public class BubbleSort implements BubbleSortInterface{
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

    // method overriding abstract signature in BubbleSortInterface file
    @Override
    public void BubbleSort(int anyNum) {
        this.anyNum = anyNum;
    }
}
