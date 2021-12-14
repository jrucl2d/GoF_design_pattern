package com.example.gof;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    private final List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room roomNo(int no) {
        return rooms.get(no);
    }
}
