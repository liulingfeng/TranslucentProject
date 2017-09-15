package com.llf.translucent;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.r0adkll.slidr.Slidr;

/**
 * Created by llf on 2017/9/15.
 */

public class DetailActivity extends BaseActivity {
    private Toolbar mToolbar;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_detail;
    }

    @Override
    protected void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void setSlide() {
        Slidr.attach(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
