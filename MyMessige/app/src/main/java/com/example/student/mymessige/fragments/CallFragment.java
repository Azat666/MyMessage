package com.example.student.mymessige.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student.mymessige.R;
import com.example.student.mymessige.adapters.AdapterFragment;
import com.example.student.mymessige.models.ModelFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CallFragment extends Fragment {


    public CallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call, container, false);
        List<ModelFragment> list = new ArrayList<>();
        list.add(new ModelFragment(R.drawable.chat3, "AZat", "+37495666700"));
        final LinearLayoutManager llm = new LinearLayoutManager(getContext());
        final AdapterFragment adapterFragment = new AdapterFragment(list, getActivity());
        final RecyclerView recyclerView = view.findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterFragment);
        return view;
    }

}
