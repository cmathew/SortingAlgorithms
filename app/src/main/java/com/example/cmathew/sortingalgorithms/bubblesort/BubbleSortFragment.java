package com.example.cmathew.sortingalgorithms.bubblesort;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cmathew.sortingalgorithms.R;

import java.util.Arrays;
import java.util.List;

public class BubbleSortFragment extends Fragment {
    private TextView result;

    public BubbleSortFragment() {
        // Required empty public constructor
    }
    public static BubbleSortFragment newInstance() {
        BubbleSortFragment fragment = new BubbleSortFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bubble_sort, container, false);

        this.result = view.findViewById(R.id.bubble_sort_result);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        List<Integer> listy = Arrays.asList(9, 5, 1, 0, 3, 8, 2, 6, 4, 7);
        // List<Integer> listy = Arrays.asList(9, 5);
        // List<Integer> listy = Arrays.asList(9);
        // List<Integer> listy = new List<>();

        BubbleSorter<Integer> sorter = new BubbleSorter<>();
        List<Integer> resultListy = sorter.bubbleSort(listy);
        String resultString = TextUtils.join(", ", resultListy);
        result.setText(resultString);
    }
}
