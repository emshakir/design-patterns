package com.learnings.design_patterns.factory.XMLParsers;

import com.learnings.design_patterns.factory.XMLParsers.product.XMLParser;
import com.learnings.design_patterns.factory.XMLParsers.service.*;

public class Client {

    public static void main(String[] args) {
        printMessage(new ErrorXMLDisplayService());
        printMessage(new FeedbackXMLDisplayService());
        printMessage(new OrderXMLDisplayService());
        printMessage(new ResponseXMLDisplayService());
    }

    public static void printMessage(DisplayService displayService) {
        displayService.display();
    }
}
