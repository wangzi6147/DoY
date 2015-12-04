package com.namitor.wangzi6147.doy.model.impl;

import android.content.Context;
import android.content.SharedPreferences;

import com.namitor.wangzi6147.doy.constants.Constants;
import com.namitor.wangzi6147.doy.bean.UserBean;
import com.namitor.wangzi6147.doy.model.IUserModel;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public class UserModel implements IUserModel {
    private Context mContext;

    public UserModel(Context context) {
        this.mContext = context;
    }

    @Override
    public UserBean getUser() {
        UserBean user = null;
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(Constants.SP_USER_NAME, Context.MODE_PRIVATE);
        String userID = sharedPreferences.getString(Constants.SP_USERID, null);
        int bCoin = sharedPreferences.getInt(Constants.SP_BCOIN, 0);
        if (userID == null) {
            user = new UserBean();
            setUser(user);
        } else {
            user = new UserBean(userID, bCoin);
        }
        return user;
    }

    @Override
    public boolean setUser(UserBean user) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(Constants.SP_USER_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(Constants.SP_USERID, user.getUserID());
        edit.putInt(Constants.SP_BCOIN, user.getbCoin());
        return edit.commit();
    }
}
