package com.company;


import java.sql.*;
import java.util.*;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws NoSuchElementException, SQLException {
	// write your code here
        String connectionUrl = "jdbc:postgresql://localhost:5432/java";
        Connection con;
        ResultSet rs;
        Statement stmt;
        Database database = new Database();
        con = DriverManager.getConnection(connectionUrl, "postgres", "123");
        stmt = con.createStatement();



        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while (cont){
            System.out.println("---------------- Main Menu----------------");
            System.out.println("-----------------");
            System.out.println("1.Top 10 Product");
            System.out.println("2.To show the number of product orders purchased based on the states.");
            System.out.println("3.Show report based on age");
            System.out.println("4.Back to main menu");
            System.out.println("----------------------------");
            int choice1 = Console.validateInt("Selection (number): ", 1, 4);
            switch (choice1) {
                case 1 -> {
                    rs = stmt.executeQuery("SELECT  products.product_category_name, COUNT(*) FROM items, orders, products \n" +
                            " where  items.order_id=orders.order_id and products.product_id = items.product_id \n" +
                            "GROUP BY product_category_name ORDER BY COUNT(*) DESC limit 10;");
                    System.out.println("Top 10 Product");
                    System.out.println("---------------------------------");
                    System.out.println("Product name:                  "+"The number of orders: ");
                    while (rs.next()){

                        System.out.println( "               " + rs.getString("product_category_name" )+ "                  " + rs.getInt("count"));
                    }
                }
                case 2 -> {
                    rs = stmt.executeQuery("SELECT  customers.customer_state, COUNT(*) FROM customers, orders\n" +
                            "where customers.customer_id=orders.customer_id\n" +
                            "GROUP BY customers.customer_state ORDER BY COUNT(*) DESC");
                    System.out.println("Geo Exploratory");
                    System.out.println("---------------------------------");
                    System.out.println("State name:                  "+"The number of orders: ");
                    while (rs.next()){

                        System.out.println( "               " + rs.getString("customer_state" )+ "                  " + rs.getInt("count"));
                    }
                        }

                case 3 -> {
                    rs = stmt.executeQuery("select price, freight_value from items;");
                    System.out.println("Geo Exploratory");
                    System.out.println("---------------------------------");
                    System.out.println("State name:                  "+"The number of orders: ");
                   Double sum1 = 0.0, sum2 = 0.0;
                    while (rs.next()){
                        String price = "12.23";
                        double d1, d2;
                        d1 = Double.parseDouble(rs.getString("price" ));
                        d2 = Double.parseDouble(rs.getString("freight_value" ));
                        sum1 += d1;
                        sum2 += d2;
                        System.out.println(d1);
                    }
                    System.out.println(sum1+ " " +sum2);

                }
                //End loop and go back to the program main menu
                case 4 -> cont = false;
            }
        }




    }
    }

