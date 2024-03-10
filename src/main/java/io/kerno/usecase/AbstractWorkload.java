package io.kerno.usecase;

import io.kerno.dto.Kind;
import io.kerno.dto.MetadataDto;
import io.kerno.dto.SpecDto;
import io.kerno.entity.IWorkload;

public abstract class AbstractWorkload implements IWorkload<AbstractWorkload> {

    protected String uid;
    protected String name;
    protected String namespace;
    protected Kind kind;
    protected MetadataDto metadata;
    protected SpecDto spec;

    @Override
    public AbstractWorkload withMetadata(MetadataDto metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public AbstractWorkload withSpec(SpecDto spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public abstract AbstractWorkload apply();

}
