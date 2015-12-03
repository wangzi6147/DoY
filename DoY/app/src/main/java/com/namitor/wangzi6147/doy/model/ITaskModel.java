package com.namitor.wangzi6147.doy.model;

import com.namitor.wangzi6147.doy.model.bean.TaskBean;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public interface ITaskModel {
    ArrayList<TaskBean> getData();
    boolean newTask(TaskBean task);
}
