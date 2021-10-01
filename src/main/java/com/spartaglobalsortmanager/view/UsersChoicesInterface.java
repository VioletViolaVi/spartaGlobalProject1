package com.spartaglobalsortmanager.view;

import com.spartaglobalsortmanager.controller.*;

/*
    - Single responsibility principle applied as interface has 1 responsibility of displaying the results of the users choices.
    - Open closed principle applied so the sort choices and behaviours can be extended and not have the code modified.
    - Liskov substitution principle also applied as the userAnswers() is logically sync to the AllSortsInterface it implements
*/
public interface UsersChoicesInterface extends AllSortsInterface {

    // display results to user based on their respective choices
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
