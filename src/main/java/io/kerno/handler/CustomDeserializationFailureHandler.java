package io.kerno.handler;

import org.apache.kafka.common.header.Headers;

import io.kerno.dto.MetadataDto;
import io.smallrye.common.annotation.Identifier;
import io.smallrye.reactive.messaging.kafka.DeserializationFailureHandler;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
@Identifier("failure-fallback") 
public class CustomDeserializationFailureHandler implements DeserializationFailureHandler<MetadataDto> {
    
    @Override
    public MetadataDto handleDeserializationFailure(String topic, boolean isKey, String deserializer, byte[] data,
    Exception exception, Headers headers) {

        return null;
    }
}
