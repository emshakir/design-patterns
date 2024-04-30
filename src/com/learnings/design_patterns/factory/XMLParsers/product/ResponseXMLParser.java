package com.learnings.design_patterns.factory.XMLParsers.product;

public class ResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";
    }
}
