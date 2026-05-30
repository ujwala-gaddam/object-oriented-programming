package com.java.oops.collection;

import com.java.oops.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    static void main() {

        List<Customer> customers = new ArrayList<>();

        // builder design pattern
        // replace void in settors with class name and return this

        Customer customer0 = new Customer();
        customer0.setId(1111)
                .setName("ujwala")
                .setAddress("hyderabad")
                .setEmail("ac@123")
                .setPhoneNo("123456");


        Customer customer1 = new Customer();
        customer1.setId(2222)
                .setName("ujju")
                .setAddress("hyd")
                .setEmail("ad@456")
                .setPhoneNo("456123");


        Customer customer2 = new Customer();
        customer2.setId(3333)
                .setName("venky")
                .setAddress("hyderabad")
                .setEmail("ae@000")
                .setPhoneNo("123");


        Customer customer3 = new Customer();
        customer3.setId(4444)
                .setName("ujwala")
                .setAddress("hyderabad")
                .setEmail("aa@123")
                .setPhoneNo("123456");

        customers.add(customer0);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
       System.out.println(customers.size());
        System.out.println(customers);
        System.out.println(customers.get(0));

        for(Customer customer :customers){
            System.out.println(customer.getEmail());
        }



    }
}
