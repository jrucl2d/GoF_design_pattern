package com.example.gof.structure;

import java.util.Iterator;

public class FloppyDisk extends Equipment {
    public FloppyDisk(String name) {
        super(name);
    }

    @Override
    protected Watt power() {
        return null;
    }

    @Override
    protected int netPrice() {
        return 0;
    }

    @Override
    protected int discountPrice() {
        return 0;
    }

    @Override
    protected void add(Equipment equipment) {

    }

    @Override
    protected void remove(Equipment equipment) {

    }

    @Override
    protected Iterator<Equipment> createIterator() {
        return null;
    }
}
