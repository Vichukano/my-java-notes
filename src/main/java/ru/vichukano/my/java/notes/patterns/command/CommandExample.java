package ru.vichukano.my.java.notes.patterns.command;

import ru.vichukano.my.java.notes.patterns.command.command.CheckTemperatureCommand;
import ru.vichukano.my.java.notes.patterns.command.command.IncreaseTemperatureCommand;
import ru.vichukano.my.java.notes.patterns.command.command.SwitchOffCommand;
import ru.vichukano.my.java.notes.patterns.command.command.SwitchOnCommand;
import ru.vichukano.my.java.notes.patterns.command.controller.HeaterController;
import ru.vichukano.my.java.notes.patterns.command.target.Heater;
import java.util.List;

public class CommandExample {

    void show() {
        var heater = new Heater(100);
        var controller = new HeaterController(List.of(
            new SwitchOnCommand(heater),
            new CheckTemperatureCommand(heater),
            new IncreaseTemperatureCommand(heater, 200),
            new SwitchOffCommand(heater)
        ));
        controller.manageHeater();
    }

}
