package com.learnings.design_patterns.factory.message_converters;

import com.learnings.design_patterns.factory.message_converters.creator.JSONMessageCreator;
import com.learnings.design_patterns.factory.message_converters.creator.MessageCreator;
import com.learnings.design_patterns.factory.message_converters.creator.TextMessageCreator;
import com.learnings.design_patterns.factory.message_converters.product.Message;

public class Main {


    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message message = creator.getMessage();
        System.out.println(message.getContent());
    }


}
