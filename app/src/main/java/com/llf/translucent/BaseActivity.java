package com.llf.translucent;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.llf.translucent.util.StatusBarUtil;

/**
 * Created by llf on 2017/9/14.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setSlide();
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        initView();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }

    protected void setStatusBar() {
        StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimary));
    }

    //获取布局
    protected abstract int getLayoutId();

    //初始化布局和监听
    protected abstract void initView();

    //设置向右滑动
    protected abstract void setSlide();
}
