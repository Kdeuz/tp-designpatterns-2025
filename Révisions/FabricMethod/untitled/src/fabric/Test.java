package fabric;

import fabric.door.MagicDoor;
import fabric.room.EnchantedRoom;
import fabric.room.MinedRoom;
import fabric.wall.CrackedWall;
import maze.Maze;
import maze.room.Room;

public class Test {
    public static void main(String[] args) {
        Maze maze = new Maze();
        Maze enchantedMaze = new Maze();
        Maze minedMaze = new Maze();

        maze.room.Room room1 = new maze.room.Room(1);
        maze.room.Room room2 = new maze.room.Room(2);
        maze.door.Door door = new maze.door.Door(room1, room2);

        room1.setSide(Room.Direction.NORTH, new maze.wall.Wall());
        room1.setSide(Room.Direction.EAST, door);
        room1.setSide(Room.Direction.SOUTH, new maze.wall.Wall());
        room1.setSide(Room.Direction.WEST, new maze.wall.Wall());

        room2.setSide(Room.Direction.WEST, door);
        room2.setSide(Room.Direction.NORTH, new maze.wall.Wall());
        room2.setSide(Room.Direction.EAST, new maze.wall.Wall());
        room2.setSide(Room.Direction.SOUTH, new maze.wall.Wall());

        maze.addRoom(room1);
        maze.addRoom(room2);

        EnchantedRoom magicRoom1 = new EnchantedRoom(1);
        EnchantedRoom magicRoom2 = new EnchantedRoom(2);
        MagicDoor magicDoor = new MagicDoor(magicRoom1, magicRoom2);

        magicRoom1.setSide(Room.Direction.NORTH, new maze.wall.Wall());
        magicRoom1.setSide(Room.Direction.EAST, magicDoor);
        magicRoom1.setSide(Room.Direction.SOUTH, new maze.wall.Wall());
        magicRoom1.setSide(Room.Direction.WEST, new maze.wall.Wall());

        magicRoom2.setSide(Room.Direction.WEST, magicDoor);
        magicRoom2.setSide(Room.Direction.NORTH, new maze.wall.Wall());
        magicRoom2.setSide(Room.Direction.EAST, new maze.wall.Wall());
        magicRoom2.setSide(Room.Direction.SOUTH, new maze.wall.Wall());

        enchantedMaze.addRoom(magicRoom1);
        enchantedMaze.addRoom(magicRoom2);

        MinedRoom minedRoom1 = new MinedRoom(1);
        MinedRoom minedRoom2 = new MinedRoom(2);
        maze.door.Door minedDoor = new maze.door.Door(minedRoom1, minedRoom2);

        minedRoom1.setSide(Room.Direction.NORTH, new CrackedWall());
        minedRoom1.setSide(Room.Direction.EAST, minedDoor);
        minedRoom1.setSide(Room.Direction.SOUTH, new CrackedWall());
        minedRoom1.setSide(Room.Direction.WEST, new CrackedWall());

        minedRoom2.setSide(Room.Direction.WEST, minedDoor);
        minedRoom2.setSide(Room.Direction.NORTH, new CrackedWall());
        minedRoom2.setSide(Room.Direction.EAST, new CrackedWall());
        minedRoom2.setSide(Room.Direction.SOUTH, new CrackedWall());

        minedMaze.addRoom(minedRoom1);
        minedMaze.addRoom(minedRoom2);

    }
}
//Les inconvénients sont que le code est redondant et on risque de facilement faire des erreurs lors de la réplication du code
//Et maintenance difficile