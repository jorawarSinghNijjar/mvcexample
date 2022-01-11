package com.jorawar.mvcexample.model;

import java.util.Date;

public class Order {

    private String modelName;
    private int screenSize;
    private int quantity;
    private Date date;

    public Order() {
    }

    public Order(String modelName, int screenSize, int quantity) {
        this.modelName = modelName;
        this.screenSize = screenSize;
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
