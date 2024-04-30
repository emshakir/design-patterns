package com.learnings.design_patterns.factory.message_converters.product;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeaders() {
        // Add default headers
    }

    public void encrypt() {
        // Encrypt the content
    }
}
