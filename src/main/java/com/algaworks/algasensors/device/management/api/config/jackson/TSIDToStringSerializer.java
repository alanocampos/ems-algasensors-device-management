package com.algaworks.algasensors.device.management.api.config.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import io.hypersistence.tsid.TSID;

public class TSIDToStringSerializer extends JsonSerializer<TSID> {

    @Override
    public void serialize(TSID value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

        if (value == null) {
            gen.writeNull();
        } else {
            gen.writeString(value.toString());
        }
    }
}
