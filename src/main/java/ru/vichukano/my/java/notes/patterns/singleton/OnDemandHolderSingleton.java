package ru.vichukano.my.java.notes.patterns.singleton;

public class OnDemandHolderSingleton {
    private final String info;

    private OnDemandHolderSingleton(String info) {
        this.info = info;
    }

    public static OnDemandHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    private static class Holder {
        public static final OnDemandHolderSingleton INSTANCE = new OnDemandHolderSingleton("Thread safe singleton");
    }
}
