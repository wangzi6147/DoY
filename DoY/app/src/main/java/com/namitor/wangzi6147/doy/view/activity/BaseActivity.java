package com.namitor.wangzi6147.doy.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.namitor.wangzi6147.doy.R;
import com.namitor.wangzi6147.doy.view.widget.TopBar;

/**
 * Created by wangzi6147 on 2015/11/28.
 */
public abstract class BaseActivity extends Activity implements TopBar.OnTopBarClickListener{

    private TopBar mTopBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_base);
        baseInitViews();
    }

    private void baseInitViews(){
        mTopBar = (TopBar) findViewById(R.id.rl_activity_base_topbar);
        mTopBar.setOnTopBarClickListener(this);
    }

    protected void setActivityContentView(int layoutResId){
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll_base_activity_content_view);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(layoutResId, null);
        ll.addView(contentView);
        findViews();
        initViews();
    }

    protected abstract void findViews();

    protected abstract void initViews();

    protected TopBar getTopBar() {
        return mTopBar;
    }

    @Override
    public void onRightClick() {

    }

    @Override
    public void onLeftClick() {

    }

    @Override
    public void onCenterClick() {

    }
}
