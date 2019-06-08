package com.example.myapplication.ui.list.employee;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListEmpFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListEmpFragment extends Fragment {


    public ListEmpFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ListEmpFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListEmpFragment newInstance() {
        return new ListEmpFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_emp, container, false);
    }

}
