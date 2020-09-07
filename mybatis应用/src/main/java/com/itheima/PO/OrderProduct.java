package com.itheima.PO;

import com.itheima.domin.Order;
import com.itheima.domin.product;

import java.util.List;

public class OrderProduct {
    List<Order> orders;
    List<product> products;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "orders=" + orders +
                ", products=" + products +
                '}';
    }

    public void setProducts(List<product> products) {
        this.products = products;
    }
}
