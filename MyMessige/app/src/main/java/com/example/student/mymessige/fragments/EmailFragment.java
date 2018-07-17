package com.example.student.mymessige.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.student.mymessige.R;
import com.example.student.mymessige.adapters.AdapterEmailFragment;
import com.example.student.mymessige.adapters.AdapterFragment;
import com.example.student.mymessige.models.ModelEmailFragment;
import com.example.student.mymessige.models.ModelFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmailFragment extends Fragment {


    public EmailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_email, container, false);
        List<ModelEmailFragment> list = new ArrayList<>();
        list.add(new ModelEmailFragment(R.drawable.chat3,"Ayvazyan.95@mail.ru"));
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        final AdapterEmailFragment adapterEmailFragment = new AdapterEmailFragment(list,getActivity());
        final RecyclerView recyclerView = view.findViewById(R.id.rec_view1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterEmailFragment);
        return view;
    }

}
