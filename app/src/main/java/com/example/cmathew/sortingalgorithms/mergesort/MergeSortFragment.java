package com.example.cmathew.sortingalgorithms.mergesort;

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

public class MergeSortFragment extends Fragment {
    private TextView textView;

    public MergeSortFragment() {
        // Required empty public constructor
    }


    public static MergeSortFragment newInstance() {
        MergeSortFragment fragment = new MergeSortFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_merge_sort, container, false);
        this.textView = view.findViewById(R.id.sort_result);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        List<Integer> listy = Arrays.asList(9, 5, 1, 0, 3, 8, 2, 6, 4, 7);
        // List<Integer> listy = Arrays.asList(9, 5);
        // List<Integer> listy = Arrays.asList(9);
        // List<Integer> listy = new List<>();

        MergeSorter<Integer> sorter = new MergeSorter<Integer>();
        List<Integer> sortedListy = sorter.topDownMergeSort(listy);

        String resultString = TextUtils.join(", ", sortedListy);
        textView.setText(resultString);
    }
}
