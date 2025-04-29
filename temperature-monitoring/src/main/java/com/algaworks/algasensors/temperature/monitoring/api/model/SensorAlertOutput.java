package com.algaworks.algasensors.temperature.monitoring.api.model;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SensorAlertOutput {

    @Id
    private TSID id;
    private Double maxTemperature;
    private Double minTemperature;
}
