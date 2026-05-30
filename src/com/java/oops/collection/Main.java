package com.java.oops.collection;

import com.java.oops.collection.model.Customer;

public class Main {
    static void main() {
        Customer customer = new Customer();
        customer.setId(1111);
        customer.setName("ujwala");
        customer.setAddress("hyderabad");
        customer.setEmail("abc@123");
        customer.setPhoneNo("123456");

        System.out.println("id :"+ customer.getId());
        System.out.println("name:"+customer.getName());
        System.out.println("email"+customer.getEmail());
        System.out.println("PhoneNo"+customer.getPhoneNo());
        System.out.println("address"+customer.getAddress());


        //reference variable or object print
        //System.out.println(customer);
        //output classtype@hashcode
        //com.java.oops.collection.model.Customer@2a84aee7
        // to avoid this need to overide to string
        System.out.println(customer);

    }
}
