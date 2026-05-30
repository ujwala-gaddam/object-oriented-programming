package com.java.oops.abstraction;

public class OrderService {
    Payment payment;
    public OrderService(Payment payment){
        this.payment=payment;
    }

                        /* // this is tighly coupled there is a problem that defineity we have to change method name
                        public boolean processOrder(double amount){
                        Payment payment = new Payment() ;
                        payment.pay(amount);
                        return true;
                        }
                    public boolean processOrderCreditcard(double amount){
                    CreditCardPayment payment = new Payment() ;
                     return payment.pay(amount);
                         }
                        */
    public boolean processOrder(double amount){
        return payment.pay(amount);
    }


}
