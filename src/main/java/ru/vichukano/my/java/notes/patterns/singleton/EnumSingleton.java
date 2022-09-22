package ru.vichukano.my.java.notes.patterns.singleton;

public enum EnumSingleton {
    INSTANCE("Enum singleton");
    private final String info;

    EnumSingleton(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
