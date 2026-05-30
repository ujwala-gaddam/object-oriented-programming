package com.java.oops.collection;

import com.java.oops.comparator.CustomerIdAscComparator;
import com.java.oops.inheritance.Product;
import com.java.oops.model.Customer;

import java.util.*;

public class MapTest {
    static void main() {

        HashMap<Integer,Customer> customerMap = new HashMap <>();

        Customer customer1 = new Customer();
        customer1.setId(1111)
                .setName("ujwala")
                .setAddress("hyderabad")
                .setEmail("ac@123")
                .setPhoneNo("123456");


        Customer customer2 = new Customer();
        customer2.setId(2222)
                .setName("ujju")
                .setAddress("hyd")
                .setEmail("ad@456")
                .setPhoneNo("456123");


        Customer customer3 = new Customer();
        customer3.setId(3333)
                .setName("venky")
                .setAddress("hyderabad")
                .setEmail("ae@000")
                .setPhoneNo("123");


        Customer customer4 = new Customer();
        customer4.setId(4444)
                .setName("ujwala")
                .setAddress("hyderabad")
                .setEmail("aa@123")
                .setPhoneNo("123456");


      customerMap.put(customer1.getId(),customer1);
      customerMap.put(customer2.getId(),customer2);
      customerMap.put(customer3.getId(),customer3);
      customerMap.put(customer4.getId(),customer4);
        System.out.println(customerMap);
        System.out.println(customerMap.get(1111));
        System.out.println("---customer map elements");
        for(Integer id : customerMap.keySet()) {
            System.out.println(customerMap.get(id));
        }

        Set<Map.Entry<Integer, Customer>> entries = customerMap.entrySet();
        Iterator<Map.Entry<Integer,Customer>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,Customer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<Customer, List<Product>> customerProductMap = new TreeMap<>(new CustomerIdAscComparator());
    }

    /*public Map<String, List<Product>> getProductsByCategory(){
        //1000 products (id, name, price, category)
    }*/


}
