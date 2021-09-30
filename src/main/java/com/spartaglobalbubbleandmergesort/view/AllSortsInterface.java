package com.spartaglobalbubbleandmergesort.view;

import java.util.Scanner;

public interface AllSortsInterface {
    // nano time at start
    long nanoStart = System.nanoTime();

    // user's sort choice input
    Scanner scanner = new Scanner(System.in);

    // user's sort choice lower case
    String userSortChoice = scanner.next().toLowerCase().replaceAll(" ", "");

    // user's num choice
    int userNumResponse = scanner.nextInt();

    static void nanoEnd() {
        // nano time at end
        long nanoEnd = System.nanoTime();

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
