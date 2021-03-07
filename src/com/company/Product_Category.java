package com.company;

public class Product_Category {
    private String product_category_name;
    private String product_category_name_english;

    public Product_Category(){

    }

    public Product_Category(String product_category_name, String product_category_name_english) {
        this.product_category_name = product_category_name;
        this.product_category_name_english = product_category_name_english;
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public void setProduct_category_name(String product_category_name) {
        this.product_category_name = product_category_name;
    }

    public String getProduct_category_name_english() {
        return product_category_name_english;
    }

    public void setProduct_category_name_english(String product_category_name_english) {
        this.product_category_name_english = product_category_name_english;
    }


}
