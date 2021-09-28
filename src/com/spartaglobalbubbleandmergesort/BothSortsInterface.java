package com.spartaglobalbubbleandmergesort;

import java.util.Scanner;

public interface BothSortsInterface {
    // nano time at start
    long nanoStart = System.nanoTime();

    // user's sort choice input
    Scanner scanner = new Scanner(System.in);
    String userSortChoice = scanner.next().toLowerCase();

    static void nanoEnd() {
        // nano time at end
        long nanoEnd = System.nanoTime();

        long nanoLength = nanoEnd - nanoStart;
        System.out.println("Total nano seconds: " + nanoLength);
    }

    // getter for variable
    static String getUserSortInput() {
        return userSortChoice;
    }
}
