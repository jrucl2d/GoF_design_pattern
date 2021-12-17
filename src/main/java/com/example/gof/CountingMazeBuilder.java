package com.example.gof;

public class CountingMazeBuilder implements MazeBuilder {
    private int doors = 0;
    private int rooms = 0;

    @Override
    public void buildMaze() {

    }

    @Override
    public void buildRoom(int room) {
        this.rooms++;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        this.doors++;
    }

    @Override
    public Maze getMaze() {
        return null;
    }

    public int getCounts (int rooms, int doors) {
        this.rooms = rooms;
        this.doors = doors;
    }
}
