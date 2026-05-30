package com.java.oops.interfaces;

public class CashOnDelivery implements Payment{

    @Override
    public boolean pay(double amount) {
        Payment.validTrasanction(4, amount);
        System.out.println("payment done successfully"+ amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
