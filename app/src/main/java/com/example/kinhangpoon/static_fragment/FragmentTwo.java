package com.example.kinhangpoon.static_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by KinhangPoon on 30/1/2018.
 */

public class FragmentTwo extends Fragment {
   TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmenttwo,container,false);
        tv = v.findViewById(R.id.data);
        return v;
    }

    public void myResult(String s){
        tv.setText(s);
    }
}
