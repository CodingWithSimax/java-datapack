package de.simax_dev.datapack.dto;

import java.util.ArrayList;
import java.util.List;

public abstract class DatapackBlock {
    private final List<String> commands = new ArrayList<>();
    private String base = null;

    public DatapackBlock() { }
    public DatapackBlock(String base) {
        this.base = base;
    }

    public void addCommand(String command) {
        this.commands.add(base == null ? command : (base + " " + command));
    }

    public void addBlock(DatapackBlock block) {
        this.commands.addAll(block.getCommands());
    }

    public List<String> getCommands() {
        return this.commands;
    }
    public void clearCommands() {
        this.commands.clear();
    }
}
