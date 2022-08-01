package com.pratice.controller;

import com.pratice.modle.Meal;
import com.pratice.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/meal")
public class MealController {
    @Autowired
    MealService mealService;

    @GetMapping()
    public String getMeal(@RequestParam String name, Model model){
        Meal meal=this.mealService.getMealList(name);
        model.addAttribute("meal",meal);
        return "meal";
    }
}
