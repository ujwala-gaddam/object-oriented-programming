package com.java.oops.comparator;

import com.java.oops.encapsulation.p1.C;
import com.java.oops.model.Customer;

import java.util.Comparator;

public class CustomerEmailDescComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.getEmail().compareTo(o1.getEmail());
    }
}
