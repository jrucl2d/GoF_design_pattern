package com.example.gof;

public class MazePrototypeFactory extends MazeFactory {
    private final Maze prototypeMaze;
    private final Wall prototypeWall;
    private final Room prototypeRoom;
    private final Door prototypeDoor;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        super();
        this.prototypeMaze = maze;
        this.prototypeWall = wall;
        this.prototypeRoom = room;
        this.prototypeDoor = door;
    }

    public Wall makeWall() {
        return prototypeWall.clone();
    }
    public Door makeDoor(Room r1, Room r2) {
        Door door = prototypeDoor.clone();
        door.initialize(r1, r2);
        return door;
    }
}
