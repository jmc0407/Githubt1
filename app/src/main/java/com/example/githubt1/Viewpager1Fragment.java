package com.example.githubt1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class Viewpager1Fragment extends android.support.v4.app.Fragment {

    public Viewpager1Fragment() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        RelativeLayout layout =(RelativeLayout) inflater.inflate(R.layout.fragment_viewpager1,container,false);
        return layout;
    }
}

