package com.namitor.wangzi6147.doy.model;

import android.content.Context;
import android.content.SharedPreferences;

import com.alibaba.fastjson.JSON;
import com.namitor.wangzi6147.doy.bean.TaskBean;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public class TaskModel implements ITaskModel {
    private static String SP_NAME = "tasks";
    private static String SP_SIZE = "size";
    private Context mContext;

    public TaskModel(Context context){
        this.mContext = context;
    }
    @Override
    public ArrayList<TaskBean> getData() {
        ArrayList<TaskBean> tasks = new ArrayList<>();
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        for(int i = 0;i<sharedPreferences.getInt(SP_SIZE, 0);i++){
            String jsonString = sharedPreferences.getString(i + "", null);
            if(jsonString!=null){
                TaskBean task = JSON.parseObject(jsonString, TaskBean.class);
                tasks.add(task);
            }
        }
        return tasks;
    }

    @Override
    public boolean newTask(TaskBean task) {
        String jsonString = JSON.toJSONString(task);
        int size = 0;
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if(!sharedPreferences.contains(SP_SIZE)){
            edit.putInt(SP_SIZE, 0);
        }else {
            size = sharedPreferences.getInt(SP_SIZE, 0);
        }
        edit.putInt(SP_SIZE, size + 1);
        edit.putString(size + "", jsonString);
        return edit.commit();
    }
}
