package com.algaworks.algasensors.device.management.api.config.web;

import org.springframework.core.convert.converter.Converter;

import io.hypersistence.tsid.TSID;

public class StringToTSIDWebConverter implements Converter<String, TSID> {

    @Override
    public TSID convert(String source) {
        return TSID.from(source);
    }

}
