package com.namitor.wangzi6147.doy.bean;

/**
 * Created by wangzi6147 on 2015/12/2.
 */
public class TaskBean {
    private String title;
    private String content;
    private int value;

    public TaskBean(){

    }
    public TaskBean(String title, String content, int value){
        this.title = title;
        this.content = content;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
