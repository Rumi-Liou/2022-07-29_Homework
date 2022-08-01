package com.pratice.service;

import com.pratice.modle.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class MealService {
    List<Meal> mealList=new ArrayList<>();
    public  MealService(List<Meal> mealList){
        super();
        this.mealList.add(new Meal("hamburger",100,"delicious"));
    }
    public Meal getMealList(String name){
        for (int i = 0; i < this.mealList.size(); i++) {
            if (this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.mealList.get(i);
            }
        }
        return null;
    }
}
