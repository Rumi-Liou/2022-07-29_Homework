package com.pratice.service;

import com.pratice.modle.Meal;
import com.pratice.modle.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    List<Meal> mealList=new ArrayList<>();
    List<Order> OrderList=new ArrayList<>();
    public  OrderService(){
        super();
        this.mealList.add(new Meal("hamburger",100,"delicious"));
        this.OrderList.add(new Order(1,1000,"John",mealList));
    }
    public Meal getMealList(String name){
        for (int i = 0; i < this.mealList.size(); i++) {
            if (this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.mealList.get(i);
            }
        }
        return null;
    }

    public Order getOrder(int seq){

        for (int i = 0; i < this.OrderList.size(); i++) {
            if (this.OrderList.get(i).getSeq()==seq) {
                return this.OrderList.get(i);
            }
        }
        return null;
    }

    public int addTotal() {
        int sum=0;
        for(int i=0;i< this.OrderList.size();i++){
            sum=sum+OrderList.get(i).getPrice();

        }
        return sum;
    }
}

