package com.namitor.wangzi6147.doy.view;

import com.namitor.wangzi6147.doy.bean.WishBean;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public interface IWishView extends IBaseView {
    void setData(ArrayList<WishBean> tasks);
}
