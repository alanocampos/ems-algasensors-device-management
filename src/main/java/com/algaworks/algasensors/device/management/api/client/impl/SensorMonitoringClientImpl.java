package com.algaworks.algasensors.device.management.api.client.impl;

import org.springframework.web.client.RestClient;

import com.algaworks.algasensors.device.management.api.client.RestClientFactory;
import com.algaworks.algasensors.device.management.api.client.SensorMonitoringClient;
import com.algaworks.algasensors.device.management.api.model.SensorMonitoringOutput;

import io.hypersistence.tsid.TSID;

// @Component comentado para utilizar client declarativo com HTTP Interfaces
public class SensorMonitoringClientImpl implements SensorMonitoringClient {

    private final RestClient restClient;

    public SensorMonitoringClientImpl(RestClientFactory factory) {

        this.restClient = factory.temperatureMonitoringRestClient();
    }

    @Override
    public void enableaMonitoring(TSID sensorId) {

        restClient
                .put()
                .uri("/api/sensors/{sensorId}/monitoring/enable", sensorId)
                .retrieve().
                toBodilessEntity();
    }

    @Override
    public void disableMonitoring(TSID sensorId) {

        restClient
                .delete()
                .uri("/api/sensors/{sensorId}/monitoring/enable", sensorId)
                .retrieve()
                .toBodilessEntity();
    }

    @Override
    public SensorMonitoringOutput getDetails(TSID sensorId) {

        return restClient
                .get()
                .uri("/api/sensors/{sensorId}/monitoring", sensorId)
                .retrieve()
                .body(SensorMonitoringOutput.class);
    }
}
