package lzl.com.example.demo.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Tranfer implements Serializable {
    private Integer tid;
    private Integer uid;
    private Integer rid;
    private double money;
    private Timestamp time;

    public Integer getTid() {
        return tid;
    }

    @Override
    public String toString() {
        return "Tranfer{" +
                "tid=" + tid +
                ", uid=" + uid +
                ", rid=" + rid +
                ", money=" + money +
                ", time=" + time +
                '}';
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
