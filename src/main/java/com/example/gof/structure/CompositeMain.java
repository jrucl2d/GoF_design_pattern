package com.example.gof.structure;

public class CompositeMain {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("PC Cabinet");
        Chassis chassis = new Chassis("PC Chassis");
        cabinet.add(chassis);

        Bus bus = new Bus("MCA Bus");
        bus.add(new Card("16Mbs Token Ring"));
        chassis.add(bus);
        chassis.add(new FloppyDisk("3.5bin Floppy"));
    }
    private static class Chassis extends CompositeEquipment {
        public Chassis(String name) {
            super(name);
        }
    }

    private static class Card extends CompositeEquipment {
        public Card(String name) {
            super(name);
        }
    }

    private static class Bus extends CompositeEquipment {
        public Bus(String name) {
            super(name);
        }
    }

    private static class Cabinet extends CompositeEquipment {
        public Cabinet(String name) {
            super(name);
        }
    }
}
