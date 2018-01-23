package com.example.cmathew.sortingalgorithms.mergesort;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter<T extends Comparable<T>> {
    public List<T> topDownMergeSort(List<T> list) {
        if (list.size() == 1) {
            return list;
        }

        // half of largest index
        int pivot = list.size() / 2;
        List<T> leftList = list.subList(0, pivot);
        List<T> rightList = list.subList(pivot, list.size());

        List<T> leftResult = topDownMergeSort(leftList);
        List<T> rightResult = topDownMergeSort(rightList);

        return mergeLists(leftResult, rightResult);
    }

    private List<T> mergeLists(List<T> leftList, List<T> rightList) {
        List<T> result = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            T leftVal = leftList.get(leftIndex);
            T rightVal = rightList.get(rightIndex);

            if (leftVal.compareTo(rightVal) <= 0) {
                result.add(leftVal);
                leftIndex++;
            } else if (rightVal.compareTo(leftVal) < 0) {
                result.add(rightVal);
                rightIndex++;
            }
        }

        while (leftIndex < leftList.size()) {
            T leftVal = leftList.get(leftIndex);
            result.add(leftVal);
            leftIndex++;
        }

        while (rightIndex < rightList.size()) {
            T rightVal = rightList.get(rightIndex);
            result.add(rightVal);
            rightIndex++;
        }

        return result;
    }
}
