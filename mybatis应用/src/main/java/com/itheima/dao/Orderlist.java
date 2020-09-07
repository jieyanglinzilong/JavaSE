package com.itheima.dao;

import com.itheima.PO.OrderProduct;
import com.itheima.domin.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Orderlist {
   List<Order> find(int id);

}
