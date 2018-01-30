package com.example.kinhangpoon.static_fragment;

import android.app.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by KinhangPoon on 30/1/2018.
 */

public class FragmentOne extends Fragment {
    MyInterface myInterface;

    @Override
    public void onAttach(Context context) { // v4 onAttach works
        super.onAttach(context);
        myInterface = (MyInterface) getActivity();
        Log.e("mylog","onAttach");
    }



    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentone,container,false);
        Button b = v.findViewById(R.id.buttonPass);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                myInterface = (MyInterface) getActivity();
                Log.e("mylog","onClick");
                myInterface.sendMessage("This is data");

            }
        });
        return v;
    }



}
