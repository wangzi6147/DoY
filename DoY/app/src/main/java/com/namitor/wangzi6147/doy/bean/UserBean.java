package com.namitor.wangzi6147.doy.bean;

/**
 * Created by wangzi6147 on 2015/12/4.
 */
public class UserBean {
    public UserBean(){
        userID = "Anonym";
        bCoin = 50;
    }

    public UserBean(String userID, int bCoin){
        this.userID = userID;
        this.bCoin = bCoin;
    }

    private String userID;
    private int bCoin;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getbCoin() {
        return bCoin;
    }

    public void setbCoin(int bCoin) {
        this.bCoin = bCoin;
    }
}
