package com.itheima.domin;

import java.io.Serializable;

public class room implements Serializable {
    private Integer id;
    private String room_no;
    private String building;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "room{" +
                "id=" + id +
                ", room_no='" + room_no + '\'' +
                ", building='" + building + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
