package com.spartaglobalbubbleandmergesort.view;

import com.spartaglobalbubbleandmergesort.controller.AllSortsInterface;
import com.spartaglobalbubbleandmergesort.controller.BubbleSort;
import com.spartaglobalbubbleandmergesort.controller.MergeSort;
import com.spartaglobalbubbleandmergesort.controller.QuickSort;

public interface UsersChoicesInterface extends AllSortsInterface {

    static void loopedUserAnswers() {
        // allows user to input response
        System.out.println("Choose one: Bubble, Merge or Quick?");
        System.out.println("Choose a number");
        int userNumResponse = scanner.nextInt();

        // outcomes based on user input
        switch (AllSortsInterface.getUserSortInput()) {
            case "bubble":
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.generateRandArrayOfNums(userNumResponse);
            break;
            case "merge":
                MergeSort mergeSort = new MergeSort();
                mergeSort.generateRandArrayOfNums(userNumResponse);
            break;
            case "quick":
                QuickSort quickSort = new QuickSort();
                quickSort.generateRandArrayOfNums(userNumResponse);
            break;
            default:
                System.out.println("You can only choose between Bubble, Merge or Quick.");
            break;
        }
    }
}
