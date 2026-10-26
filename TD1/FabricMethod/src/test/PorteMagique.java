package test;

import maze.src.maze.door.Door;
import maze.src.maze.room.Room;

public class PorteMagique extends Door {

    public PorteMagique(Room room1, Room room2) {
        super(room1, room2);
    }

    public PorteMagique(Room room1, Room room2, Boolean isOpen) {
        super(room1, room2, isOpen);
    }

    public String toString(){
        return "Porte Magique\n" + super.toString();
    }

}
