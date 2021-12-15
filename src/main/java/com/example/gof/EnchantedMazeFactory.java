package com.example.gof;

public class EnchantedMazeFactory extends MazeFactory {
    @Override
    protected Maze makeMaze() {
        return super.makeMaze();
    }

    @Override
    protected Wall makeWall() {
        return super.makeWall();
    }

    @Override
    protected Room makeRoom(int n) {
        return new EnchantedRoom(n, "spell");
    }

    @Override
    protected Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    private static class EnchantedRoom extends Room {
        private final String spell;
        public EnchantedRoom(int roomNo, String spell) {
            super(roomNo);
            this.spell = spell;
        }
    }

    private static class DoorNeedingSpell extends Door {
        public DoorNeedingSpell(Room room1, Room room2) {
            super(room1, room2);
        }
    }
}
