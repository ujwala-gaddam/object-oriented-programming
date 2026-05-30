package com.java.oops.interfaces;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose your option");
        System.out.println("1.Cash");
        System.out.println("2.CreditCard");
        System.out.println("3.Debit Card");
        System.out.println("4.UPI");
        System.out.println("Enter Your Choice");
        int choice = sc.nextInt();
        OrderService orderService;
        Double amount;
        Payment payment;
        int otp;
        switch(choice){
            case 1:
                payment = new CreditCardPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                if(orderService.processOrder(amount))
                    System.out.println("order processed using creditcard");
                break;

            case 2:
                payment = new CashOnDelivery();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                if(orderService.processOrder(amount))
                    System.out.println("order processed using CashOnDelivery");
                break;
            case 3:
                payment = new DebitCardPayments();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                if(orderService.processOrder(amount))
                    System.out.println("order processed using Debitcard");
                break;
            case 4:
                payment = new UpiPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                if(orderService.processOrder(amount))
                    System.out.println("order processed using UPI");
                break;
            default:
                System.out.println("invalid option ");
        }



    }
}
