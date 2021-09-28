package com.spartaglobalbubbleandmergesort;

public interface BubbleMergeInterface {

    long nanoStart = System.nanoTime();

    static void nanoEnd(){
        // nano time at end
        long nanoEnd = System.nanoTime();

        long nanoLength = nanoEnd - nanoStart;
        System.out.println("Total nano seconds: " + nanoLength);
    }
}
