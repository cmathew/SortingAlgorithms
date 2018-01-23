package com.example.cmathew.sortingalgorithms.bubblesort;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cmathew.sortingalgorithms.R;

public class BubbleSortFragment extends Fragment {

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
        return inflater.inflate(R.layout.fragment_bubble_sort, container, false);
    }
}
