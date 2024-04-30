package com.learnings.design_patterns.factory.XMLParsers.service;

import com.learnings.design_patterns.factory.XMLParsers.product.OrderXMLParser;
import com.learnings.design_patterns.factory.XMLParsers.product.XMLParser;

public class OrderXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new OrderXMLParser();
    }
}
