package com.spartaglobalsortmanager.view;

import java.util.Scanner;

/*
    - Single responsibility principle applied, ensuring the only responsibility of this interface is to inform the user how many seconds it took to complete
    - Interface segregation principle applied as the classes implementing this interface aren't implementing anything they don't use
    - Encapsulation principle of Object-Oriented Programming implemented as the AllSortsInterface interface has the getUserSortInput() and getUserNumInput() methods that enable objects calling these methods to focus on how to use the methods and not what's in it.
*/
public interface AllSortsInterface {
    // nano time at start
    long nanoStart = System.nanoTime();

    // user's sort choice input
    Scanner scanner = new Scanner(System.in);

    // user's sort choice lower case
    String userSortChoice = scanner.next().toLowerCase().replaceAll(" ", "");

    // user's num choice
    int userNumResponse = scanner.nextInt();

    // calculates how long nano time is
    static void nanoEnd() {
        // nano time at end
        long nanoEnd = System.nanoTime();

        // total nano time
        long nanoLength = (nanoEnd - nanoStart) / 1000000000;
        System.out.println("Time: " + nanoLength + " seconds");
    }

    // getters for variables
    static String getUserSortInput() {
        return userSortChoice;
    }

    // getters for variables
    static int getUserNumInput() {
        return userNumResponse;
    }
}
