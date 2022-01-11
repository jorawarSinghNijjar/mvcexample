package com.jorawar.mvcexample.controller;

import com.jorawar.mvcexample.model.Order;
import com.jorawar.mvcexample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("order", new Order());
        return "index";
    }

    @GetMapping("/orders")
    public String orderList(Model model){
        List<Order> orders = orderService.getOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @PostMapping("/orders")
    public String saveOrder(@ModelAttribute Order order, Model model){
        List<Order> orders = orderService.saveOrderInCache(order);
        model.addAttribute("orders", orders);
        return "orders";
    }
}
