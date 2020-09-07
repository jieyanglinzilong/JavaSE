package com.itheima.domin;

import java.io.Serializable;

public class Ordersitem implements Serializable {
    private  Integer id;
    private Integer order_id;
    private Integer product_id;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ordersitem{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
}
