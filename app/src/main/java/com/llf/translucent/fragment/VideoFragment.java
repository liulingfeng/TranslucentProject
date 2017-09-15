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

public class VideoFragment extends Fragment{
    private VideoFragment(){

    }

    public static VideoFragment getInstance() {
        VideoFragment videoFragment = new VideoFragment();
        videoFragment.setArguments(new Bundle());
        return videoFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_video, container, false);
    }
}
