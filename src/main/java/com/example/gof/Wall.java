package com.example.gof;

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
