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
import com.example.student.mymessige.adapters.AdapterMessigefragment;
import com.example.student.mymessige.models.ModelMessigeFragment;
import com.example.student.mymessige.providers.UserDataProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessigeFragment extends Fragment {


    public MessigeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_messige, container, false);
        UserDataProvider.listMessage = new ArrayList<>();
        UserDataProvider.listMessage.add(new ModelMessigeFragment(R.drawable.chat3,"Azat","v seti"));
        final LinearLayoutManager MessigeManager = new LinearLayoutManager(getContext());
        final AdapterMessigefragment adapterMessigefragment = new AdapterMessigefragment(UserDataProvider.listMessage, getActivity());
        final RecyclerView recyclerView = view.findViewById(R.id.rec_view2);
        recyclerView.setLayoutManager(MessigeManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterMessigefragment);
        return view;
    }

}
