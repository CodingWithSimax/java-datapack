package de.simax_dev.datapack.dto;

import java.util.List;

public class DatapackFunction extends DatapackBlock {
    public void main() { }
    public void load() { }

    public List<String> getCommands() {
        super.clearCommands();
        this.load();
        super.clearCommands();
        this.main();
    }
}
