package com.java.oops.comparator;

import com.java.oops.model.Customer;

import java.util.Comparator;

public class CustomerIdDscComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return  c1.getId()- c2.getId();
    }
}
