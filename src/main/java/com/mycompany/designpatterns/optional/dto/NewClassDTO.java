
package com.mycompany.designpatterns.optional.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NewClassDTO {

    private String foo;
    private Integer id;
    private List<PropDTO> props = new ArrayList<PropDTO>();

    public Optional<String> getFoo() {
        return Optional.ofNullable(foo);
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public NewClassDTO withFoo(String foo) {
        this.foo = foo;
        return this;
    }

    public Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NewClassDTO withId(Integer id) {
        this.id = id;
        return this;
    }

    public Optional<List<PropDTO>> getProps() {
        return Optional.ofNullable(props);
    }

    public void setProps(List<PropDTO> props) {
        this.props = props;
    }

    public NewClassDTO withProps(List<PropDTO> props) {
        this.props = props;
        return this;
    }

}
