package com.example.gof.creational;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    private final List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room roomNo(int no) {
        return rooms.stream()
                .filter(r -> r.getRoomNo() == no)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
