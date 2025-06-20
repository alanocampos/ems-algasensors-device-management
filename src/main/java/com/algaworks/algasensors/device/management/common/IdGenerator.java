package com.algaworks.algasensors.device.management.common;

import java.util.Optional;

import io.hypersistence.tsid.TSID;
import io.hypersistence.tsid.TSID.Factory;

public class IdGenerator {

    private static final Factory build;

    static {

        Optional.ofNullable(System.getenv("tsid.node")).ifPresent(tsidNode -> System.setProperty("tsid.node", tsidNode));

        Optional.ofNullable(System.getenv("tsid.node.count")).ifPresent(tsidNodeCount -> System.setProperty("tsid.node.count", tsidNodeCount));

        build = Factory.builder().build();


    }
    private IdGenerator() {

    }

    public static TSID generateTSID() {

        return build.generate();
    }

}
