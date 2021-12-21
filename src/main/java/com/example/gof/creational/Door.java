package com.example.gof.creational;

public class Door implements MapSite {
    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    // 복사 기능의 생성자
    public Door(Door door) {
        this.room1 = door.room1;
        this.room2 = door.room2;
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

    public Door clone() {
        return new Door(this);
    }

    public void initialize(Room r1, Room r2) {
        this.room1 = r1;
        this.room2 = r2;
    }
}
