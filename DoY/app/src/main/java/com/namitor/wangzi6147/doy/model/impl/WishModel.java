package com.namitor.wangzi6147.doy.model.impl;

import android.content.Context;
import android.content.SharedPreferences;

import com.alibaba.fastjson.JSON;
import com.namitor.wangzi6147.doy.constants.Constants;
import com.namitor.wangzi6147.doy.model.bean.WishBean;
import com.namitor.wangzi6147.doy.model.IWishModel;

import java.util.ArrayList;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public class WishModel implements IWishModel {
    private Context mContext;

    public WishModel(Context context){
        this.mContext = context;
    }
    @Override
    public ArrayList<WishBean> getData() {
        ArrayList<WishBean> tasks = new ArrayList<>();
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(Constants.SP_WISH_NAME, Context.MODE_PRIVATE);
        for(int i = 0;i<sharedPreferences.getInt(Constants.SP_SIZE, 0);i++){
            String jsonString = sharedPreferences.getString(i + "", null);
            if(jsonString!=null){
                WishBean task = JSON.parseObject(jsonString, WishBean.class);
                tasks.add(task);
            }
        }
        return tasks;
    }

    @Override
    public boolean setData(WishBean wish) {
        String jsonString = JSON.toJSONString(wish);
        int size = 0;
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(Constants.SP_WISH_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if(!sharedPreferences.contains(Constants.SP_SIZE)){
            edit.putInt(Constants.SP_SIZE, 0);
        }else {
            size = sharedPreferences.getInt(Constants.SP_SIZE, 0);
        }
        edit.putInt(Constants.SP_SIZE, size + 1);
        edit.putString(size + "", jsonString);
        return edit.commit();
    }
}
