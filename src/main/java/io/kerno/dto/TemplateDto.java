package io.kerno.dto;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

public class TemplateDto {

    public MetadataDto metadata;

    @JdbcTypeCode(SqlTypes.JSON)
    public Map<String, Object> spec = new HashMap<>();

}
