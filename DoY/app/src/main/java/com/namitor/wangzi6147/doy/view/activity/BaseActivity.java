package com.namitor.wangzi6147.doy.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.namitor.wangzi6147.doy.R;

/**
 * Created by wangzi6147 on 2015/11/28.
 */
public abstract class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_base);
    }

    protected void setActivityContentView(int layoutResId){
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll_base_activity_content_view);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(layoutResId, null);
        ll.addView(contentView);
        findViews();
        initViews();
    }

    protected abstract void initViews();

    protected abstract void findViews();
}
