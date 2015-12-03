package com.namitor.wangzi6147.doy.model;

import com.namitor.wangzi6147.doy.model.bean.UserBean;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public interface IUserModel {
    UserBean getUser();
    boolean setUser(UserBean user);
}
