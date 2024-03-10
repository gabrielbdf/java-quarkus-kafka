package io.kerno.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MetadataDto {

    public Date creationTimestamp;
    public int generation;
    public Labels labels;
    public String name;
    public String namespace;
    public String resourceVersion;
    public String uid;
    public AnnotationsDto annotations;
    public ArrayList<String> finalizers;
    public ArrayList<OwnerReference> ownerReferences;
    public String generateName;

    public static class Labels {
        public String app;
        public String name;
        public Map<String, Object> fields = new HashMap<>();

        @JsonAnySetter
        public void set(String name, Object value) {
            fields.put(name, value);
        }

        public Object get(String name) {
            return fields.get(name);
        }

    }

    @JsonInclude(Include.NON_NULL)
    public static class OwnerReference {
        public String apiVersion;
        public boolean blockOwnerDeletion;
        public boolean controller;
        public String kind;
        public String name;
        public String uid;

    }
}
