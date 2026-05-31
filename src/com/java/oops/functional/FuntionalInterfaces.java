package com.java.oops.functional;
import com.java.oops.model.Customer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FuntionalInterfaces {
    static void main() {
        //Predicate
        Predicate<String >length=(str)->str.length()>=5&&str.length()<=10;
        System.out.println(length.test("ujwala"));
        Customer customer =new Customer();
        customer.setName("ujwala")
                .setId(1111)
                .setAddress("hyderabad")
                .setEmail("ac@123")
                .setPhoneNo("143225143")
                .setPhoneNo("123456");
        Consumer<Customer> printCustomer =(customer1)-> {
            System.out.println("id :"+ customer.getId());
            System.out.println("name:"+customer.getName());
            System.out.println("email"+customer.getEmail());
            System.out.println("PhoneNo:"+customer.getPhoneNo());
            System.out.println("address:"+customer.getAddress());

        };
        printCustomer.accept(customer);
    }
}
