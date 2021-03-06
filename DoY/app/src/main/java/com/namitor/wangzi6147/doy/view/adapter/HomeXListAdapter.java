package com.namitor.wangzi6147.doy.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.namitor.wangzi6147.doy.R;
import com.namitor.wangzi6147.doy.bean.TaskBean;
import com.namitor.wangzi6147.doy.presenter.ITaskPresenter;
import com.namitor.wangzi6147.doy.presenter.impl.TaskPresenter;
import com.namitor.wangzi6147.doy.view.ITaskView;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public class HomeXListAdapter extends BaseAdapter implements ITaskView {

    private ArrayList<TaskBean> tasks;
    private Context mContext;
    private ITaskPresenter taskPresenter;

    public HomeXListAdapter(Context context){
        this.mContext = context;
        taskPresenter = new TaskPresenter(context, this);
        taskPresenter.getData();
    }

    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Object getItem(int position) {
        return tasks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.layout_home_task_item, null);
        }
        TextView tvCenter = ViewHolder.get(convertView, R.id.tv_home_task_item_center);
        tvCenter.setText(tasks.get(position).getTitle());
        return convertView;
    }

    @Override
    public void setData(ArrayList<TaskBean> tasks) {
        this.tasks = tasks;
        notifyDataSetChanged();
    }

    public void refresh() {
        taskPresenter.getData();
    }

    public void loadMore() {
        taskPresenter.getData();
    }
}
