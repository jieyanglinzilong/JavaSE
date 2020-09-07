package com.itheima.domain;

import java.util.Date;

public class students {
    private  int  userid;
    private  String userName;
    private Date brithday;
    private  String Address;
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "students{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", brithday=" + brithday +
                ", Address='" + Address + '\'' +
                '}';
    }
}
