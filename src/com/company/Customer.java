package com.company;

public class Customer {
    private String customer_id;
    private String customer_unique_id;
    private String zip_code;
    private String customer_city;
    private String customer_state;

    public Customer(String next, String customer_unique_id, String zip_code, String[] split, String customer_state){

    }

    public Customer(String customer_id, String customer_unique_id, String zip_code, String customer_city, String customer_state ){
        this.customer_id = customer_id;
        this.customer_unique_id = customer_unique_id;
        this.zip_code = zip_code;
        this.customer_city = customer_city;
        this.customer_state = customer_state;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_unique_id() {
        return customer_unique_id;
    }

    public String getZip_code() {
        return zip_code;
    }

    public String getCustomer_city() {
        return customer_city;
    }

    public String getCustomer_state() {
        return customer_state;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setCustomer_unique_id(String customer_unique_id) {
        this.customer_unique_id = customer_unique_id;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public void setCustomer_city(String customer_city) {
        this.customer_city = customer_city;
    }

    public void setCustomer_state(String customer_state) {
        this.customer_state = customer_state;
    }
}
