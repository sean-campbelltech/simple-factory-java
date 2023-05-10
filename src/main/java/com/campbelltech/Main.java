package com.campbelltech;


import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            Payment payment = PaymentFactory.create(PaymentMethod.APPLE_PAY);
            payment.pay(new BigDecimal("1000.00"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}