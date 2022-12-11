package de.simax_dev.datapack_test;

import de.simax_dev.datapack.Datapack;
import de.simax_dev.datapack.configuration.DatapackConfiguration;

public class Main {
    public static void main(String[] args) {
        DatapackConfiguration datapackConfiguration = new DatapackConfiguration()
                .name("simax_datapack");

        Datapack datapack = new Datapack(datapackConfiguration);
    }
}