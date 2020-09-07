package lzl.com.example.demo.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer aid;
    private Integer uid;
    private Double money;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
