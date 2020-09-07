package lzl.com.example.demo.domain;

import java.io.Serializable;

public class Point implements Serializable {
    private Integer Pid;
    private Integer uid;
    private Integer point;
    private Integer rank;

    public Integer getPid() {
        return Pid;
    }

    public void setPid(Integer pid) {
        Pid = pid;
    }

    @Override
    public String toString() {
        return "Point{" +
                "Pid=" + Pid +
                ", uid=" + uid +
                ", point=" + point +
                ", rank=" + rank +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
