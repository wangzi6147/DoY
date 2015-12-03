package com.namitor.wangzi6147.doy.model.bean;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public class WishBean {
    public WishBean(){}

    public WishBean(String title, String content, int value){
        this.title = title;
        this.content = content;
        this.value = value;
    }

    private String title;
    private String content;
    private int value;

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
