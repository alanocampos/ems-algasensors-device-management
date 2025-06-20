package com.algaworks.algasensors.device.management.api.model;

import java.time.OffsetDateTime;

import io.hypersistence.tsid.TSID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorMonitoringOutput {

    private TSID id;

    private Double lastTemperature;

    private OffsetDateTime updatedAt;

    private Boolean enabled;
}
