package com.llf.translucent;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

import com.llf.translucent.fragment.GirlFragment;
import com.llf.translucent.fragment.MineFragment;
import com.llf.translucent.fragment.NewsFragment;
import com.llf.translucent.fragment.VideoFragment;
import com.llf.translucent.util.StatusBarUtil;

public class MainActivity extends BaseActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {
    private Button journalism, video, girl, mine;
    private ViewPager mViewPager;
    private Fragment[] fragments;

    static {
        //vector支持selector
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        journalism = (Button) findViewById(R.id.journalism);
        video = (Button) findViewById(R.id.video);
        girl = (Button) findViewById(R.id.girl);
        mine = (Button) findViewById(R.id.mine);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        journalism.setOnClickListener(this);
        video.setOnClickListener(this);
        girl.setOnClickListener(this);
        mine.setOnClickListener(this);

        fragments = new Fragment[4];
        fragments[0] = NewsFragment.getInstance();
        fragments[1] = VideoFragment.getInstance();
        fragments[2] = GirlFragment.getInstance();
        fragments[3] = MineFragment.getInstance();
        BaseFragmentAdapter mAdapter = new BaseFragmentAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setAdapter(mAdapter);
        mViewPager.addOnPageChangeListener(this);
        journalism.setSelected(true);
    }

    @Override
    protected void setSlide() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.journalism:
                mViewPager.setCurrentItem(0, false);
                break;
            case R.id.video:
                mViewPager.setCurrentItem(1, false);
                break;
            case R.id.girl:
                mViewPager.setCurrentItem(2, false);
                break;
            case R.id.mine:
                mViewPager.setCurrentItem(3, false);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        resetTab();
        switch (position) {
            case 0:
                journalism.setSelected(true);
                break;
            case 1:
                video.setSelected(true);
                break;
            case 2:
                girl.setSelected(true);
                break;
            case 3:
                mine.setSelected(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private void resetTab() {
        journalism.setSelected(false);
        video.setSelected(false);
        girl.setSelected(false);
        mine.setSelected(false);
    }

    @Override
    protected void setStatusBar() {
        StatusBarUtil.setTranslucentForImageViewInFragment(MainActivity.this, null);
    }
}
