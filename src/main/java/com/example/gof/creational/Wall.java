package com.example.gof.creational;

public class Wall implements MapSite {
    private Boolean bomb;

    public Wall() {
        this.bomb = false;
    }

    public Wall(Boolean bomb) {
        this.bomb = bomb;
    }

    @Override
    public void enter() {

    }

    public Wall clone() {
        return new Wall();
    }
}
