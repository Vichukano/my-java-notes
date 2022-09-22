package ru.vichukano.my.java.notes.patterns.singleton;

public class ClassicSingleton {
    private static ClassicSingleton INSTANCE;
    private final String info;

    private ClassicSingleton(String info) {
        this.info = info;
    }

    public static ClassicSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassicSingleton("non thread safe");
        }
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }
}
