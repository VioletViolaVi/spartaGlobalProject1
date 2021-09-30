package com.spartaglobalbubbleandmergesort.view;

import java.util.InputMismatchException;

public class Exceptions implements AllSortsInterface {

    public static void notNumbers(){
        try {
            AllSortsInterface.getUserNumInput();
            System.out.println(userNumResponse);
        } catch(InputMismatchException e){
            System.out.println("Not a number.");
        }
    }

    public static void smallerThanZero(){
        try {
            if (!(AllSortsInterface.getUserNumInput() <= 0)) {
                System.out.println(userNumResponse);
            }
        } catch(NegativeArraySizeException e){
            System.out.println("Number needs to be bigger than 0");
        }
    }
}
