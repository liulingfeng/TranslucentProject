package com.llf.translucent.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.llf.translucent.DetailActivity;
import com.llf.translucent.R;

/**
 * Created by Administrator on 2017/9/15.
 */

public class NewsFragment extends Fragment {
    private Button btnDetail;

    private NewsFragment() {

    }

    public static NewsFragment getInstance() {
        NewsFragment newsFragment = new NewsFragment();
        newsFragment.setArguments(new Bundle());
        return newsFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        btnDetail = view.findViewById(R.id.btn_detail);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), DetailActivity.class));
            }
        });
    }
}
