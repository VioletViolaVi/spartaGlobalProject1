package com.spartaglobalsortmanager.view;

import java.util.Scanner;

/*
    - Single responsibility principle applied, ensuring the only responsibility of this interface is to inform the user how many seconds it took to complete
    - Interface segregation principle applied as the classes implementing this interface aren't implementing anything they don't use
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
