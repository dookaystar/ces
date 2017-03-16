package com.example.administrator.ces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.GetStrin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetStrin.getsh("SS");



    }
}
