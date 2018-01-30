package com.example.kinhangpoon.static_fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendMessage(String s) {
        FragmentTwo f = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment2);
        f.myResult(s);
    }
}

