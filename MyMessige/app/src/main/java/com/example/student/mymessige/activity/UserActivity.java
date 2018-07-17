package com.example.student.mymessige.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


import com.example.student.mymessige.R;
import com.example.student.mymessige.fragments.CallFragment;
import com.example.student.mymessige.fragments.EmailFragment;
import com.example.student.mymessige.fragments.MessigeFragment;


public class UserActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);


        getSupportFragmentManager().beginTransaction().add(R.id.con, new CallFragment()).addToBackStack(null).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.call:
                        getSupportFragmentManager().beginTransaction().replace(R.id.con, new CallFragment()).addToBackStack(null).commit();
                        return true;
                    case R.id.email:
                        getSupportFragmentManager().beginTransaction().replace(R.id.con,new EmailFragment()).addToBackStack(null).commit();
                        return true;
                    case R.id.message:
                         getSupportFragmentManager().beginTransaction().replace(R.id.con,new MessigeFragment()).addToBackStack(null).commit();
                        return true;

                }
                return false;
            }
        });

    }

}
