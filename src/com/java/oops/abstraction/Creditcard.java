package com.java.oops.abstraction;

public class Creditcard extends Payment {


    public Creditcard(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount) {
     super.paymentDetails();
        System.out.println("payment done successfully"+amount);
        return true;
    }
}

