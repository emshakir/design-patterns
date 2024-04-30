package com.learnings.design_patterns.factory.XMLParsers.service;

import com.learnings.design_patterns.factory.XMLParsers.product.ErrorXMLParser;
import com.learnings.design_patterns.factory.XMLParsers.product.XMLParser;

public class ErrorXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new ErrorXMLParser();
    }
}
