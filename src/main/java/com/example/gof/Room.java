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
        switch (direction) {
            case NORTH:
                sides[0] = mapSite;
            case EAST:
                sides[1] = mapSite;
            case SOUTH:
                sides[2] = mapSite;
            case WEST:
                sides[3] = mapSite;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int getRoomNo() {
        return roomNo;
    }
}
