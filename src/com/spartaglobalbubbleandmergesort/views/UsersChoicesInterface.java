package com.spartaglobalbubbleandmergesort.views;

import com.spartaglobalbubbleandmergesort.BothSortsInterface;
import com.spartaglobalbubbleandmergesort.BubbleSortInterface;
import com.spartaglobalbubbleandmergesort.MergeSortInterface;

public interface UsersChoicesInterface extends BothSortsInterface {
    static void loopedUserAnswers() {
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
                System.out.println("You can only choose between Bubble and Merge.");
            break;
        }
    }
}
