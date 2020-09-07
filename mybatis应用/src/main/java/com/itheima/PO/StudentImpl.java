package com.itheima.PO;

import com.itheima.domin.room;

import java.io.Serializable;
import java.util.List;

public class StudentImpl implements Serializable {
    private Integer id;
    private String name;
    private String phone;
    private String department;
    private  String room_no;
    private  String major;
    List<room> roomList;

    @Override
    public String toString() {
        return "StudentImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                ", room_no='" + room_no + '\'' +
                ", major='" + major + '\'' +
                ", roomList=" + roomList +
                '}';
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public List<room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<room> roomList) {
        this.roomList = roomList;
    }
}
