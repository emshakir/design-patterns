package com.learnings.design_patterns.factory.message_converters.creator;

import com.learnings.design_patterns.factory.message_converters.product.Message;
import com.learnings.design_patterns.factory.message_converters.product.TextMessage;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
