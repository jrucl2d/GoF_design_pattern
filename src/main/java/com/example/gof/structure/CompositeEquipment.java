package com.example.gof.structure;

import java.util.Iterator;
import java.util.List;

public class CompositeEquipment extends Equipment {
    private List<Equipment> equipment;

    public CompositeEquipment(String name) {
        super(name);
    }

    @Override
    protected Watt power() {
        return null;
    }

    @Override
    protected int netPrice() {
        final Iterator<Equipment> iterator = createIterator();
        int total = 0;
        for (Equipment e : equipment) {
            total += e.netPrice();
        }
        return total;
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
