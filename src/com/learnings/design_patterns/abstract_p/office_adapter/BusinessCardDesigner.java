package com.learnings.design_patterns.abstract_p.office_adapter;

public class BusinessCardDesigner {

    public static String designCard(Customer customer) {
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
