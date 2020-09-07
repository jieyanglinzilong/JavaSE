package com.itheima.domin;

import java.io.Serializable;

public class tranfer implements Serializable {
    private Integer id;
    private double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "tranfer{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
