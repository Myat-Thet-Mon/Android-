package com.myatthet.hi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    public Fragment1(){

    }
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return layoutInflater.inflate(R.layout.tag_fragment1,viewGroup,false);
    }
}
