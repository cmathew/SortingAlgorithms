package com.example.cmathew.sortingalgorithms.mergesort;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter {
    public static List<Integer> TopDownMergeSort(List<Integer> list) {
        if (list.size() == 1) {
            return list;
        }

        // half of largest index
        int pivot = list.size() / 2;
        List<Integer> leftList = list.subList(0, pivot);
        List<Integer> rightList = list.subList(pivot, list.size());

        List<Integer> leftResult = TopDownMergeSort(leftList);
        List<Integer> rightResult = TopDownMergeSort(rightList);

        return MergeLists(leftResult, rightResult);
    }

    private static List<Integer> MergeLists(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> result = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            int leftVal = leftList.get(leftIndex);
            int rightVal = rightList.get(rightIndex);

            if (leftVal <= rightVal) {
                result.add(leftVal);
                leftIndex++;
            } else if (rightVal < leftVal) {
                result.add(rightVal);
                rightIndex++;
            }
        }

        while (leftIndex < leftList.size()) {
            int leftVal = leftList.get(leftIndex);
            result.add(leftVal);
            leftIndex++;
        }

        while (rightIndex < rightList.size()) {
            int rightVal = rightList.get(rightIndex);
            result.add(rightVal);
            rightIndex++;
        }

        return result;
    }
}
