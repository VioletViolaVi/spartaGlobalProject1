package com.spartaglobalbubbleandmergesort.view;

import java.util.Scanner;

public interface AllSortsInterface {
    // nano time at start
    long nanoStart = System.nanoTime();

    // user's sort choice input
    Scanner scanner = new Scanner(System.in);
    String userSortChoice = scanner.next().toLowerCase();

    static void nanoEnd() {
        // nano time at end
        long nanoEnd = System.nanoTime();

        long nanoLength = (nanoEnd - nanoStart) / 1000000000;
        System.out.println("Time: " + nanoLength + " seconds");
    }

    // getter for variable
    static String getUserSortInput() {
        return userSortChoice;
    }
}
