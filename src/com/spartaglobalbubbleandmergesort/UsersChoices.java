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





//        boolean continueSorting = true;
//        while (continueSorting) {}

    }
}
