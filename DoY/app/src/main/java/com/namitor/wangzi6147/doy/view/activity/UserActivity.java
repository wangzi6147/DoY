package com.namitor.wangzi6147.doy.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.namitor.wangzi6147.doy.R;
import com.namitor.wangzi6147.doy.bean.UserBean;
import com.namitor.wangzi6147.doy.presenter.IUserPresenter;
import com.namitor.wangzi6147.doy.presenter.impl.UserPresenter;
import com.namitor.wangzi6147.doy.view.IUserView;

/**
 * Created by wangzi6147 on 2015/12/10.
 */
public class UserActivity extends BaseActivity implements View.OnClickListener, IUserView{

    private TextView mNameTv, mCoinTv;
    private View mRightView;
    private IUserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityContentView(R.layout.activity_user);
        getTopBar().hide();
    }

    @Override
    protected void findViews() {
        mNameTv = (TextView) findViewById(R.id.tv_user_name);
        mCoinTv = (TextView) findViewById(R.id.tv_user_coin);
        mRightView = findViewById(R.id.v_activity_user_right_blank);
    }

    @Override
    protected void initViews() {
        userPresenter = new UserPresenter(this, this);
        userPresenter.getUser();
        mRightView.setOnClickListener(this);
    }

    @Override
    public void setData(UserBean userBean) {
        mNameTv.setText(userBean.getUserID());
        mCoinTv.setText(userBean.getbCoin()+"");
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.activity_in_from_left, R.anim.activity_out_to_left);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.v_activity_user_right_blank:
                finish();
                break;
            default:
                break;
        }
    }
}
