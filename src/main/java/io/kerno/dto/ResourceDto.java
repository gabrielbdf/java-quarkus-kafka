package io.kerno.dto;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "resources")
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceDto extends PanacheEntityBase {

    @Id
    public String uid;

    public String apiVersion;

    public Kind kind;

    public String name;

    public String namespace;

    @JdbcTypeCode(SqlTypes.JSON)
    public MetadataDto metadata;

    @JdbcTypeCode(SqlTypes.JSON)
    public SpecDto spec;

    @JdbcTypeCode(SqlTypes.JSON)
    public Map<String, Object> status = new HashMap<>();

    @JdbcTypeCode(SqlTypes.JSON)
    public Map<String, Object> data = new HashMap<>();

    @ManyToOne
    public ResourceDto parent;

}
