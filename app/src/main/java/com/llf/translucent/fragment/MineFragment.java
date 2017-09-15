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

public class MineFragment extends Fragment {
    private MineFragment() {

    }

    public static MineFragment getInstance() {
        MineFragment mineFragment = new MineFragment();
        mineFragment.setArguments(new Bundle());
        return mineFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mine, container, false);
    }
}
