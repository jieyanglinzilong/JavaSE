package com.itheima.domain;

public class Account {
    private int ID;
    private  int UID;
    private double Money;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", UID=" + UID +
                ", Money=" + Money +
                '}';
    }
}
