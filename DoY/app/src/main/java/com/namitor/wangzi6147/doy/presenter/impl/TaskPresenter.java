package com.namitor.wangzi6147.doy.presenter.impl;

import android.content.Context;

import com.namitor.wangzi6147.doy.bean.TaskBean;
import com.namitor.wangzi6147.doy.model.ITaskModel;
import com.namitor.wangzi6147.doy.model.impl.TaskModel;
import com.namitor.wangzi6147.doy.presenter.ITaskPresenter;
import com.namitor.wangzi6147.doy.view.IBaseView;
import com.namitor.wangzi6147.doy.view.INewTaskView;
import com.namitor.wangzi6147.doy.view.ITaskView;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public class TaskPresenter implements ITaskPresenter {
    private Context mContext;
    private ITaskModel mTaskModel;
    private IBaseView iBaseView;
    public TaskPresenter(Context context, IBaseView iBaseView) {
        //目前的Model还必须拿到context 没有完全解耦 之后待修改
        this.mContext = context;
        this.iBaseView = iBaseView;
        mTaskModel = new TaskModel(context);
    }

    @Override
    public void getData() {
        ArrayList<TaskBean> data = mTaskModel.getData();
        if(data!=null){
            ((ITaskView)iBaseView).setData(data);
        }
    }

    @Override
    public void newTask(String title, String content, int value) {
        if(mTaskModel.newTask(new TaskBean(title, content, value))){
            ((INewTaskView)iBaseView).onSubmit();
        }
    }
}
