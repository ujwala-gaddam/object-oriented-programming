package com.java.oops.abstraction;

import java.util.Scanner;

public class Main {
    static void main() {

        /*OrderService orderService = new OrderService();
        if(orderService.processOrder(10000))
            System.out.println("order processed successfully using cash ");
         if(orderService.processOrderCreditCard(34566)
       System.out.println("order processed successfully using CreditCard ");
         */
        Scanner sc =new Scanner(System.in);
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
                payment = new Creditcard("1","ujwala","24-05-2005","credit_card");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                System.out.println("Enter otp");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("order processed using creditcard");
                break;

            case 2:
                payment = new CashOnDelivery("2","ujwala","24-05-2005","CashOndelivery");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                System.out.println("Enter otp");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("order processed using CashOnDelivery");
                break;
            case 3:
                payment = new DebitCard("3","ujwala","24-05-2005","DebitCard");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                System.out.println("Enter otp");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("order processed using Debitcard");
                break;
            case 4:
                payment = new UPI("4","ujwala","24-05-2005","UPI");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = sc.nextDouble();
                System.out.println("Enter otp");
                otp = sc.nextInt();
                payment.otpValidation(otp);
                if(orderService.processOrder(amount))
                    System.out.println("order processed using UPI");
                break;
            default:
                System.out.println("invalid option ");
        }



    }
}
