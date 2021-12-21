package com.example.gof.creational;

/**
 * MazeGame 내의 메소드들을 재정의
 */
public class BombedMazeGame extends MazeGame {
    @Override
    public Maze makeMaze() {
        return super.makeMaze();
    }

    @Override
    public Room makeRoom(int n) {
        return super.makeRoom(n * 100);
    }

    @Override
    public Wall makeWall() {
        return super.makeWall();
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return super.makeDoor(r1, r2);
    }
}
