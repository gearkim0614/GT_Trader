package com.example.gttrader.Entity;

<<<<<<< HEAD
public class Goods {
    protected String name;
    protected double price;
    protected int quantity;

    public Goods(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
=======
public abstract class Goods {
    protected double price;
    protected String name;
    protected int quantity;

    public Goods(double price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
>>>>>>> c272000fc0363fc88b3bc77dd5d5949570c0dc7c
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

<<<<<<< HEAD
=======
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

>>>>>>> c272000fc0363fc88b3bc77dd5d5949570c0dc7c
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
