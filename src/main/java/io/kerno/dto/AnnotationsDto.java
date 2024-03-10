package io.kerno.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class AnnotationsDto {

    public Map<String, Object> fields = new HashMap<>();

    @JsonAnySetter
    public void set(String name, Object value) {
        fields.put(name, value);
    }

    public Object get(String name) {
        return fields.get(name);
    }

}
