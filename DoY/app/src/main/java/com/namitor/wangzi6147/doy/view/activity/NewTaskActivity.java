package com.namitor.wangzi6147.doy.view.activity;

import android.os.Bundle;
import android.view.View;

import com.namitor.wangzi6147.doy.R;

/**
 * Created by wangzi6147 on 2015/11/29.
 */
public class NewTaskActivity extends BaseActivity implements View.OnClickListener{

    private View mLeftView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityContentView(R.layout.activity_new_task);
        getTopBar().hide();
    }

    @Override
    protected void findViews() {
        mLeftView = findViewById(R.id.v_activity_new_left_blank);
    }

    @Override
    protected void initViews() {
        mLeftView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.v_activity_new_left_blank:
                finish();
                break;
            default:
                break;
        }
    }
}
