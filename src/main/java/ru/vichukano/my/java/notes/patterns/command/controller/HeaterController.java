package ru.vichukano.my.java.notes.patterns.command.controller;

import ru.vichukano.my.java.notes.patterns.command.command.Command;
import java.util.List;

public class HeaterController {
    private final List<Command> commands;


    public HeaterController(List<Command> commands) {
        this.commands = commands;
    }

    public void manageHeater() {
        commands.forEach(Command::execute);
    }
}
