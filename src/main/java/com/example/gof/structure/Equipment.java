package com.example.gof.structure;

import java.util.Iterator;

public abstract class Equipment {
    private String name;

    protected Equipment(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected abstract Watt power();
    protected abstract int netPrice();
    protected abstract int discountPrice();
    protected abstract void add(Equipment equipment);
    protected abstract void remove(Equipment equipment);
    protected abstract Iterator<Equipment> createIterator();

    public static class Watt {}
}
