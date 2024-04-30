package com.learnings.design_patterns.factory.message_converters.product;

public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"name\":\"Mohammad Shakir\"}";
    }
}
