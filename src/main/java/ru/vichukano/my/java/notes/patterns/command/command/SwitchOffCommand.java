package ru.vichukano.my.java.notes.patterns.command.command;

import ru.vichukano.my.java.notes.patterns.command.target.Heater;

public record SwitchOffCommand(Heater heater) implements Command {

    @Override
    public void execute() {
        heater.off();
    }
}
