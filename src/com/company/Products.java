package com.company;

public class Products {
    private String product_id;
    private String product_category_name;
    private int product_name_length;
    private int product_description_lenght;
    private int product_photos_qty;
    private int product_weight_g;
    private int product_length_cm;
    private int product_height_cm;
    private int product_width_cm;
    private String[][] top10;

    public Products(){}

    public Products(String product_id,
                    String product_category_name,
                    int product_name_length,
                    int product_description_lenght,
                    int product_photos_qty,
                    int product_weight_g,
                    int product_length_cm,
                    int product_height_cm,
                    int product_width_cm) {
        this.product_id = product_id;
        this.product_category_name = product_category_name;
        this.product_name_length = product_name_length;
        this.product_description_lenght = product_description_lenght;
        this.product_photos_qty = product_photos_qty;
        this.product_weight_g = product_weight_g;
        this.product_length_cm = product_length_cm;
        this.product_height_cm = product_height_cm;
        this.product_width_cm = product_width_cm;

    }

    public String getProduct_id() {
        return product_id;
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public int getProduct_name_length() {
        return product_name_length;
    }

    public int getProduct_description_lenght() {
        return product_description_lenght;
    }

    public int getProduct_photos_qty() {
        return product_photos_qty;
    }

    public int getProduct_weight_g() {
        return product_weight_g;
    }

    public int getProduct_length_cm() {
        return product_length_cm;
    }

    public int getProduct_height_cm() {
        return product_height_cm;
    }

    public int getProduct_width_cm() {
        return product_width_cm;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setProduct_category_name(String product_category_name) {
        this.product_category_name = product_category_name;
    }

    public void setProduct_name_length(int product_name_length) {
        this.product_name_length = product_name_length;
    }

    public void setProduct_description_lenght(int product_description_lenght) {
        this.product_description_lenght = product_description_lenght;
    }

    public void setProduct_photos_qty(int product_photos_qty) {
        this.product_photos_qty = product_photos_qty;
    }

    public void setProduct_weight_g(int product_weight_g) {
        this.product_weight_g = product_weight_g;
    }

    public void setProduct_length_cm(int product_length_cm) {
        this.product_length_cm = product_length_cm;
    }

    public void setProduct_height_cm(int product_height_cm) {
        this.product_height_cm = product_height_cm;
    }

    public void setProduct_width_cm(int product_width_cm) {
        this.product_width_cm = product_width_cm;
    }




}


