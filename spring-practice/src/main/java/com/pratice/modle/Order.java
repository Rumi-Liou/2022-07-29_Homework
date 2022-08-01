package com.pratice.modle;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Order {
    private int seq;
    private int price;
    private String waiter;
    private List<Meal> meals;

    public Order(){

    }

    public Order(int seq,int price,String waiter,List<Meal> meals){
        super();
        this.seq=seq;
        this.price=price;
        this.waiter=waiter;
        this.meals=meals;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public void setPrice(int totalPrice) {
        this.price = totalPrice;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public int getSeq() {
        return seq;
    }

    public int getPrice() {
        return price;
    }

    public String getWaiter() {
        return waiter;
    }

    public List<Meal> getMeals() {
        return meals;
    }
}
