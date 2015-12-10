package com.namitor.wangzi6147.doy.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.namitor.wangzi6147.doy.R;
import com.namitor.wangzi6147.doy.view.adapter.HomeXListAdapter;
import com.namitor.wangzi6147.doy.view.widget.xlist.XListView;

/**
 * Created by wangzi6147 on 2015/11/28.
 */
public class HomeActivity extends BaseActivity implements XListView.IXListViewListener{

    private XListView mXListView;
    private HomeXListAdapter mXListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityContentView(R.layout.activity_home);
    }

    @Override
    protected void findViews() {
        mXListView = (XListView) findViewById(R.id.xlv_activity_home);
    }

    @Override
    protected void initViews() {
        mXListAdapter = new HomeXListAdapter(this);
        mXListView.setAdapter(mXListAdapter);
        mXListView.setPullLoadEnable(true);
        mXListView.setPullRefreshEnable(true);
        mXListView.setXListViewListener(this);
    }


    @Override
    public void onRightClick() {
        super.onRightClick();
        Intent intent = new Intent(this, NewTaskActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLeftClick() {
        super.onLeftClick();
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }

    private void onLoad(){
        mXListView.stopLoadMore();
        mXListView.stopRefresh();
        mXListView.setRefreshTime("刚刚");
    }

    @Override
    public void onRefresh() {
        mXListAdapter.refresh();
        onLoad();
    }

    @Override
    public void onLoadMore() {
        mXListAdapter.loadMore();
        onLoad();
    }
}
