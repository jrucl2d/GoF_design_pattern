package com.example.gof.structure;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private Map<java.lang.Character, Character> characters;
    public GlyphFactory() {
        characters = new HashMap<>();
    }
    public Character createCharacter(char c) {
        if (characters.containsKey(c)) {
            return characters.get(c);
        }
        Character character = new Character(c);
        characters.put(c, character);
        return character;
    }
    public Row createRow() {
        return new Row();
    }
    public Column createColumn() {
        return new Column();
    }

    public static class Row {}
    public static class Column {}
}
