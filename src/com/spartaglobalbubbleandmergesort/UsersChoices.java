package com.spartaglobalbubbleandmergesort;

import java.util.Scanner;

public class UsersChoices {

    public void loopedUserAnswers() {

        // allows user to input response
        System.out.println("Choose one: Bubble or Merge?");
        Scanner scanner = new Scanner(System.in);
        String userSortChoice = scanner.next().toLowerCase();

        // outcomes based on user input
        switch (userSortChoice) {
            case "bubble":
                System.out.println("Choose a number");
                int userNumResponse = scanner.nextInt();
                BubbleSortInterface.generateRandArrayOfNums(userNumResponse);
            break;
            case "merge":
                System.out.println("Choose a number");
                userNumResponse = scanner.nextInt();
                MergeSortInterface.generateRandomArrayOfInts(userNumResponse);
            break;
            default:
                System.out.println("Choose one: Bubble or Merge?");
                userSortChoice = scanner.next().toLowerCase();
            break;
        }




//        // continues until a sorting type is selected
//        boolean continueSorting = true;
//        while (continueSorting) {
//            if (userResponse.equalsIgnoreCase("Bubble")) {
//
//                // records nano time from start of sorting
//                long nanoTimeBefore = System.nanoTime();
//
//                /* Bubble Sort */
//                BubbleSortInterface.generateRandArrayOfNums(userNumResponse);
//
//                // records nano time from start of sorting
//                long nanoTimeAfter = System.nanoTime();
//
//                // length of execution
//                long timeTakenToExecute = nanoTimeAfter - nanoTimeBefore;
//                System.out.println("Amount of nano seconds taken to execute: " + timeTakenToExecute);
//
//                continueSorting = false;
//            } else if (userResponse.equalsIgnoreCase("Merge")) {
//
//                // records nano time from start of sorting
//                long nanoTimeBefore = System.nanoTime();
//
//                /* Merge Sort */
//                MergeSortInterface.generateRandomArrayOfInts(userNumResponse);
//                continueSorting = false;
//
//                // records nano time from start of sorting
//                long nanoTimeAfter = System.nanoTime();
//
//                // length of execution
//                long timeTakenToExecute = nanoTimeAfter - nanoTimeBefore;
//                System.out.println("\nAmount of nano seconds taken to execute: " + timeTakenToExecute);
//            } else {
//                System.out.println("Please choose between Bubble or Merge.");
//                userResponse = scanner.next();
//            }
//        }



    }

}
