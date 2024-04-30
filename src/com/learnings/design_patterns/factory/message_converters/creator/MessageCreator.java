package com.learnings.design_patterns.factory.message_converters.creator;

import com.learnings.design_patterns.factory.message_converters.product.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return message;
    }

    public abstract Message createMessage();
}
