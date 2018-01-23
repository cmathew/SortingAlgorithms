package com.example.cmathew.sortingalgorithms.bubblesort;

import java.util.List;

public class BubbleSorter<T extends Comparable<T>> {
    public List<T> bubbleSort(List<T> list) {
        int swapsMade;

        do {
            swapsMade = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                T leftElement = list.get(i);
                T rightElement = list.get(i + 1);
                if (leftElement.compareTo(rightElement) > 0) {
                    list.set(i, rightElement);
                    list.set(i + 1, leftElement);
                    swapsMade++;
                }
            }
        } while (swapsMade > 0);

        return list;
    }
}
