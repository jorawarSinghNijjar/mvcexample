package com.jorawar.mvcexample.service;

import com.jorawar.mvcexample.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    List<Order> orders = new ArrayList<>();

    public List<Order> saveOrderInCache(Order order){
        order.setDate(new Date());
        orders.add(order);
        return orders;
    }

    public List<Order> getOrders(){
        return orders;
    }
}
