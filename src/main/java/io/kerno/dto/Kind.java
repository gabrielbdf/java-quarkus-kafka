package io.kerno.dto;

import io.kerno.usecase.AbstractWorkload;
import io.kerno.usecase.ConfigMap;
import io.kerno.usecase.Deployment;
import io.kerno.usecase.Ingress;
import io.kerno.usecase.Pod;
import io.kerno.usecase.ReplicaSet;
import io.kerno.usecase.Service;
import io.kerno.usecase.StatefulSet;

public enum Kind {
    Deployment("Deployment", Deployment.class),
    StatefulSet("StatefulSet", StatefulSet.class),
    ReplicaSet("ReplicaSet", ReplicaSet.class),
    Service("Service", Service.class),
    Pod("Pod", Pod.class),
    ConfigMap("ConfigMap", ConfigMap.class),
    Ingress("Ingress", Ingress.class);

    private String kind;
    private Class<? extends AbstractWorkload> typeClass;

    Kind(String kind) {
        this.kind = kind;
    }

    <T extends AbstractWorkload> Kind(String kind, Class<T> typeClass) {
        this.kind = kind;
        this.typeClass = typeClass;
    }

    public String getKind() {
        return this.kind;
    }

    public Class<? extends AbstractWorkload> getTypeClass() {
        return this.typeClass;
    }

}
