package com.spartaglobalsortmanager.view;

/*
    - Interface segregation principle applied here in making the generateRandArrayOfNums() method abstract so the sorting algorithms can implement it differently; enabling polymorphism.
    - Dependency inversion principle applied as classes implementing this interface relies on its abstractions, not its details.
    - Abstraction principle of Object-Oriented Programming implemented as the abstract generateRandArrayOfNums(int userNum) method, allows the objects that use this to produce whatever code block functionality they want.
*/
public interface NumberArrays {
    void generateRandArrayOfNums(int userNum);
}
