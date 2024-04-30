package com.learnings.design_patterns.factory.XMLParsers.service;

import com.learnings.design_patterns.factory.XMLParsers.product.XMLParser;

public abstract class DisplayService {

    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
