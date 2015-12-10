package com.namitor.wangzi6147.doy.presenter.impl;

import android.content.Context;

import com.namitor.wangzi6147.doy.bean.UserBean;
import com.namitor.wangzi6147.doy.model.IUserModel;
import com.namitor.wangzi6147.doy.model.impl.UserModel;
import com.namitor.wangzi6147.doy.presenter.IUserPresenter;
import com.namitor.wangzi6147.doy.view.IBaseView;
import com.namitor.wangzi6147.doy.view.IUserView;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public class UserPresenter implements IUserPresenter {
    private Context mContext;
    private IBaseView iBaseView;
    private IUserModel mUserModel;

    public UserPresenter(Context context, IBaseView iBaseView){
        this.mContext = context;
        this.iBaseView = iBaseView;
        mUserModel = new UserModel(context);
    }

    @Override
    public void getUser() {
        UserBean user = mUserModel.getUser();
        ((IUserView)iBaseView).setData(user);
    }

    @Override
    public void setUser(String userID, int bCoin) {
        mUserModel.setUser(new UserBean(userID, bCoin));
    }
}
