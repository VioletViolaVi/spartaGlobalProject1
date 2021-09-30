package com.spartaglobalbubbleandmergesort.view;

import com.spartaglobalbubbleandmergesort.controller.*;

public interface UsersChoicesInterface extends AllSortsInterface {

    static void userAnswers() {
        // allows user to input response
        System.out.println("Pick one: Bubble, Merge or Quick?");
        System.out.println("Then pick a number");

        // outcomes based on user input
        switch (AllSortsInterface.getUserSortInput()) {
            case "bubble":
                AllSorts.bubbleInstanceOf(AllSortsInterface.getUserNumInput());
            break;
            case "merge":
                AllSorts.mergeInstanceOf(AllSortsInterface.getUserNumInput());
            break;
            case "quick":
                AllSorts.quickInstanceOf(AllSortsInterface.getUserNumInput());
            break;
            default:
                System.out.println("You can only choose between Bubble, Merge or Quick.");
            break;
        }
    }
}
