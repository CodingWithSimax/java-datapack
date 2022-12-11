package de.simax_dev.datapack.dto;

import java.util.ArrayList;
import java.util.List;

public class DatapackBlock {
    private final List<DatapackExecution> commands = new ArrayList<>();
    private String base = null;

    public DatapackBlock() { }
    public DatapackBlock(String base) {
        this.base = base;
    }

    public void addCommand(String command) {
        this.commands.add(new DatapackExecution(command));
    }
    public void addBlock(DatapackBlock block) {
        this.commands.add(new DatapackExecution(block));
    }

    public List<String> loadCommands() {
        List<String> result = new ArrayList<>();

        this.commands.forEach(command -> {
            if (command.isCommand()) {
                result.add(command.getCommand());
            } else if (command.isDatapackBlock()) {
                result.addAll(command.getDatapackBlock().loadCommands());
            }
        });

        return result;
    }
}
