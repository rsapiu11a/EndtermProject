package com.company;
import java.util.*;
public class Database {
    private List<Customer> customers = new ArrayList<>();
    private List<Item> items = new ArrayList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public Customer getCustomers(){return customers.get(0);}


    public void addItem(Item item){items.add(item);}

    public List<Item> getItems(){return items;}


}
