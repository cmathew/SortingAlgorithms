package com.example.cmathew.sortingalgorithms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Integer> listy = Arrays.asList(9, 5, 1, 0, 3, 8, 2, 6, 4, 7);
        // List<Integer> listy = Arrays.asList(9, 5);

        List<Integer> sortedListy = topDownMergeSort(listy);

        TextView textView = findViewById(R.id.sort_result);
        String resultString = TextUtils.join(", ", sortedListy);
        textView.setText(resultString);
    }

    private List<Integer> topDownMergeSort(List<Integer> list) {
        if (list.size() == 1) {
            return list;
        }

        // half of largest index
        int pivot = list.size() / 2;
        List<Integer> leftList = list.subList(0, pivot);
        List<Integer> rightList = list.subList(pivot, list.size());

        List<Integer> leftResult = topDownMergeSort(leftList);
        List<Integer> rightResult = topDownMergeSort(rightList);

        return mergeLists(leftResult, rightResult);
    }

    private List<Integer> mergeLists(List<Integer> leftList, List<Integer> rightList) {
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
