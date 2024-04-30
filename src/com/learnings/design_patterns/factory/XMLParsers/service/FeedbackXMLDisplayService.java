package com.learnings.design_patterns.factory.XMLParsers.service;

import com.learnings.design_patterns.factory.XMLParsers.product.FeedbackXML;
import com.learnings.design_patterns.factory.XMLParsers.product.XMLParser;

public class FeedbackXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new FeedbackXML();
    }
}
