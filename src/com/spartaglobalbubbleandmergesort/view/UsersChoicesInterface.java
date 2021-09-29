package com.spartaglobalbubbleandmergesort.view;

import com.spartaglobalbubbleandmergesort.controller.BothSortsInterface;
import com.spartaglobalbubbleandmergesort.controller.BubbleSort;
import com.spartaglobalbubbleandmergesort.controller.MergeSort;
import com.spartaglobalbubbleandmergesort.controller.QuickSort;

public interface UsersChoicesInterface extends BothSortsInterface {
    com.spartaglobalbubbleandmergesort.controller.MergeSort MergeSort = null;
    com.spartaglobalbubbleandmergesort.controller.MergeSort QuickSort = null;

    static void loopedUserAnswers() {
        // allows user to input response
        System.out.println("Choose one: Bubble, Merge or Quick?");

        // outcomes based on user input
        switch (BothSortsInterface.getUserSortInput()) {
            case "bubble":
                System.out.println("Choose a number");
                int userNumResponse = scanner.nextInt();
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.generateRandArrayOfNums(userNumResponse);
            break;
            case "merge":
                System.out.println("Choose a number");
                userNumResponse = scanner.nextInt();
                MergeSort.generateRandomArrayOfInts(userNumResponse);
            break;
            case "quick":
                System.out.println("Choose a number");
                userNumResponse = scanner.nextInt();
                QuickSort quickSort = new QuickSort();
                quickSort.generateRandomQuickArrayOfInts(userNumResponse);
            break;
            default:
                System.out.println("You can only choose between Bubble and Merge.");
            break;
        }
    }
}
