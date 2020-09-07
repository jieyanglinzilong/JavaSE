package com.itheima.domin;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    private Integer id;
    private String number;
    private int user_id;
    private List<product> productList;
    private List<Ordersitem> ordersitem;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", user_id=" + user_id +
                ", productList=" + productList +
                ", ordersitem=" + ordersitem +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public List<product> getProductList() {
        return productList;
    }

    public void setProductList(List<product> productList) {
        this.productList = productList;
    }

    public List<Ordersitem> getOrdersitem() {
        return ordersitem;
    }

    public void setOrdersitem(List<Ordersitem> ordersitem) {
        this.ordersitem = ordersitem;
    }
}
