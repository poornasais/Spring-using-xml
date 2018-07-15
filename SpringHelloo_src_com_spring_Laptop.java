package com.spring;

public class Laptop implements Computer {

    private String product;
    private int id;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getProduct()+ " " +getId();
    }
}
