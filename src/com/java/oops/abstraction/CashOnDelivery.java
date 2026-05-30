package com.java.oops.abstraction;

public class CashOnDelivery extends Payment {
    public CashOnDelivery(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount) {
        super.paymentDetails();
        System.out.println("payment done successfully"+amount);
        return true;
    }
}
