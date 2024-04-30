package com.learnings.design_patterns.factory.message_converters.product;

public class TextMessage extends Message {
    @Override
    public String getContent() {
        return "Text product";
    }
}
