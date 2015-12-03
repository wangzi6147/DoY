package com.namitor.wangzi6147.doy.presenter;

import android.content.Context;

import com.namitor.wangzi6147.doy.model.bean.TaskBean;
import com.namitor.wangzi6147.doy.model.ITaskModel;
import com.namitor.wangzi6147.doy.model.TaskModel;
import com.namitor.wangzi6147.doy.view.adapter.IHomeXListView;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public class HomeXListPresenter implements IHomeXListPresenter {
    private ITaskModel taskModel;
    private Context mContext;
    private IHomeXListView iHomeXListView;
    public HomeXListPresenter(Context context, IHomeXListView iHomeXListView) {
        this.mContext  = context;
        this.iHomeXListView = iHomeXListView;
        taskModel = new TaskModel(context);
    }

    @Override
    public void getData() {
        ArrayList<TaskBean> data = taskModel.getData();
        if(data!=null){
            iHomeXListView.setData(data);
        }
    }
}
