package com.example.gof;

public class App {
    public static void main(String[] args) {
        Maze game = MazeGame.createMaze(new EnchantedMazeFactory());
    }
}
