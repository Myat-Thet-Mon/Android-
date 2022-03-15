package com.myatthet.hi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
    public Fragment3(){

    }
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return layoutInflater.inflate(R.layout.tag_fragment3,viewGroup,false);
    }


}
