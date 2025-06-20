package com.algaworks.algasensors.device.management.api.config.jpa;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TSIDToLongJPAAttributeConverter implements AttributeConverter<TSID, Long> {

    @Override
    public Long convertToDatabaseColumn(TSID tsid) {
        if (tsid == null) {
            return null;
        }
        return tsid.toLong();
    }

    @Override
    public TSID convertToEntityAttribute(Long value) {
        if (value == null) {
            return null;
        }
        return TSID.from(value);
    }

}
