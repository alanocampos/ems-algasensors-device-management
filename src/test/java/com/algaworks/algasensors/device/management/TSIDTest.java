package com.algaworks.algasensors.device.management;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.algaworks.algasensors.device.management.common.IdGenerator;

import io.hypersistence.tsid.TSID;

public class TSIDTest {

    @Test
    public void shouldGenerateTSID() {

        TSID tsid = IdGenerator.generateTSID();

        Assertions.assertThat(tsid.getInstant()).isCloseTo(Instant.now(), Assertions.within(1, ChronoUnit.MINUTES));
    }
}
