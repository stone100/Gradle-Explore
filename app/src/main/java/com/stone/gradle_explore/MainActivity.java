package com.stone.gradle_explore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.stone.library.DevUtil;
import com.stone.library.FakeBiz;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindEvents();
    }

    private void bindEvents() {
        findViewById(R.id.call_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getGreetingString(), Toast.LENGTH_SHORT).show();
                logForButtonClicked();
            }
        });
    }

    private void logForButtonClicked() {
        if(DevUtil.isDebug()) {
            Log.d("_stone_", "logForButtonClicked: button clicked !! (debug)");
        } else {
            Log.d("_stone_", "logForButtonClicked: button clicked !! (release)");
        }
    }

    private String getGreetingString() {
        return new FakeBiz().greeting();
    }
}
