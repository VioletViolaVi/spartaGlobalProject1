package com.spartaglobalsortmanager.view;

/*
    - Interface segregation principle applied here in making the generateRandArrayOfNums() method abstract so the sorting algorithms can implement it differently; enabling polymorphism.
    - Dependency inversion principle applied as classes implementing this interface relies on its abstractions, not its details.
*/
public interface NumberArrays {
    void generateRandArrayOfNums(int userNum);
}
