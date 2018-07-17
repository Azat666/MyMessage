package com.example.student.mymessige.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.student.mymessige.R;
import com.example.student.mymessige.adapters.AdapterPager;
import com.example.student.mymessige.models.ModelPager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<ModelPager> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new ModelPager(R.drawable.chat2));
        list.add(new ModelPager(R.drawable.chat3));

        AdapterPager adapter = new AdapterPager(this,list);
        ViewPager viewPager =  findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);


       TabLayout tabLayout = findViewById(R.id.tab_design);
        tabLayout.setupWithViewPager(viewPager);
    }

}