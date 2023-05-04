
package com.mycompany.designpatterns.optional.dto;

import java.util.Optional;

public class PropDTO {

    private String entry;

    public Optional<String> getEntry() {
        return Optional.ofNullable(entry);
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public PropDTO withEntry(String entry) {
        this.entry = entry;
        return this;
    }

}
