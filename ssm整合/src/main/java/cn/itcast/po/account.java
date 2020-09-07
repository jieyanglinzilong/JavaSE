package cn.itcast.po;

import java.io.Serializable;

public class account implements Serializable {
    private Integer aid;

    private  double money;
    private  Integer uid;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "account{" +
                "aid=" + aid +
                ", money=" + money +
                ", uid=" + uid +
                '}';
    }
}
