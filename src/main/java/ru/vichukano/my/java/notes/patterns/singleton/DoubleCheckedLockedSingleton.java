package ru.vichukano.my.java.notes.patterns.singleton;

public class DoubleCheckedLockedSingleton {
    private static volatile DoubleCheckedLockedSingleton instance;
    private String info;

    private DoubleCheckedLockedSingleton(String info) {
        this.info = info;
    }

    public static DoubleCheckedLockedSingleton getInstance() {
        DoubleCheckedLockedSingleton local = instance;
        if (local == null) {
            synchronized (DoubleCheckedLockedSingleton.class) {
                local = instance;
                if (local == null) {
                    instance = local = new DoubleCheckedLockedSingleton("Thread safe singleton");
                }
            }
        }
        return local;
    }

    public String getInfo() {
        return info;
    }
}
