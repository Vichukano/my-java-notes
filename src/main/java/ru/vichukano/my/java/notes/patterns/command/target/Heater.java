package ru.vichukano.my.java.notes.patterns.command.target;

public class Heater {
    private int temperature;

    public Heater(int temperature) {
        this.temperature = temperature;
    }

    public void on() {
        System.out.println("Heater ON");
    }

    public void off() {
        System.out.println("Heater OFF");
    }

    public void checkTemperature() {
        System.out.println("Temperature is: " + temperature);
    }

    public void temperatureUp(int up) {
        temperature += up;
        System.out.println("New temperature: " + temperature);
    }
}
