package de.simax_dev.datapack.dto;

public class DatapackExecution {
    private String command = null;
    private DatapackBlock datapackBlock = null;

    public DatapackExecution(String command) {
        this.command = command;
    }
    public DatapackExecution(DatapackBlock datapackBlock) {
        this.datapackBlock = datapackBlock;
    }

    public boolean isCommand() {
        return this.command != null;
    }
    public String getCommand() {
        return this.command;
    }

    public boolean isDatapackBlock() {
        return this.datapackBlock != null;
    }
    public DatapackBlock getDatapackBlock() {
        return this.datapackBlock;
    }
}
