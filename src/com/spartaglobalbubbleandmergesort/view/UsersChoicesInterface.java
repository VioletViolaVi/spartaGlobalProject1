package com.spartaglobalbubbleandmergesort.view;

import com.spartaglobalbubbleandmergesort.controller.*;

public interface UsersChoicesInterface extends AllSortsInterface {

    static void loopedUserAnswers() {
        // allows user to input response
        System.out.println("Pick one: Bubble, Merge or Quick?");
        System.out.println("Then pick a number");
        int userNumResponse = scanner.nextInt();

        // outcomes based on user input
        switch (AllSortsInterface.getUserSortInput()) {
            case "bubble":
                AllSorts.bubbleInstanceOf(userNumResponse);
            break;
            case "merge":
                AllSorts.mergeInstanceOf(userNumResponse);
            break;
            case "quick":
                AllSorts.quickInstanceOf(userNumResponse);
            break;
            default:
                System.out.println("You can only choose between Bubble, Merge or Quick.");
            break;
        }
    }
}
