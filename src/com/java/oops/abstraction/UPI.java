package com.java.oops.abstraction;

public class UPI extends Payment{

    public UPI(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount) {
        super.paymentDetails();
        System.out.println("payment done successfully"+amount);
        return true;
    }
}
