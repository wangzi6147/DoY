package com.namitor.wangzi6147.doy.presenter;

import android.content.Context;

import com.namitor.wangzi6147.doy.bean.TaskBean;
import com.namitor.wangzi6147.doy.model.ITaskModel;
import com.namitor.wangzi6147.doy.model.TaskModel;
import com.namitor.wangzi6147.doy.view.activity.INewTaskView;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public class NewTaskPresenter implements INewTaskPresenter {
    private Context mContext;
    private ITaskModel taskModel;
    private INewTaskView iNewTaskView;
    public NewTaskPresenter(Context context, INewTaskView iNewTaskView) {
        //目前的Model还必须拿到context 没有完全解耦 之后待修改
        this.mContext = context;
        this.iNewTaskView = iNewTaskView;
        taskModel = new TaskModel(context);
    }

    @Override
    public void submit(String title, String content, int value) {
        if(taskModel.newTask(new TaskBean(title, content, value))){
            iNewTaskView.onSubmit();
        }
    }
}
