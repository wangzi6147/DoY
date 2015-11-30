package com.namitor.wangzi6147.doy.view.activity;

import android.os.Bundle;

import com.namitor.wangzi6147.doy.R;

/**
 * Created by wangzi6147 on 2015/11/29.
 */
public class NewTaskActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityContentView(R.layout.activity_new_task);
        getTopBar().hide();
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void findViews() {

    }
}
