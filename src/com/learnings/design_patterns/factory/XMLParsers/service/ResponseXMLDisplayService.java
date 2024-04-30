package com.learnings.design_patterns.factory.XMLParsers.service;

import com.learnings.design_patterns.factory.XMLParsers.product.ResponseXMLParser;
import com.learnings.design_patterns.factory.XMLParsers.product.XMLParser;

public class ResponseXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new ResponseXMLParser();
    }
}
