package fabric.door;

import maze.room.Room;

public class MagicDoor extends maze.door.Door {

    public MagicDoor(Room room1, Room room2, boolean isOpen) {
        super(room1, room2, isOpen);
    }

    public MagicDoor(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    public String toString() {
        return "Porte Magique : \n" + super.toString();
    }
}
