package com.example.gof;

public class Room implements MapSite {
    private final int roomNo;
    private final MapSite[] sides = new MapSite[4];

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public void enter() {

    }

    public MapSite[] getSides() {
        return sides;
    }

    public void setSide(Direction direction, MapSite mapSite) {

    }
}
