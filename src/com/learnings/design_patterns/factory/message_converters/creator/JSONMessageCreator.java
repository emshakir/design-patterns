package com.learnings.design_patterns.factory.message_converters.creator;

import com.learnings.design_patterns.factory.message_converters.product.JSONMessage;
import com.learnings.design_patterns.factory.message_converters.product.Message;

public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
