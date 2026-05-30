package com.java.oops.abstraction;

public class DebitCard  extends Payment{

    public DebitCard(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount) {
        super.paymentDetails();
        System.out.println("payment done Successfully"+ amount);
        return true;
    }
}
