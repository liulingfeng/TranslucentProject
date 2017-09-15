package com.llf.translucent.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.llf.translucent.R;

/**
 * Created by Administrator on 2017/9/15.
 */

public class GirlFragment extends Fragment{
    private GirlFragment(){

    }

    public static GirlFragment getInstance() {
        GirlFragment girlFragment = new GirlFragment();
        girlFragment.setArguments(new Bundle());
        return girlFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_girl, container, false);
    }
}
