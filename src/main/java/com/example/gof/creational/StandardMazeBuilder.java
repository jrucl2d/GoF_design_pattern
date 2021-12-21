package com.example.gof.creational;

public class StandardMazeBuilder implements MazeBuilder {
    private Maze currentMaze;
    private Direction commonWall(Room r1, Room r2) {
        return null;
    }

    public StandardMazeBuilder() {
        this.currentMaze = new Maze();
    }

    @Override
    public void buildMaze() {

    }

    @Override
    public void buildRoom(int n) {
        if (currentMaze.roomNo(n) == null)
            return;
        Room room = new Room(n);
        this.currentMaze.addRoom(room);

        room.setSide(Direction.NORTH, new Wall());
        room.setSide(Direction.SOUTH, new Wall());
        room.setSide(Direction.EAST, new Wall());
        room.setSide(Direction.WEST, new Wall());
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room r1 = this.currentMaze.roomNo(roomFrom);
        Room r2 = this.currentMaze.roomNo(roomTo);
        Door d = new Door(r1, r2);

        r1.setSide(Direction.SOUTH, d);
        r2.setSide(Direction.NORTH, d);
    }

    @Override
    public Maze getMaze() {
        return this.currentMaze;
    }
}
