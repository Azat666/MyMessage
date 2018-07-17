package com.example.student.mymessige.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.student.mymessige.R;
import com.example.student.mymessige.activity.MainActivity;
import com.example.student.mymessige.activity.UserActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        int position = getArguments().getInt("MY_KEY");
        ImageView imageView = view.findViewById(R.id.image123);
        imageView.setImageResource(MainActivity.list.get(position).getImageId());
        return view;
    }

}
