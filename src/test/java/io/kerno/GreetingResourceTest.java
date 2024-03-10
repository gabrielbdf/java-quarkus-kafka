
package io.kerno;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.kerno.dto.ResourceDto;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.internal.support.FileReader;
import jakarta.transaction.Transactional;

@QuarkusTest
public class GreetingResourceTest {

    /*
     * @Test
     * 
     * @Transactional
     * public void saveAll() throws JsonMappingException, JsonProcessingException {
     * String[] message = FileReader.readToString(new
     * File("/Users/Shared/work-dev/challenge/messages"), "UTF-8")
     * .split("\n");
     * for (int i = 0; i < message.length; i++) {
     * ResourceDto resource = new
     * ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
     * .readerFor(ResourceDto.class).readValue(message[i]);
     * resource.persist();
     * }
     * }
     */

}
