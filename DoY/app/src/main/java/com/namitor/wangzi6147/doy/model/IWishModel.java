package com.namitor.wangzi6147.doy.model;

import com.namitor.wangzi6147.doy.model.bean.WishBean;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public interface IWishModel {
    ArrayList<WishBean> getData();
    boolean setData(WishBean wish);
}
