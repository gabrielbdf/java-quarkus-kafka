package io.kerno.entity;

import io.kerno.dto.MetadataDto;
import io.kerno.dto.SpecDto;
import io.kerno.usecase.AbstractWorkload;

public interface IWorkload<T extends AbstractWorkload> {

    T withMetadata(MetadataDto metadata);

    T withSpec(SpecDto spec);

    T apply();

}