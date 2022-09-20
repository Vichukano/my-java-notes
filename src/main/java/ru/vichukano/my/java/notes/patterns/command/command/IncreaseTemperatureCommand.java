package ru.vichukano.my.java.notes.patterns.command.command;

import ru.vichukano.my.java.notes.patterns.command.target.Heater;

public record IncreaseTemperatureCommand(Heater heater, int toIncrease) implements Command {

    @Override
    public void execute() {
        heater.temperatureUp(toIncrease);
    }
}
