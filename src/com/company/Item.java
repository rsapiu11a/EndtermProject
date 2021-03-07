package com.company;

import java.util.Date;

public class Item {
    private String order_id;
    private int order_item_id;
    private String product_id;
    private String seller_id;
    private String shipping_limit_date;
    private double price;
    private double freight_value;

    public Item(){

    }

    public Item(String order_id, int order_item_id, String product_id, String seller_id, String shipping_limit_date, double price, double freight_value){
        this.order_id = order_id;
        this.order_item_id = order_item_id;
        this.product_id = product_id;
        this.seller_id = seller_id;
        this.shipping_limit_date = shipping_limit_date;
        this.price = price;
        this.freight_value = freight_value;
    }

    public String getShipping_limit_date() {
        return shipping_limit_date;
    }

    public double getFreight_value() {
        return freight_value;
    }

    public double getPrice() {
        return price;
    }

    public int getOrder_item_id() {
        return order_item_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setFreight_value(double freight_value) {
        this.freight_value = freight_value;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setOrder_item_id(int order_item_id) {
        this.order_item_id = order_item_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public void setShipping_limit_date(String shipping_limit_date) {
        this.shipping_limit_date = shipping_limit_date;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
