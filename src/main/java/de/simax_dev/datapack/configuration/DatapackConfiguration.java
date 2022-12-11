package de.simax_dev.datapack.configuration;

public class DatapackConfiguration {
    private String name = "test";

    public DatapackConfiguration name(String name) {
        this.name = name;
        return this;
    }
}
