package com.algaworks.algasensors.device.management.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algasensors.device.management.domain.model.Sensor;
import com.algaworks.algasensors.device.management.domain.model.SensorId;

public interface SensorRepository extends JpaRepository<Sensor, SensorId> {

    // Additional query methods can be defined here if needed

}
