package com.learnings.design_patterns.abstract_p.payment_adapter;

public class DriverClass {

    public static void main(String[] args) {

        // Instance for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);

        // Convert Xpay to PayD
        PayD payD = new XpayToPayDAdapter(xpay);

        // Test PayD
        print(payD);
    }

    public static void print(PayD payD) {
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }
}
