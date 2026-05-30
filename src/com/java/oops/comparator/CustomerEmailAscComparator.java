package com.java.oops.comparator;

import com.java.oops.model.Customer;

import java.util.Comparator;

public class CustomerEmailAscComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
