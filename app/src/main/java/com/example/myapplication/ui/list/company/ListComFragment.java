package com.example.myapplication.ui.list.company;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListComFragment extends Fragment {


    public ListComFragment() {
        // Required empty public constructor
    }

    public static ListComFragment newInstance() {
        return new ListComFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_com, container, false);
    }

}
