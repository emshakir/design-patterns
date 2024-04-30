package com.learnings.design_patterns.factory.XMLParsers.product;

public class OrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing order XML...");
        return "Order XML Message";
    }
}
