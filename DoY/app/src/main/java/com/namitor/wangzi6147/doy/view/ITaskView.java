package com.namitor.wangzi6147.doy.view;

import com.namitor.wangzi6147.doy.bean.TaskBean;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public interface ITaskView extends IBaseView{
    void setData(ArrayList<TaskBean> tasks);
}
