package com.it.domin;

import java.util.List;

public class Area {
    private  String area;
    private  int id;
    private  int pid;
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Area{" +
                "area='" + area + '\'' +
                ", id=" + id +
                ", pid=" + pid +
                '}';
    }
}
