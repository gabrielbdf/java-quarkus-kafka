package io.kerno.consumers;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.kerno.dto.ResourceDto;
import io.smallrye.mutiny.Uni;
import io.smallrye.mutiny.infrastructure.Infrastructure;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MessageConsumer {

    @Incoming("k8s-resources")
    public void consume(String message) {
        try {
            ResourceDto resource = new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                    .readerFor(ResourceDto.class).readValue(message);
            Uni.createFrom().item(resource)
                    .runSubscriptionOn(Infrastructure.getDefaultWorkerPool())
                    .subscribe().with(this::saveItem);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Transactional
    public void saveItem(ResourceDto resource) {
        try {
            resource.uid = resource.metadata.uid;
            resource.name = resource.metadata.name;
            resource.namespace = resource.metadata.namespace;
            if (resource.metadata.ownerReferences != null && resource.metadata.ownerReferences.size() > 0) {
                resource.parent = ResourceDto.findById(resource.metadata.ownerReferences.get(0).uid);
            }
            resource.persist();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
