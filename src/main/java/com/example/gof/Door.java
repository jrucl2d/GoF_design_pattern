package com.example.gof;

public class Door implements MapSite {
    private final Room room1;
    private final Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void enter() {

    }

    public Room otherSideFrom(Room room) {
        if (room == room1) {
            return room2;
        } else {
            return room1;
        }
    }
}
