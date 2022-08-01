package com.pratice.controller;

import com.pratice.modle.Order;
import com.pratice.service.MealService;
import com.pratice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("{seq}")
    public String getOrder(@PathVariable int seq, Model model){
        Order order=this.orderService.getOrder(seq);
        model.addAttribute("order",order);
        return "order";
    }
}


