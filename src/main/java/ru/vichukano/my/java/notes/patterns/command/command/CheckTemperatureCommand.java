package ru.vichukano.my.java.notes.patterns.command.command;


import ru.vichukano.my.java.notes.patterns.command.target.Heater;

public record CheckTemperatureCommand(Heater heater) implements Command {

    @Override
    public void execute() {
        heater.checkTemperature();
    }
}
