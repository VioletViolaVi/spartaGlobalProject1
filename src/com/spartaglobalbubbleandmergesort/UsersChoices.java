package com.spartaglobalbubbleandmergesort;

import java.util.Scanner;

public class UsersChoices implements BothSortsInterface {
    public void loopedUserAnswers() {
        // allows user to input response
        System.out.println("Choose one: Bubble or Merge?");

        // outcomes based on user input
        switch (BothSortsInterface.getUserSortInput()) {
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
            break;
        }
    }
}
