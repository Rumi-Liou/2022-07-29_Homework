package com.pratice.controller;

import com.pratice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TotalController {
    @Autowired
    OrderService orderService;

    @GetMapping("/total")
    public String addPrice(Model model){
        int total=this.orderService.addTotal();
        model.addAttribute("total",total);
        return "total";
    }
}
