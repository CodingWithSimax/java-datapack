package de.simax_dev.datapack;

import de.simax_dev.datapack.configuration.DatapackConfiguration;
import de.simax_dev.datapack.dto.DatapackBlock;

public class Datapack {
    private final DatapackConfiguration configuration;

    public Datapack(DatapackConfiguration configuration) {
        this.configuration = configuration;
    }

    public DatapackConfiguration getConfiguration() {
        return this.configuration;
    }
}
