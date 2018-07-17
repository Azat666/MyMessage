package com.example.student.mymessige.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.student.mymessige.R;
import com.example.student.mymessige.fragments.ChatFragment;
import com.example.student.mymessige.fragments.ProfileFragment;
import com.example.student.mymessige.providers.UserDataProvider;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Toast.makeText(LastActivity.this, String.valueOf(UserDataProvider.hello), Toast.LENGTH_SHORT).show();
        if (UserDataProvider.hello == 0){
            Bundle bundle = new Bundle();
            ProfileFragment profileFragment = new ProfileFragment();
            bundle.putInt("MY_KEY", getIntent().getExtras().getInt("MY_KEY"));
            profileFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.last_container, profileFragment).commit();
        }else {
            Bundle bundle = new Bundle();
            ChatFragment chatFragment = new ChatFragment();
            bundle.putInt("MY_KEY", getIntent().getExtras().getInt("MY_KEY"));
            chatFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.last_container, chatFragment).commit();
        }
    }
}
