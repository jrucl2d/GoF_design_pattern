package com.example.gof;

interface MazeBuilder {
    void buildMaze();
    void buildRoom(int room);
    void buildDoor(int roomFrom, int roomTo);
    Maze getMaze();
}
