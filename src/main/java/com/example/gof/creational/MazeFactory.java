package com.example.gof.creational;

public abstract class MazeFactory {
    protected Maze makeMaze() {
        return new Maze();
    }

    protected Wall makeWall() {
        return new Wall();
    }

    protected Room makeRoom(int n) {
        return new Room(n);
    }

    protected Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
