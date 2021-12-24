package com.example.gof.structure;

public class Character extends Glyph {
    private char c;
    public Character(char c) {
        this.c = c;
    }

    @Override
    public void draw(Window window, GlyphContext context) {
        super.draw(window, context);
    }
}
